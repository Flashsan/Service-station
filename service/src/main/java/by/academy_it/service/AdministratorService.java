package by.academy_it.service;

import by.academy_it.service.dto.AdministratorDto;


import java.util.List;

/**
 * AdministratorService
 *
 * @author Alexander Grigorovich
 * @version 22.05.2022
 */
public interface AdministratorService {

    /**
     * service - show all administrators
     *
     * @return all administrators
     */
    List<AdministratorDto> showAllAdministrators();

    /**
     * service - find administrator by id
     *
     * @param administratorId
     * @return administrator by id
     */
    AdministratorDto findAdministrator(Integer administratorId);

    /**
     * service - create administrator
     *
     * @param name
     * @param lastName
     */
    void createAdministrator(
            String name,
            String lastName
    );

    /**
     * service - update information about administrator
     *
     * @param administratorId
     * @param name
     * @param lastName
     */
    void updateInformationAboutAdministrator(
            Integer administratorId,
            String name,
            String lastName
    );

    /**
     * service - delete administrator by id
     *
     * @param idAdministrator
     */
    void deleteAdministrator(Integer idAdministrator);


}
