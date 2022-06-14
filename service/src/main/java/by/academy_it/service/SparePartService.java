package by.academy_it.service;

import by.academy_it.service.dto.SparePartDto;

import java.util.List;

/**
 * SparePartService
 *
 * @author Alexander Grigorovich
 * @version 22.05.2022
 */
public interface SparePartService {

    /**
     * service - show all spare parts
     *
     * @return all spare parts
     */
    List<SparePartDto> showAllSpareParts();

    /**
     * service - find spare part by id
     *
     * @param sparePartId
     * @return spare part by id
     */
    SparePartDto findSparePart(Integer sparePartId);

    /**
     * service - create spare part
     *
     * @param namePart
     * @param brand
     * @param coast
     */
    void createSparePart(
            String namePart,
            String brand,
            String coast);

    /**
     * service - update information about spare part
     *
     * @param id
     * @param namePart
     * @param brand
     * @param coast
     */
    void updateInformationAboutSparePart(
            Integer id,
            String namePart,
            String brand,
            String coast
    );

    /**
     * service - delete spare part by id
     *
     * @param id
     */
    void deleteSparePart(Integer id);


}
