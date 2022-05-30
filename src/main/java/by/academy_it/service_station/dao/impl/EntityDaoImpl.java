package by.academy_it.service_station.dao.impl;

import by.academy_it.service_station.dao.EntityDAO;

import javax.persistence.EntityManager;
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
        return null;
    }

    /**
     * @param id
     * @return
     */
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

    /**
     * @param t
     */
    @Override
    public void create(T t) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(t);
            entityManager.getTransaction().commit();
        }catch(RuntimeException e) {
            entityManager.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    /**
     * @param list
     */
    @Override
    public void create(List<T> list) {

    }

    /**
     * @param list
     */
    @Override
    public void update(List<T> list) {

    }

    /**
     * @param id
     */
    @Override
    public void updateById(Integer id) {

    }

    /**
     * @param list
     */
    @Override
    public void deleteAll(List<T> list) {

    }

    /**
     * @param id
     */
    @Override
    public void deleteById(Integer id) {

    }
}
