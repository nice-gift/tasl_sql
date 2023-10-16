package by.it_academy.jd2.task_sql.core;

import java.sql.*;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
//        String URL = "jdbc:postgresql:/localhost:5432/demo";
        String URL = "jdbc:postgresql://localhost:5432/books_app2";
        Properties prop = new Properties();
        prop.setProperty("user", "postgres");
        prop.setProperty("password", "1234");
        Connection connection = DriverManager.getConnection(URL, prop);
        Statement st = connection.createStatement();

//        ResultSet rs = st.executeQuery("SELECT MAX(id) FROM books.books");

//        int max = -1;
//        while (rs.next()) {
//            max = rs.getInt(1);
//        }
        long start = System.currentTimeMillis();

        st.execute("BEGIN;");
        for (int i = 0; i < 100; i++) {
            UUID max= UUID.randomUUID();

            String sql = String.format("INSERT INTO books.books(id, name, author) " +
                    "VALUES ('%s', '%s', '%s') RETURNING *;", /**++max*/ max, " INSERT INTO books.books(id, name, author) \" +\n" +
                    "                    \"VALUES ('%s', '%s', '%s')", 2222222);
//            String sql = "INSERT INTO books.books(id, name, author) VALUES " +
//                    "(++max, 'Азбука', '1234') RETURNING *;";
            try {
                ResultSet resultSet = st.executeQuery(sql);
            } catch (SQLException e) {
                System.err.println("Откатываем назад");
                st.execute("ROLLBACK;");
                break;
            }
        }
        st.execute("COMMIT;");

        long stop = System.currentTimeMillis();
        System.out.println("Заняло " + (stop - start));
    }
}
