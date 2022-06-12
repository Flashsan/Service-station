package by.academy_it.dao;

import java.util.List;

/**
 * @param <T>
 */
public interface EntityDAO<T> {

    List<T> findAll();

    T find(Integer id);

    void save(T t);

    void update(T t);

    void delete(Integer id);

}
