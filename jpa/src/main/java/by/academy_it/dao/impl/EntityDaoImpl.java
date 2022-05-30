package by.academy_it.dao.impl;

import by.academy_it.dao.EntityDAO;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class EntityDaoImpl<T> implements EntityDAO<T> {

    protected EntityManager entityManager;

    private final Class<T> aClass;

    public EntityDaoImpl(EntityManager entityManager,
                         Class<T> aClass) {
        this.aClass = aClass;
        this.entityManager = entityManager;
    }

    @Override
    public List<T> findAll() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(aClass);
        Root<T> rootEntry = criteriaQuery.from(aClass);
        CriteriaQuery<T> all = criteriaQuery.select(rootEntry);
        TypedQuery<T> allQuery = entityManager.createQuery(all);
        return allQuery.getResultList();
    }

    @Override
    public T findById(Integer id) {
        T entity = null;
        try {
            entity = entityManager.find(aClass, id);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        return entity;
    }

    @Override
    public void create(T t) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(t);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    @Override
    public void create(List<T> list) {

    }

    @Override
    public void update(List<T> list) {

    }

    @Override
    public void updateById(Integer id) {

    }

    @Override
    public void deleteAll(List<T> list) {

    }

    @Override
    public void deleteById(Integer id) {

    }
}
