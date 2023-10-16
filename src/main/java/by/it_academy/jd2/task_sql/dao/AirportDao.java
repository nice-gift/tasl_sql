package by.it_academy.jd2.task_sql.dao;

import by.it_academy.jd2.task_sql.core.dto.Airport;
import by.it_academy.jd2.task_sql.dao.api.IAirportDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AirportDao implements IAirportDao {
    public static final String URL_GET_ALL_AIRPORT = "SELECT airport_code, airport_name, city, coordinates, timezone FROM bookings.airports_data;";
    private DataSource cpds;

    public AirportDao(DataSource cpds) {
        this.cpds = cpds;
    }

    @Override
    public List<Airport> getAll() {
        List<Airport> airports = new ArrayList<>();
        try (Connection connection = cpds.getConnection();
             PreparedStatement statement = connection.prepareStatement(URL_GET_ALL_AIRPORT);
             ResultSet rs = statement.executeQuery();
        ) {
            while (rs.next()) {
                Airport airport = new Airport();
                airport.setAirportСode(rs.getString("airport_code"));
                airport.setAirportName(rs.getString("airport_name"));
                airport.setCity(rs.getString("city"));
                airport.setCoordinates(rs.getString("coordinates"));
                airport.setTimezone(rs.getString("timezone"));
                airports.add(airport);
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Ошибка получения информации об аэропортах", e);
        }
        return airports;
    }
}
