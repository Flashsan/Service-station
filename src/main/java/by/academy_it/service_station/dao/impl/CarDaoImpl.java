package by.academy_it.service_station.dao.impl;

import by.academy_it.service_station.dao.CarDAO;
import by.academy_it.service_station.entity.Car;

import javax.persistence.EntityManager;

public class CarDaoImpl extends EntityDaoImpl<Car>
        implements CarDAO{

    /**
     * @param entityManager
     * @param aClass
     */
    public CarDaoImpl(EntityManager entityManager,
                      Class<Car> aClass) {
        super(entityManager, aClass);
    }


}
