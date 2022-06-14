package by.academy_it.dao.impl;

import by.academy_it.dao.CarDetailDAO;
import by.academy_it.entity.CarDetails;

import javax.persistence.EntityManager;

public class CarDetailDaoImpl extends EntityDaoImpl<CarDetails>
        implements CarDetailDAO {

    public CarDetailDaoImpl(EntityManager entityManager, Class<CarDetails> aClass) {
        super(entityManager, aClass);
    }
}
