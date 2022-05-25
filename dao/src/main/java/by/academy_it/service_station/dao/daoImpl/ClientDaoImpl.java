package by.academy_it.service_station.dao.daoImpl;

import by.academy_it.service_station.dao.ClientDAO;
import by.academy_it.service_station.entity.Client;

import javax.persistence.EntityManager;

public class ClientDaoImpl extends EntityDaoImpl<Client>
        implements ClientDAO {

    /**
     * @param entityManager
     * @param aClass
     */
    public ClientDaoImpl(EntityManager entityManager,
                         Class<Client> aClass) {
        super(entityManager, aClass);
    }
}
