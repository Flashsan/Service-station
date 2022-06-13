package by.academy_it.dao.impl;


import by.academy_it.dao.AdministratorDAO;
import by.academy_it.entity.Administrator;

import javax.persistence.EntityManager;

/**
 * AdministratorDaoImpl extends implementation AdministratorDAO.
 *
 * @author Alexander Grigorovich
 * @version 22.05.2022
 */
public class AdministratorDaoImpl
        extends EntityDaoImpl<Administrator>
        implements AdministratorDAO {

    /**
     * @param entityManager
     */
    public AdministratorDaoImpl(
            EntityManager entityManager
    ) {
        super(entityManager, Administrator.class);
    }
}
