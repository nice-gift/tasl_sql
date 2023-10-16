package by.it_academy.jd2.task_sql.service.api;

import by.it_academy.jd2.task_sql.core.dto.Airport;

import java.util.List;

public interface IAirportService {
// возвращает список аэропортов
    List<Airport> getAll();
}
