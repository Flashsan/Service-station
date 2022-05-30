package by.academy_it.dao;

import by.academy_it.dao.impl.CarDaoImpl;
import by.academy_it.dao.impl.ClientDaoImpl;
import by.academy_it.dao.impl.MechanicDaoImpl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProviderDao {
    public static final String PERSISTENCE_UNIT_NAME = "unit";
    private final EntityManagerFactory factory;

    private static class SingletonHolder {
        private final static ProviderDao INSTANCE =
                new ProviderDao();
    }

    public ProviderDao() {
        factory = Persistence.
                createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
    }

    public static ProviderDao getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public CarDAO getCarDao() {
        return new CarDaoImpl(factory.createEntityManager());
    }

    public ClientDAO getClientDao() {
        return new ClientDaoImpl(factory.createEntityManager());
    }

    public MechanicDAO getMechanicDao() {
        return new MechanicDaoImpl(factory.createEntityManager());
    }

}