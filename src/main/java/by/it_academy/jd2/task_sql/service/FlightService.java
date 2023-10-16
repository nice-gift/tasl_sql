package by.it_academy.jd2.task_sql.service;

import by.it_academy.jd2.task_sql.core.dto.Flight;
import by.it_academy.jd2.task_sql.core.dto.FlightFilter;
import by.it_academy.jd2.task_sql.core.dto.Pageable;
import by.it_academy.jd2.task_sql.dao.api.IFlightDao;
import by.it_academy.jd2.task_sql.service.api.IFlightService;

import java.time.LocalDate;
import java.util.List;

public class FlightService implements IFlightService {
    private final IFlightDao dao;
    public FlightService(IFlightDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Flight> getAll() {
        return dao.getAll();
    }

    @Override
    public List<Flight> getPage(Pageable pageable) {
        return dao.getPage(pageable);
    }

    @Override
    public List<Flight> getPage(FlightFilter flightFilter, Pageable pageable) {
        return dao.getPage(flightFilter, pageable);
    }
}
