package by.it_academy.jd2.task_sql.dao_hibernate.dao;

import by.it_academy.jd2.task_sql.dao_hibernate.dao.api.IAirportDao;
import by.it_academy.jd2.task_sql.dao_hibernate.dao.entity.AirportEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class AirportDao implements IAirportDao {
    private final EntityManagerFactory emf;

    public AirportDao(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<AirportEntity> getAll() {
//        EntityManager em = emf.createEntityManager();
////        CriteriaBuilder cb = em.getCriteriaBuilder();
////        CriteriaQuery<?> query = cb.createQuery();
////        query.from(AirportEntity.class);
////        return (List<AirportEntity>)em.createQuery(query).getResultList();

        EntityManager em = emf.createEntityManager();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<AirportEntity> critQuery = cb.createQuery(AirportEntity.class);

        Root<AirportEntity> root = critQuery.from(AirportEntity.class);
//        critQuery.select(root).where(root.get("airportСode").in("YKS", "OVS"));

        Predicate[] predicates = new Predicate[2];
        predicates[0] = cb.like(root.get("timezone"), "Asia/Yekaterinburg");
        predicates[1] = cb.like(root.get("airportСode"), "OVS");
        critQuery.select(root).where(predicates);

//        все записи
//        critQuery.select(critQuery.from(AirportEntity.class));

        Query query = em.createQuery(critQuery);
        List<AirportEntity> results = query.getResultList();
        return results;
    }
}
