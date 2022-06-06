package by.academy_it.service.impl;

import by.academy_it.dao.CarDAO;
import by.academy_it.dao.EntityDAO;
import by.academy_it.dao.ProviderDao;
import by.academy_it.entity.Car;
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

    @Override
    public CarDto findById(Integer carId) {
        CarDAO carDAO = ProviderDao.getInstance().getCarDao();
        CarDto carDto = new CarDto(carDAO.findById(carId));
        carDAO.closeDao();
        return carDto;
    }

    @Override
    public void createCar(String model,
                          String color,
                          String number) {
        CarDAO carDAO = ProviderDao.getInstance().getCarDao();
        Car carCreate = Car.builder()
                .model(model)
                .color(color)
                .number(number)
                .build();
        carDAO.create(carCreate);
        carDAO.closeDao();
    }

    @Override
    public void updateInformationAboutCar(Integer carId,
                                          String model,
                                          String color,
                                          String number) {
        CarDAO carDAO = ProviderDao.getInstance().getCarDao();
        Car carCreate = carDAO.findById(carId);
        carCreate.setModel(model);
        carCreate.setColor(color);
        carCreate.setNumber(number);
        carDAO.create(carCreate);
        carDAO.closeDao();
    }

    @Override
    public void deleteCar(Integer idCar) {
        CarDAO carDAO = ProviderDao.getInstance().getCarDao();
        carDAO.deleteById(idCar);
        carDAO.closeDao();
    }
}
