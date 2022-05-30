package by.academy_it.service_station.dao.impl;

import by.academy_it.service_station.dao.SparePartDAO;
import by.academy_it.service_station.entity.SparePart;

import javax.persistence.EntityManager;

public class SparePartDaoImpl extends EntityDaoImpl<SparePart>
        implements SparePartDAO {
    /**
     * @param entityManager
     * @param aClass
     */
    public SparePartDaoImpl(EntityManager entityManager,
                            Class<SparePart> aClass) {
        super(entityManager, aClass);
    }
}
