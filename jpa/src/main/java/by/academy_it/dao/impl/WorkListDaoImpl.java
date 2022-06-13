package by.academy_it.dao.impl;


import by.academy_it.dao.WorkListDAO;
import by.academy_it.entity.WorkList;

import javax.persistence.EntityManager;

public class WorkListDaoImpl extends EntityDaoImpl<WorkList>
        implements WorkListDAO {

    public WorkListDaoImpl(EntityManager entityManager) {
        super(entityManager, WorkList.class);
    }
}
