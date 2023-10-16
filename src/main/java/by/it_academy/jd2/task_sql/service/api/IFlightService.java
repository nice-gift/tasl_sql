package by.it_academy.jd2.task_sql.service.api;

import by.it_academy.jd2.task_sql.core.dto.Flight;
import by.it_academy.jd2.task_sql.core.dto.FlightFilter;
import by.it_academy.jd2.task_sql.core.dto.Pageable;

import java.util.List;

public interface IFlightService {
    // возвращает список аэропортов
    List<Flight> getAll();

    // возвращает список аэропортов на конкретной странице
    List<Flight> getPage(Pageable pageable);

    // возвращает список аэропортов на конкретной странице применяя фильтрацию
    List<Flight> getPage(FlightFilter flightFilter, Pageable pageable);
}
