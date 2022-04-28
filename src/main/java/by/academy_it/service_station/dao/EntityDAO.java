package by.academy_it.service_station.dao;

import java.util.List;

/**
 * @param <T>
 */
public interface EntityDAO<T> {

    /**
     * @return
     */
    List<T> findAll();

    /**
     * @param id
     * @return
     */
    T findById(Integer id);

    /**
     * @param t
     */
    void create(T t);

    /**
     * @param list
     */
    void create(List<T> list);

    /**
     * @param list
     */
    void update(List<T> list);

    /**
     * @param id
     */
    void updateById(Integer id);

    /**
     * @param list
     */
    void deleteAll(List<T> list);

    /**
     * @param id
     */
    void deleteById(Integer id);

}
