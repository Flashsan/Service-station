package by.academy_it.service;

import by.academy_it.entity.WorkList;
import by.academy_it.service.dto.SparePartDto;
import by.academy_it.service.dto.WorkListDto;

import java.util.List;

/**
 * WorkListService
 *
 * @author Alexander Grigorovich
 * @version 22.05.2022
 */
public interface WorkListService {

    /**
     * service - show all work list
     *
     * @return all work list
     */
    List<WorkListDto> showAllWorkLists();

    /**
     * service - find work list by id
     *
     * @param id
     * @return work list by id
     */
    WorkListDto findWorkList(Integer id);

    /**
     * service - create work list
     *
     * @param name
     * @param coast
     */
    void createWorkList(
            String name,
            String coast);

    /**
     * service - update information about work list
     *
     * @param id
     * @param name
     * @param coast
     */
    void updateInformationAboutWorkList(
            Integer id,
            String name,
            String coast
    );

    /**
     * service - delete work list by id
     *
     * @param id
     */
    void deleteWorkList(Integer id);


}
