package by.it_academy.jd2.task_sql.service.factory;

import by.it_academy.jd2.task_sql.dao_hibernate.dao.factory.AirportDaoFactory;
import by.it_academy.jd2.task_sql.service.AirportService;
import by.it_academy.jd2.task_sql.service.api.IAirportService;

public class AirportServiceFactory {
    private volatile static AirportService instance;

    private AirportServiceFactory() {
    }

    public static IAirportService getInstance() {
        if (instance == null) {
            synchronized (AirportServiceFactory.class) {
                if (instance == null) {
                    instance = new AirportService(AirportDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
