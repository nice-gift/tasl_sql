package by.it_academy.jd2.task_sql.dao.factory;

import by.it_academy.jd2.task_sql.dao.AirportDao;
import by.it_academy.jd2.task_sql.dao.api.IAirportDao;
import by.it_academy.jd2.task_sql.dao.ds.DataSourceFactory;

public class AirportDaoFactory {
    private volatile static AirportDao instance;

    private AirportDaoFactory() {
    }

    public static IAirportDao getInstance() {
        if (instance == null) {
            synchronized (AirportDaoFactory.class) {
                if (instance == null) {
                    instance = new AirportDao(DataSourceFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
