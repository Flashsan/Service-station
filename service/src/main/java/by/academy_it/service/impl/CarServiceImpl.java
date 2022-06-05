package by.academy_it.service.impl;

import by.academy_it.dao.CarDAO;
import by.academy_it.dao.ProviderDao;
import by.academy_it.service.CarService;
import by.academy_it.service.dto.CarDto;

import java.util.List;
import java.util.stream.Collectors;


public class CarServiceImpl implements CarService {

    @Override
    public List<CarDto> showAllCar() {
        CarDAO carDAO = ProviderDao.getInstance().getCarDao();
        List<CarDto> resultList = carDAO.findAll().stream()
                .map(CarDto::new)
                .collect(Collectors.toList());
        carDAO.closeDao();
        return resultList;
    }
}
