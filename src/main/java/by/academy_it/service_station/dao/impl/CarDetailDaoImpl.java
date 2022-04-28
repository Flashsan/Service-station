package by.academy_it.service_station.dao.impl;

import by.academy_it.service_station.dao.CarDetailDAO;
import by.academy_it.service_station.entity.CarDetail;

import javax.persistence.EntityManager;

public class CarDetailDaoImpl extends EntityDaoImpl<CarDetail>
        implements CarDetailDAO  {
    /**
     * @param entityManager
     * @param aClass
     */
    public CarDetailDaoImpl(EntityManager entityManager,
                            Class<CarDetail> aClass) {
        super(entityManager, aClass);
    }
}
