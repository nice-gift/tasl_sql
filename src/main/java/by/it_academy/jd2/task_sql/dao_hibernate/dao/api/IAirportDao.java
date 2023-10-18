package by.it_academy.jd2.task_sql.dao_hibernate.dao.api;

import by.it_academy.jd2.task_sql.dao_hibernate.dao.entity.AirportEntity;

import java.util.List;

public interface IAirportDao {
    List<AirportEntity> getAll();
}
