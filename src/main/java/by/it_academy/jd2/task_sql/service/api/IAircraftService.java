package by.it_academy.jd2.task_sql.service.api;

import by.it_academy.jd2.task_sql.core.dto.Aircraft;

import java.util.List;

public interface IAircraftService {
// возвращает список самолетов
    List<Aircraft> getAll();
}
