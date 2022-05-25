package by.academy_it.service_station.dao.daoImpl;

import by.academy_it.service_station.dao.MechanicDetailDAO;
import by.academy_it.service_station.entity.MechanicDetail;

import javax.persistence.EntityManager;

public class MechanicDetailDaoImpl extends EntityDaoImpl<MechanicDetail>
        implements MechanicDetailDAO {
    /**
     * @param entityManager
     * @param aClass
     */
    public MechanicDetailDaoImpl(EntityManager entityManager,
                                 Class<MechanicDetail> aClass) {
        super(entityManager, aClass);
    }
}
