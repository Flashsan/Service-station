package by.academy_it.dao;

import java.util.List;

public interface EntityDAO<T> {

    List<T> findAll();

    T findById(Integer id);

    void create(T t);

    void updateById(Integer id);

    void deleteAll(List<T> list);

    void deleteById(Integer id);

    void closeDao();

}
