package by.academy_it.service.dto;

import by.academy_it.entity.Administrator;
import by.academy_it.entity.Car;
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
public class AdministratorDto {
    private Integer id;
    private String name;
    private String lastName;

    public AdministratorDto(Administrator administrator) {
        this.id = administrator.getAdministratorId();
        this.name = administrator.getAdministratorName();
        this.lastName = administrator.getAdministratorLastName();
    }

}
