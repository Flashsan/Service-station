package by.academy_it.service_station;

import by.academy_it.service_station.entity.*;
import by.academy_it.service_station.util.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.Set;

/**
 * есть список  слесарей (+ таблица с его описанием)
 * <p>
 * потом есть таблица машин для ремонта (+ таблица с ее описанием)
 * <p>
 * таблица запчастей для каждой машины
 * <p>
 * потом есть таблица перечня работ с расценками
 * <p>
 * есть таблица заказов
 * <p>
 * есть таблица клиентов
 * <p>
 * при заказе указывается клиент
 * марка авто
 * перечень работ и запчастей
 * <p>
 * при заказе администратор выбирает машину и список запчастей для ремонта и перечень работ
 **/

public class ServiceStation {
    public static void main(String[] args) {
        //Administrator
        Administrator administrator = Administrator.builder()
                .adminName("Valyshko")
                .build();
        //Car
        CarDetail carDetail = CarDetail.builder()
                .color("grey")
                .generation("restyling")
                .yearOfIssue("2000")
                .build();

        Car car = Car.builder()
                .model("Citroen Evasion")
                .number("8822 BI-2")
                .build();

        carDetail.setCar(car);
        car.setCarDetail(carDetail);
        // Client
        Client client = Client.builder()
                .name("Konstantin")
                .surname("Shilko")
                .telephone("375441234577")
                .build();

        ClientDetail clientDetail = ClientDetail.builder()
                .address("Maksim Gorky, d.19")
                .build();
        clientDetail.setClient(client);
        client.setClientDetail(clientDetail);
        //Orders
        Orders orders = Orders.builder()
                .descriptionOrders("Change wheel")
                .build();
        car.setOrders(Set.of(orders));
        orders.setCar(car);
        //Mechanic
        MechanicDetail mechanicDetails = MechanicDetail.builder()
                .experience("Middle")
                .salary("1500 Byn")
                .build();
        Mechanic mechanic = Mechanic.builder()
                .name("Alexander")
                .surname("Grigorovich")
                .telephone("375298187893")
                .build();
        mechanicDetails.setMechanic(mechanic);
        mechanic.setMechanicDetails(mechanicDetails);

        mechanic.setOrders(Set.of(orders));
        //WorkList
        WorkList workList = WorkList.builder()
                .name("Ремонт двигателя")
                .coast("500$")
                .build();
        //SparePart
        SparePart sparePart = SparePart.builder()
                .namePart("Коленвал")
                .brand("Bosh")
                .coast("150$")
                .build();

        sparePart.setWorkList(workList);
        workList.setSparePart(Set.of(sparePart));

        orders.setMechanic(Set.of(mechanic));
        orders.setCar(car);
        orders.setWorkList(workList);
        orders.setAdministrator(administrator);
        orders.setClient(client);


        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();

        entityManager.persist(administrator);
        Administrator administratorInformation = entityManager.find(Administrator.class, 1);

        entityManager.persist(car);
        Car carInformation = entityManager.find(Car.class, 1);

        entityManager.persist(client);
        Client clientInformation = entityManager.find(Client.class, 1);

        entityManager.persist(mechanic);
        Mechanic mechanicInformation = entityManager.find(Mechanic.class, 1);

        entityManager.persist(orders);
        Orders ordersInformation = entityManager.find(Orders.class, 1);

        entityManager.persist(workList);
        WorkList workListInformation = entityManager.find(WorkList.class, 1);

        entityManager.persist(sparePart);
        SparePart sparePartInformation = entityManager.find(SparePart.class, 1);

        entityManager.getTransaction().commit();
        HibernateUtil.close();

        System.out.println(administratorInformation.toString());
        System.out.println(carInformation.toString());
        System.out.println(clientInformation.toString());
        System.out.println(mechanicInformation.toString());
        System.out.println(workListInformation.toString());
        System.out.println(sparePartInformation.toString());
        System.out.println(ordersInformation.toString());
    }
}
