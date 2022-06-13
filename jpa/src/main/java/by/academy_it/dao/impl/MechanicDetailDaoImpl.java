package by.academy_it.dao.impl;


import by.academy_it.dao.MechanicDetailDAO;
import by.academy_it.entity.MechanicDetail;

import javax.persistence.EntityManager;

public class MechanicDetailDaoImpl extends EntityDaoImpl<MechanicDetail>
        implements MechanicDetailDAO {

    public MechanicDetailDaoImpl(EntityManager entityManager,
                                 Class<MechanicDetail> aClass) {
        super(entityManager, aClass);
    }
}
