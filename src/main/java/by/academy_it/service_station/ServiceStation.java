package by.academy_it.service_station;

import by.academy_it.service_station.util.HibernateUtil;

import javax.persistence.EntityManager;

/**
 *
 */
public class ServiceStation {
    public static void main(String[] args) {

        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        //entityManager.persist();
        entityManager.getTransaction().commit();
        HibernateUtil.close();

    }
}
