package by.academy_it.service_station.dao.impl;

import by.academy_it.service_station.dao.WorkListDAO;
import by.academy_it.service_station.entity.WorkList;

import javax.persistence.EntityManager;

public class WorkListDaoImpl extends EntityDaoImpl<WorkList>
        implements WorkListDAO {
    /**
     * @param entityManager
     * @param aClass
     */
    public WorkListDaoImpl(EntityManager entityManager,
                           Class<WorkList> aClass) {
        super(entityManager, aClass);
    }
}
