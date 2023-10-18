package by.it_academy.jd2.task_sql.dao_hibernate.dao.api;

import by.it_academy.jd2.task_sql.core.dto.Flight;
import by.it_academy.jd2.task_sql.core.dto.FlightFilter;
import by.it_academy.jd2.task_sql.core.dto.Pageable;

import java.util.List;

public interface IFlightDao {
    List<Flight> getAll();

    List<Flight> getPage(Pageable pageable);

    List<Flight> getPage(FlightFilter flightFilter, Pageable pageable);
}
