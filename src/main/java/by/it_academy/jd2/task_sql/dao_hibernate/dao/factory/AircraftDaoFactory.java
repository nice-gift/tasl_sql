package by.it_academy.jd2.task_sql.dao_hibernate.dao.factory;

import by.it_academy.jd2.task_sql.dao_hibernate.dao.AircraftDao;
import by.it_academy.jd2.task_sql.dao_hibernate.dao.api.IAircraftDao;
import by.it_academy.jd2.task_sql.dao_hibernate.dao.ds.EMFFactory;

public class AircraftDaoFactory {
    private volatile static AircraftDao instance;

    private AircraftDaoFactory() {
    }

    public static IAircraftDao getInstance() {
        if (instance == null) {
            synchronized (AircraftDaoFactory.class) {
                if (instance == null) {
                    instance = new AircraftDao(EMFFactory.getInstance());
                }
            }
        }
        return instance;
    }
}
