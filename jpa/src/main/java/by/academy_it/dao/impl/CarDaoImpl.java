package by.academy_it.dao.impl;

import by.academy_it.dao.CarDAO;
import by.academy_it.entity.Car;

import javax.persistence.EntityManager;

public class CarDaoImpl extends EntityDaoImpl<Car>
        implements CarDAO {

    public CarDaoImpl(EntityManager entityManager) {
        super(entityManager, Car.class);
    }
}
