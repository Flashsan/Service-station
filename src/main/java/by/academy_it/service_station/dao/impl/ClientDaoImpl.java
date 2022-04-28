package by.academy_it.service_station.dao.impl;

import by.academy_it.service_station.dao.ClientDAO;
import by.academy_it.service_station.dao.EntityDAO;
import by.academy_it.service_station.entity.Client;

import javax.persistence.EntityManager;
import java.util.List;

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
