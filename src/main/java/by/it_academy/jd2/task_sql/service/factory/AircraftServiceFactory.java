package by.it_academy.jd2.task_sql.service.factory;

import by.it_academy.jd2.task_sql.dao.factory.AircraftDaoFactory;
import by.it_academy.jd2.task_sql.service.AircraftService;
import by.it_academy.jd2.task_sql.service.api.IAircraftService;

public class AircraftServiceFactory {
    private volatile static AircraftService instance;

    private AircraftServiceFactory() {
    }

    public static IAircraftService getInstance() {
        if (instance == null) {
            synchronized (AircraftServiceFactory.class) {
                if (instance == null) {
                    instance = new AircraftService(AircraftDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
