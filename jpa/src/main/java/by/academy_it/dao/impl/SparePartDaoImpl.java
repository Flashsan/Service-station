package by.academy_it.dao.impl;


import by.academy_it.dao.SparePartDAO;
import by.academy_it.entity.SparePart;

import javax.persistence.EntityManager;

public class SparePartDaoImpl extends EntityDaoImpl<SparePart>
        implements SparePartDAO {

    public SparePartDaoImpl(EntityManager entityManager,
                            Class<SparePart> aClass) {
        super(entityManager, aClass);
    }
}
