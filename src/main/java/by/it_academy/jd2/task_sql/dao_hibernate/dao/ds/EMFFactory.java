package by.it_academy.jd2.task_sql.dao_hibernate.dao.ds;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EMFFactory {
    private static final EntityManagerFactory instance;

    static {
        instance =
                Persistence.createEntityManagerFactory("test");
    }

    public static EntityManagerFactory getInstance() {
        return instance;
    }
}
