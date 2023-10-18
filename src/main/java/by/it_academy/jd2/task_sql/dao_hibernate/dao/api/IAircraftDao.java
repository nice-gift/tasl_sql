package by.it_academy.jd2.task_sql.dao_hibernate.dao.api;

import by.it_academy.jd2.task_sql.dao_hibernate.dao.entity.AircraftEntity;

import java.util.List;

public interface IAircraftDao {
    List<AircraftEntity> getAll();
}
