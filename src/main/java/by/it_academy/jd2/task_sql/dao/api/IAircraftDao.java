package by.it_academy.jd2.task_sql.dao.api;

import by.it_academy.jd2.task_sql.core.dto.Aircraft;

import java.util.List;

public interface IAircraftDao {
    List<Aircraft> getAll();
}
