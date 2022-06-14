package by.academy_it.service.impl;

import by.academy_it.dao.MechanicDAO;
import by.academy_it.dao.ProviderDao;
import by.academy_it.entity.Mechanic;
import by.academy_it.service.MechanicService;
import by.academy_it.service.dto.MechanicDto;

import java.util.List;
import java.util.stream.Collectors;


public class MechanicServiceImpl
        implements MechanicService {

    @Override
    public List<MechanicDto> showAllMechanics() {
        MechanicDAO mechanicDAO =
                ProviderDao.getInstance().getMechanicDao();
        List<MechanicDto> resultList = mechanicDAO.findAll().stream()
                .map(MechanicDto::new)
                .collect(Collectors.toList());
        return resultList;
    }

    @Override
    public MechanicDto findMechanic(Integer mechanicId) {
        MechanicDAO mechanicDAO =
                ProviderDao.getInstance().getMechanicDao();
        MechanicDto mechanicDto =
                new MechanicDto(mechanicDAO.find(mechanicId));
        return mechanicDto;
    }

    @Override
    public void createMechanic(
            String name,
            String lastName) {
        MechanicDAO mechanicDAO =
                ProviderDao.getInstance().getMechanicDao();
        Mechanic mechanicCreate = Mechanic.builder()
                .mechanicName(name)
                .mechanicLastName(lastName)
                .build();
        mechanicDAO.save(mechanicCreate);
    }

    @Override
    public void updateInformationAboutMechanic(
            Integer mechanicId,
            String name,
            String lastName) {
        MechanicDAO mechanicDAO =
                ProviderDao.getInstance().getMechanicDao();
        Mechanic mechanicCreate =
                mechanicDAO.find(mechanicId);
        mechanicCreate.setMechanicName(name);
        mechanicCreate.setMechanicLastName(name);
        mechanicDAO.save(mechanicCreate);
    }

    @Override
    public void deleteMechanic(Integer mechanicId) {
        MechanicDAO mechanicDAO =
                ProviderDao.getInstance().getMechanicDao();
        mechanicDAO.delete(mechanicId);
    }
}
