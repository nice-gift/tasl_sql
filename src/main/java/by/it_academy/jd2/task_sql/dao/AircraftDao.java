package by.it_academy.jd2.task_sql.dao;

import by.it_academy.jd2.task_sql.core.dto.Aircraft;
import by.it_academy.jd2.task_sql.dao.api.IAircraftDao;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AircraftDao implements IAircraftDao {
    public static final String URL_GET_ALL_AIRCRAFT = "SELECT aircraft_code, model, range FROM bookings.aircrafts_data";
    private DataSource cpds;

    public AircraftDao(DataSource cpds) {
        this.cpds = cpds;
    }

    @Override
    public List<Aircraft> getAll() {
        List<Aircraft> aircrafts = new ArrayList<>();
        try (Connection connection = cpds.getConnection();
             PreparedStatement statement = connection.prepareStatement(URL_GET_ALL_AIRCRAFT);
             ResultSet rs = statement.executeQuery();
        ) {
            while (rs.next()) {
                Aircraft aircraft = new Aircraft();
                aircraft.setAircraftCode(rs.getString("aircraft_code"));
                aircraft.setModel(rs.getString("model"));
                aircraft.setRange(rs.getInt("range"));
                aircrafts.add(aircraft);
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Ошибка получения информации о самолетах", e);
        }

        return aircrafts;
    }
}
