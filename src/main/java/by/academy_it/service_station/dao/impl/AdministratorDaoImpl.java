package by.academy_it.service_station.dao.impl;

import by.academy_it.service_station.dao.AdministratorDAO;
import by.academy_it.service_station.entity.Administrator;

import javax.persistence.EntityManager;

public class AdministratorDaoImpl extends EntityDaoImpl<Administrator>
implements AdministratorDAO {
    /**
     * @param entityManager
     * @param aClass
     */
    public AdministratorDaoImpl(EntityManager entityManager, Class<Administrator> aClass) {
        super(entityManager, aClass);
    }
}
