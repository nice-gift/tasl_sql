package by.it_academy.jd2.task_sql.service.factory;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

public class ObjectMapperFactory {
    private static volatile ObjectMapper instance;

    private ObjectMapperFactory() {
    }

    public static ObjectMapper getInstance() {
        if (instance == null) {
            synchronized (ObjectMapperFactory.class) {
                instance = new ObjectMapper();
                instance.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
                instance.registerModule(new JavaTimeModule());
            }
        }
        return instance;
    }
}
