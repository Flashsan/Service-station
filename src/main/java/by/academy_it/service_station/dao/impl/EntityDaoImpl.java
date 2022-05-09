package by.academy_it.service_station.dao.impl;

import by.academy_it.service_station.dao.EntityDAO;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class EntityDaoImpl<T> implements EntityDAO<T> {

    /**
     *
     */
    protected EntityManager entityManager;
    /**
     *
     */
    private final Class<T> aClass;

    /**
     * @param entityManager
     * @param aClass
     */
    public EntityDaoImpl(EntityManager entityManager,
                         Class<T> aClass) {
        this.aClass = aClass;
        this.entityManager = entityManager;
    }

    /**
     * @return
     */
    @Override
    public List<T> findAll() {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(aClass);
        Root<T> entityRoot = criteriaQuery.from(aClass);
        criteriaQuery.select(entityRoot);
        List<T> tList = entityManager.createQuery(criteriaQuery).getResultList();
        return tList;
    }

    /**
     * @param id
     * @return
     */
    @Override
    public T findById(Integer id) {
        T entityFromTable = null;
        try {
            entityManager.getTransaction().begin();
            entityFromTable = entityManager.find(aClass, id);
        } catch (IllegalArgumentException e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
        return entityFromTable;
    }

    /**
     * @param t
     */
    @Override
    public void create(T t) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(t);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    /**
     * @param list
     */
    @Override
    public void create(List<T> list) {
        try {
            entityManager.getTransaction().begin();
            list.forEach(entityManager::persist);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    /**
     * @param list
     */
    @Override
    public void update(List<T> list) {
        try {
            entityManager.getTransaction().begin();
            list.forEach(entityManager::merge);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    /**
     * @param t
     */
    @Override
    public void update(T t) {
        T entityForUpdate = null;
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(t);
        } catch (IllegalArgumentException e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    /**
     * @param list
     */
    @Override
    public void deleteAll(List<T> list) {
        try {
            entityManager.getTransaction().begin();
            list.forEach(entityManager::remove);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }

    /**
     * @param id
     */
    @Override
    public void deleteById(Integer id) {
        try {
            entityManager.getTransaction().begin();
            T entityForDelete = entityManager.find(aClass, id);
            entityManager.remove(entityForDelete);
            entityManager.getTransaction().commit();
        } catch (RuntimeException e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        } finally {
            entityManager.close();
        }
    }
}
