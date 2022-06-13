package by.academy_it.service;

import by.academy_it.service.dto.AdministratorDto;
import by.academy_it.service.dto.ClientDto;

import java.util.List;

/**
 * ClientService
 *
 * @author Alexander Grigorovich
 * @version 22.05.2022
 */
public interface ClientService {

    /**
     * service - show all clients
     *
     * @return all clients
     */
    List<ClientDto> showAllClients();

    /**
     * service - find client by id
     *
     * @param clientId
     * @return client by id
     */
    ClientDto findClient(Integer clientId);

    /**
     * service - create client
     *
     * @param name
     * @param lastName
     */
    void createClient(
            String name,
            String lastName
    );

    /**
     * service - update information about client
     *
     * @param clientId
     * @param name
     * @param lastName
     */
    void updateInformationAboutClient(
            Integer clientId,
            String name,
            String lastName
    );

    /**
     * service - delete client by id
     *
     * @param clientId
     */
    void deleteClient(Integer clientId);


}
