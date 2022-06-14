package by.academy_it.service.dto;

import by.academy_it.entity.Mechanic;
import by.academy_it.entity.Orders;
import lombok.*;

/**
 * AdministratorDto
 *
 * @author Alexander Grigorovich
 * @version 22.05.2022
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class OrdersDto {
    private Integer id;
    private String description;

    public OrdersDto(Orders orders) {
        this.id = orders.getOrdersId();
        this.description = orders.getOrdersDescription();
    }

}
