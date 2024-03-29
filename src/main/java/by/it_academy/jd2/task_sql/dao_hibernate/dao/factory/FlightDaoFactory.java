package by.it_academy.jd2.task_sql.dao_hibernate.dao.factory;

import by.it_academy.jd2.task_sql.dao_hibernate.dao.FlightDao;
import by.it_academy.jd2.task_sql.dao_hibernate.dao.api.IFlightDao;
import by.it_academy.jd2.task_sql.dao_hibernate.dao.ds.DataSourceFactory;

public class FlightDaoFactory {
    private volatile static FlightDao instance;

    private FlightDaoFactory() {
    }

    public static IFlightDao getInstance() {
        if (instance == null) {
            synchronized (FlightDaoFactory.class) {
                if (instance == null) {
                    instance = new FlightDao(DataSourceFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
