package by.academy_it.service.impl;

import by.academy_it.dao.CarDAO;
import by.academy_it.dao.ProviderDao;
import by.academy_it.entity.Car;
import by.academy_it.service.CarService;

import java.util.List;


public class CarServiceImpl implements CarService {

    @Override
    public List<Car> showAllCar() {
        CarDAO carDAO = ProviderDao.getInstance().getCarDao();
        List<Car> resultList = carDAO.findAll();
//        carDAO.closeDao();
        return resultList;
    }
}
