package by.academy_it.service_station.dao.impl;

import by.academy_it.service_station.dao.MechanicDAO;
import by.academy_it.service_station.entity.Mechanic;

import javax.persistence.EntityManager;

public class MechanicDaoImpl extends EntityDaoImpl<Mechanic>
        implements MechanicDAO {
    /**
     * @param entityManager
     * @param aClass
     */
    public MechanicDaoImpl(EntityManager entityManager,
                           Class<Mechanic> aClass) {
        super(entityManager, aClass);
    }
}
