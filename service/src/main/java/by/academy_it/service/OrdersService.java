package by.academy_it.service;

import by.academy_it.service.dto.MechanicDto;
import by.academy_it.service.dto.OrdersDto;

import java.util.List;

/**
 * OrdersService
 *
 * @author Alexander Grigorovich
 * @version 22.05.2022
 */
public interface OrdersService {

    /**
     * service - show all orders
     *
     * @return all orders
     */
    List<OrdersDto> showAllOrders();

    /**
     * service - find order by id
     *
     * @param orderId
     * @return order by id
     */
    OrdersDto findOrder(Integer orderId);

    /**
     * service - create order
     *
     * @param description
     */
    void createOrder(String description);

    /**
     * service - update information about order
     *
     * @param orderId
     * @param description
     */
    void updateInformationAboutOrder(
            Integer orderId,
            String description
    );

    /**
     * service - delete order by id
     *
     * @param orderId
     */
    void deleteOrder(Integer orderId);


}
