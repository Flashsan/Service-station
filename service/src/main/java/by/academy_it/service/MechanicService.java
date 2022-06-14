package by.academy_it.service;

import by.academy_it.service.dto.AdministratorDto;
import by.academy_it.service.dto.MechanicDto;

import java.util.List;

/**
 * MechanicService
 *
 * @author Alexander Grigorovich
 * @version 22.05.2022
 */
public interface MechanicService {

    /**
     * service - show all mechanics
     *
     * @return all mechanics
     */
    List<MechanicDto> showAllMechanics();

    /**
     * service - find mechanic by id
     *
     * @param mechanicId
     * @return mechanic by id
     */
    MechanicDto findMechanic(Integer mechanicId);

    /**
     * service - create mechanic
     *
     * @param name
     * @param lastName
     */
    void createMechanic(
            String name,
            String lastName
    );

    /**
     * service - update information about mechanic
     *
     * @param mechanicId
     * @param name
     * @param lastName
     */
    void updateInformationAboutMechanic(
            Integer mechanicId,
            String name,
            String lastName
    );

    /**
     * service - delete mechanic by id
     *
     * @param mechanicId
     */
    void deleteMechanic(Integer mechanicId);


}
