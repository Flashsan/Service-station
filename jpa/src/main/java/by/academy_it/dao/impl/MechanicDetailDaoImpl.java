package by.academy_it.dao.impl;


import by.academy_it.dao.MechanicDetailDAO;
import by.academy_it.entity.MechanicDetails;

import javax.persistence.EntityManager;

public class MechanicDetailDaoImpl extends EntityDaoImpl<MechanicDetails>
        implements MechanicDetailDAO {

    public MechanicDetailDaoImpl(EntityManager entityManager,
                                 Class<MechanicDetails> aClass) {
        super(entityManager, aClass);
    }
}
