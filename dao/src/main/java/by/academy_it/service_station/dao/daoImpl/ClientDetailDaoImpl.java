package by.academy_it.service_station.dao.daoImpl;

import by.academy_it.service_station.dao.ClientDetailDAO;
import by.academy_it.service_station.entity.ClientDetail;

import javax.persistence.EntityManager;

public class ClientDetailDaoImpl extends EntityDaoImpl<ClientDetail>
        implements ClientDetailDAO {
    /**
     * @param entityManager
     * @param aClass
     */
    public ClientDetailDaoImpl(EntityManager entityManager,
                               Class<ClientDetail> aClass) {
        super(entityManager, aClass);
    }
}
