package by.academy_it.service_station.dao.daoImpl;

import by.academy_it.service_station.dao.OrdersDAO;
import by.academy_it.service_station.entity.Orders;

import javax.persistence.EntityManager;

public class OrdersDaoImpl extends EntityDaoImpl<Orders>
        implements OrdersDAO {
    /**
     * @param entityManager
     * @param aClass
     */
    public OrdersDaoImpl(EntityManager entityManager,
                         Class<Orders> aClass) {
        super(entityManager, aClass);
    }
}
