package by.academy_it.service.impl;

import by.academy_it.dao.AdministratorDAO;
import by.academy_it.dao.ProviderDao;
import by.academy_it.entity.Administrator;
import by.academy_it.service.AdministratorService;
import by.academy_it.service.dto.AdministratorDto;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class AdministratorServiceImpl
        implements AdministratorService {

    /**
     * @return
     */
    @Override
    public List<AdministratorDto> showAllAdministrators() {
        AdministratorDAO administratorDAO =
                ProviderDao.getInstance().getAdministratorDao();
        List<AdministratorDto> resultList =
                administratorDAO.findAll().stream()
                        .map(AdministratorDto::new)
                        .collect(Collectors.toList());
        return resultList;
    }

    /**
     * @param administratorId
     * @return
     */
    @Override
    public AdministratorDto findAdministrator(Integer administratorId) {
        AdministratorDAO administratorDAO =
                ProviderDao.getInstance().getAdministratorDao();
        AdministratorDto administratorDto =
                new AdministratorDto(administratorDAO.find(administratorId));
        return administratorDto;
    }

    /**
     * @param name
     * @param lastName
     */
    @Override
    public void createAdministrator(String name, String lastName) {
        AdministratorDAO administratorDAO =
                ProviderDao.getInstance().getAdministratorDao();
        Administrator administratorCreate = Administrator.builder()
                .administratorName(name)
                .administratorLastName(lastName)
                .build();
        administratorDAO.save(administratorCreate);
    }

    /**
     * @param administratorId
     * @param name
     * @param lastName
     */
    @Override
    public void updateInformationAboutAdministrator(
            Integer administratorId,
            String name,
            String lastName) {
        AdministratorDAO administratorDAO =
                ProviderDao.getInstance().getAdministratorDao();
        Administrator administratorUpdate = administratorDAO.find(administratorId);
        administratorUpdate.setAdministratorName(name);
        administratorUpdate.setAdministratorLastName(lastName);
        administratorDAO.save(administratorUpdate);
    }

    /**
     * @param idAdministrator
     */
    @Override
    public void deleteAdministrator(Integer idAdministrator) {
        AdministratorDAO administratorDAO =
                ProviderDao.getInstance().getAdministratorDao();
        administratorDAO.delete(idAdministrator);
    }
}
