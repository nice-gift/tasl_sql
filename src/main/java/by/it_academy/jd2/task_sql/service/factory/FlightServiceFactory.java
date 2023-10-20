package by.it_academy.jd2.task_sql.service.factory;

import by.it_academy.jd2.task_sql.dao_hibernate.dao.factory.FlightDaoFactory;
import by.it_academy.jd2.task_sql.service.FlightService;
import by.it_academy.jd2.task_sql.service.api.IFlightService;

public class FlightServiceFactory {
    private volatile static FlightService instance;

    private FlightServiceFactory() {
    }

    public static IFlightService getInstance() {
        if (instance == null) {
            synchronized (FlightServiceFactory.class) {
                if (instance == null) {
                    instance = new FlightService(FlightDaoFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
