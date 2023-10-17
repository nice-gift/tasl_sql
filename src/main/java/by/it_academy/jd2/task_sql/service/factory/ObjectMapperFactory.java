package by.it_academy.jd2.task_sql.service.factory;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperFactory {
    private static volatile ObjectMapper instance;

    private ObjectMapperFactory() {
    }

    public static ObjectMapper getInstance() {
        if (instance == null) {
            synchronized (ObjectMapperFactory.class) {
                instance = new ObjectMapper();
            }
        }
        return instance;
    }
}
