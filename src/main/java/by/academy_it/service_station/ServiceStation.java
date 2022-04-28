package by.academy_it.service_station;

import by.academy_it.service_station.entity.Mechanic;
import by.academy_it.service_station.entity.MechanicDetails;
import by.academy_it.service_station.entity.Orders;
import by.academy_it.service_station.util.HibernateUtil;
import org.hibernate.criterion.Order;

import javax.persistence.EntityManager;
import java.util.Set;

/**
 * есть список  слесарей (+ таблица с его писанием)
 * потом есть таблица машин для ремонта
 * таблица запчастей для каждой машины
 * потом есть таблица перечня работ с расценками
 * есть таблица заказов+
 * есть таблица клиентов
 * при заказе указывается клиент
 * марка авто
 * перечень работ и запчастей
 * при заказе администратор выбирает машину и список запчастей для ремонта и перечень работ
 **/

public class ServiceStation {
    public static void main(String[] args) {

        Orders orders = Orders.builder()
                .nameOrders("Change wheel")
                .build();

        Orders orders1 = Orders.builder()
                .nameOrders("Repair engine")
                .build();
        Mechanic mechanic = Mechanic.builder()
                .nameMechanic("Alexander")
                .surnameMechanic("Grigorovich")
                .telephoneMechanic("375298187893")
                .build();

        mechanic.setOrders(Set.of(orders, orders1));

        MechanicDetails mechanicDetails = MechanicDetails.builder()
                .experienceMechanic("Middle")
                .salaryMechanic("1500 Byn")
                .build();

        mechanicDetails.setMechanic(mechanic);


        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(mechanicDetails);
        entityManager.persist(mechanic);
        entityManager.persist(orders);
        Mechanic mechanic1 = entityManager.find(Mechanic.class, 1);
       MechanicDetails mechanicDetails1 = entityManager.find(MechanicDetails.class,1);
        Orders orders2 = entityManager.find(Orders.class,1);
        entityManager.getTransaction().commit();
        HibernateUtil.close();
        System.out.println();
        System.out.println(mechanic1.toString());
        System.out.println(mechanicDetails1.toString());
        System.out.println(orders2.toString());

    }
}
