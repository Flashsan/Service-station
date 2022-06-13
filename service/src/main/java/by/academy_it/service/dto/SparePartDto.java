package by.academy_it.service.dto;

import by.academy_it.entity.Orders;
import by.academy_it.entity.SparePart;
import lombok.*;

/**
 * SparePartDto
 *
 * @author Alexander Grigorovich
 * @version 22.05.2022
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class SparePartDto {
    private Integer id;
    private String namePart;
    private String brand;
    private String coast;

    public SparePartDto(SparePart sparePart) {
        this.id = sparePart.getId();
        this.namePart = sparePart.getSparePartNamePart();
        this.brand = sparePart.getSparePartBrand();
        this.coast = sparePart.getSparePartCoast();
    }

}
