package by.it_academy.jd2.task_sql.service;

import by.it_academy.jd2.task_sql.core.dto.Airport;
import by.it_academy.jd2.task_sql.dao.api.IAirportDao;
import by.it_academy.jd2.task_sql.service.api.IAirportService;

import java.util.List;
import java.util.stream.Collectors;

public class AirportService implements IAirportService {
    private final IAirportDao dao;

    public AirportService(IAirportDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Airport> getAll() {

        return dao.getAll().stream()
                .map(airportEntity -> new Airport(airportEntity.getAirportСode(),
                        airportEntity.getAirportName(), airportEntity.getCity(),
                        airportEntity.getCoordinates(), airportEntity.getTimezone()))
                .collect(Collectors.toList());
    }
}
