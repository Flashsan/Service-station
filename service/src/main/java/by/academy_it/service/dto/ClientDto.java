package by.academy_it.service.dto;

import by.academy_it.entity.Administrator;
import by.academy_it.entity.Client;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class ClientDto {
    private Integer id;
    private String name;
    private String lastName;

    public ClientDto(Client client) {
        this.id = client.getClientId();
        this.name = client.getClientName();
        this.lastName = client.getClientLastName();
    }

}
