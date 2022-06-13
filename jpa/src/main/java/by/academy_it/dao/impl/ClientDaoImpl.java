package by.academy_it.dao.impl;

import by.academy_it.dao.ClientDAO;
import by.academy_it.entity.Client;

import javax.persistence.EntityManager;

public class ClientDaoImpl
        extends EntityDaoImpl<Client>
        implements ClientDAO {

    public ClientDaoImpl(EntityManager entityManager) {
        super(entityManager, Client.class);
    }
}
