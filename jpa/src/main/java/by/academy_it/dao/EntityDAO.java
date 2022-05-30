package by.academy_it.dao;

import java.util.List;

public interface EntityDAO<T> {

    List<T> findAll();

    T findById(Integer id);

    void create(T t);

    void create(List<T> list);

    void update(List<T> list);

    void updateById(Integer id);

    void deleteAll(List<T> list);

    void deleteById(Integer id);

}
