package by.it_academy.jd2.task_sql.dao.factory;

import by.it_academy.jd2.task_sql.dao.AircraftDao;
import by.it_academy.jd2.task_sql.dao.api.IAircraftDao;
import by.it_academy.jd2.task_sql.dao.data_source.DataSourceFactory;

public class AircraftDaoFactory {
    private volatile static AircraftDao instance;

    private AircraftDaoFactory() {
    }

    public static IAircraftDao getInstance() {
        if (instance == null) {
            synchronized (AircraftDaoFactory.class) {
                if (instance == null) {
                    instance = new AircraftDao(DataSourceFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
