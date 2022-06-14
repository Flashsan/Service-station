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
        return resultList;
    }

    @Override
    public CarDto findCarById(Integer carId) {
        CarDAO carDAO = ProviderDao.getInstance().getCarDao();
        CarDto carDto = new CarDto(carDAO.find(carId));
        return carDto;
    }

    @Override
    public void createCar(String model,
                          String color,
                          String number) {
        CarDAO carDAO = ProviderDao.getInstance().getCarDao();
        Car carCreate = Car.builder()
                .carModel(model)
                .carColor(color)
                .carNumber(number)
                .build();
        carDAO.save(carCreate);
    }

    @Override
    public void updateInformationAboutCar(Integer carId,
                                          String model,
                                          String color,
                                          String number) {
        CarDAO carDAO = ProviderDao.getInstance().getCarDao();
        Car carCreate = carDAO.find(carId);
        carCreate.setCarModel(model);
        carCreate.setCarColor(color);
        carCreate.setCarNumber(number);
        carDAO.save(carCreate);
    }

    @Override
    public void deleteCar(Integer idCar) {
        CarDAO carDAO = ProviderDao.getInstance().getCarDao();
        carDAO.delete(idCar);
    }


}
