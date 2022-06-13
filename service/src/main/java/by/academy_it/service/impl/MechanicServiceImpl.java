package by.academy_it.service.impl;

import by.academy_it.dao.CarDAO;
import by.academy_it.dao.MechanicDAO;
import by.academy_it.dao.ProviderDao;
import by.academy_it.entity.Car;
import by.academy_it.entity.Mechanic;
import by.academy_it.service.CarService;
import by.academy_it.service.MechanicService;

import java.util.List;


public class MechanicServiceImpl implements MechanicService {

    @Override
    public List<Mechanic> showAllMechanic() {
        MechanicDAO mechanicDAO = ProviderDao.getInstance().getMechanicDao();
        List<Mechanic> resultList = mechanicDAO.findAll();
        return null;
    }
}
