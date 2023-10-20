package by.it_academy.jd2.task_sql.dao_hibernate.dao;

import by.it_academy.jd2.task_sql.dao_hibernate.dao.api.IAircraftDao;
import by.it_academy.jd2.task_sql.dao_hibernate.dao.entity.AircraftEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;

import java.util.List;

public class AircraftDao implements IAircraftDao {
    private final EntityManagerFactory emf;

    public AircraftDao(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<AircraftEntity> getAll() {
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AircraftEntity> query = cb.createQuery(AircraftEntity.class);
        List<AircraftEntity> list = em.createQuery(query).getResultList();
        return list;
    }
}
