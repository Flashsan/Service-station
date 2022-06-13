package by.academy_it.service.impl;

import by.academy_it.dao.MechanicDAO;
import by.academy_it.dao.OrdersDAO;
import by.academy_it.dao.ProviderDao;
import by.academy_it.entity.Mechanic;
import by.academy_it.entity.Orders;
import by.academy_it.service.MechanicService;
import by.academy_it.service.OrdersService;
import by.academy_it.service.dto.MechanicDto;
import by.academy_it.service.dto.OrdersDto;

import java.util.List;
import java.util.stream.Collectors;


public class OrdersServiceImpl
        implements OrdersService {

    @Override
    public List<OrdersDto> showAllOrders() {
        OrdersDAO ordersDAO =
                ProviderDao.getInstance().getOrdersDao();
        List<OrdersDto> resultList = ordersDAO.findAll().stream()
                .map(OrdersDto::new)
                .collect(Collectors.toList());
        return resultList;
    }

    @Override
    public OrdersDto findOrder(Integer ordersId) {
        OrdersDAO ordersDAO =
                ProviderDao.getInstance().getOrdersDao();
        OrdersDto ordersDto =
                new OrdersDto(ordersDAO.find(ordersId));
        return ordersDto;
    }

    @Override
    public void createOrder(String description) {
        OrdersDAO ordersDAO =
                ProviderDao.getInstance().getOrdersDao();
        Orders orderCreate = Orders.builder()
                .ordersDescription(description)
                .build();
        ordersDAO.save(orderCreate);
    }

    @Override
    public void updateInformationAboutOrder(
            Integer orderId,
            String description) {
        OrdersDAO ordersDAO =
                ProviderDao.getInstance().getOrdersDao();
        Orders orderCreate =
                ordersDAO.find(orderId);
        orderCreate.setOrdersDescription(description);
        ordersDAO.save(orderCreate);
    }

    @Override
    public void deleteOrder(Integer orderId) {
        OrdersDAO ordersDAO =
                ProviderDao.getInstance().getOrdersDao();
        ordersDAO.delete(orderId);
    }

}
