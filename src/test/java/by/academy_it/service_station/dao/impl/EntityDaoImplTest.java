package by.academy_it.service_station.dao.impl;

import by.academy_it.service_station.dao.EntityDAO;
import by.academy_it.service_station.entity.Administrator;
import by.academy_it.service_station.util.HibernateUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class EntityDaoImplTest extends Assert {
//
//    EntityDaoImpl<Administrator> administrator;
//    static Set<Administrator> administratorSet;
//    static Administrator administrator1;
//    static Administrator administrator2;
//    static Administrator administrator3;
//
//    @Before
//    public void setDataForTest() {
//        administrator1 = Administrator.builder()
//                .name("Grigorovich")
//                .build();
//
//        administrator2 = Administrator.builder()
//                .name("Uchkovich")
//                .build();
//
//        administrator3 = Administrator.builder()
//                .name("Saikovich")
//                .build();
//
//        administratorSet = new HashSet<>();
//        administratorSet.add(administrator1);
//        administratorSet.add(administrator2);
//        administratorSet.add(administrator2);
//
//    }
//
//    @Test
//    public void testFindAll() {
//
//    }
//
//    @Test
//    public void testFindById() {
//        EntityManager entityManager = HibernateUtil.getEntityManager();
//        entityManager.getTransaction().begin();
//        administrator.create(administrator1);
//        Administrator actual = administrator.findById(1);
//        entityManager.getTransaction().commit();
//        HibernateUtil.close();
//        assertEquals(administrator1, actual);
//    }
//
//    @Test
//    public void testCreate() {
//
//    }
//
//    @Test
//    public void testCreateList() {
//
//    }
//
//    @Test
//    public void testUpdate() {
//
//    }
//
//    @Test
//    public void testUpdateList() {
//
//    }
//
//    @Test
//    public void testDeleteAll() {
//
//    }
//
//    @Test
//    public void testDeleteById() {
//
//    }
//
//    @After
//    public void cleanResource() {
//
//    }
}
