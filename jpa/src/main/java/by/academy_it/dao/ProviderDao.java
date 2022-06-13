package by.academy_it.dao;

import by.academy_it.dao.impl.*;

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

    public AdministratorDAO getAdministratorDao() {
        return new AdministratorDaoImpl(factory.createEntityManager());
    }

    public OrdersDAO getOrdersDao() {
        return new OrdersDaoImpl(factory.createEntityManager());
    }
    public SparePartDAO getSparePartDao() {
        return new SparePartDaoImpl(factory.createEntityManager());
    }

    public WorkListDAO getWorkListDao() {
        return new WorkListDaoImpl(factory.createEntityManager());
    }

}