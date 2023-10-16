package by.it_academy.jd2.task_sql.dao.ds;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;

public class DataSourceFactory {
    private static DataSourceFactory instance;
    private ComboPooledDataSource ds;

    private DataSourceFactory() {
        ds = new ComboPooledDataSource();
        try {
            ds.setDriverClass("org.postgresql.Driver"); //loads the jdbc driver
        } catch (PropertyVetoException e) {
            throw new IllegalStateException("Ошибка инициализации драйвера базы данных", e);
        }
        ds.setJdbcUrl("jdbc:postgresql://localhost:5432/demo");
        ds.setUser("postgres");
        ds.setPassword("1234");
    }

    public static ComboPooledDataSource getInstance() {
        if (instance == null) {
            synchronized (DataSourceFactory.class){
                instance = new DataSourceFactory();
            }
        }
        return instance.ds;
    }
}

