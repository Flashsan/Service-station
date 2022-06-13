package by.academy_it.dao.impl;

import by.academy_it.dao.OrdersDAO;
import by.academy_it.entity.Orders;

import javax.persistence.EntityManager;

public class OrdersDaoImpl extends EntityDaoImpl<Orders>
        implements OrdersDAO {

    public OrdersDaoImpl(EntityManager entityManager,
                         Class<Orders> aClass) {
        super(entityManager, aClass);
    }
}
