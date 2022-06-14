package by.academy_it.service.dto;

import by.academy_it.entity.Client;
import by.academy_it.entity.Mechanic;
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
public class MechanicDto {
    private Integer id;
    private String name;
    private String lastName;

    public MechanicDto(Mechanic mechanic) {
        this.id = mechanic.getMechanicId();
        this.name = mechanic.getMechanicName();
        this.lastName = mechanic.getMechanicLastName();
    }

}
