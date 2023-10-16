package by.it_academy.jd2.task_sql.service;

import by.it_academy.jd2.task_sql.core.dto.Aircraft;
import by.it_academy.jd2.task_sql.dao.api.IAircraftDao;
import by.it_academy.jd2.task_sql.service.api.IAircraftService;

import java.util.List;

public class AircraftService implements IAircraftService {
    private final IAircraftDao dao;
    public AircraftService(IAircraftDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Aircraft> getAll() {
        return dao.getAll();
    }

}
