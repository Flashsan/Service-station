package by.academy_it.dao.impl;

import by.academy_it.dao.MechanicDAO;
import by.academy_it.entity.Mechanic;

import javax.persistence.EntityManager;

public class MechanicDaoImpl extends EntityDaoImpl<Mechanic>
        implements MechanicDAO {

    public MechanicDaoImpl(EntityManager entityManager) {
        super(entityManager, Mechanic.class);
    }
}
