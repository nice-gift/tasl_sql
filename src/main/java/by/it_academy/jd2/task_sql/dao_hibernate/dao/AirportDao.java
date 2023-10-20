package by.it_academy.jd2.task_sql.dao_hibernate.dao;

import by.it_academy.jd2.task_sql.dao_hibernate.dao.api.IAirportDao;
import by.it_academy.jd2.task_sql.dao_hibernate.dao.entity.AirportEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;

import java.util.List;

public class AirportDao implements IAirportDao {
    private final EntityManagerFactory emf;

    public AirportDao(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<AirportEntity> getAll() {
        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<?> query = cb.createQuery();
        query.from(AirportEntity.class);
        return (List<AirportEntity>)em.createQuery(query).getResultList();
    }
}
