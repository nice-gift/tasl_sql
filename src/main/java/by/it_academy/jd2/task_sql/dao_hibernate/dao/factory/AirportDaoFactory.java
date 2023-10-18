package by.it_academy.jd2.task_sql.dao_hibernate.dao.factory;

import by.it_academy.jd2.task_sql.dao_hibernate.dao.AirportDao;
import by.it_academy.jd2.task_sql.dao_hibernate.dao.api.IAirportDao;
import by.it_academy.jd2.task_sql.dao_hibernate.dao.ds.EMFFactory;

public class AirportDaoFactory {
    private volatile static AirportDao instance;

    private AirportDaoFactory() {
    }

    public static IAirportDao getInstance() {
        if (instance == null) {
            synchronized (AirportDaoFactory.class) {
                if (instance == null) {
                    instance = new AirportDao(EMFFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
