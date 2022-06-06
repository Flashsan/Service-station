package by.academy_it.service;

import by.academy_it.entity.Car;
import by.academy_it.service.dto.CarDto;

import java.util.List;

public interface CarService {

    List<CarDto> showAllCar();

    CarDto findById(Integer carId);

    void createCar(String model,
                   String color,
                   String number);

    void updateInformationAboutCar(Integer carId,
                                   String model,
                                   String color,
                                   String number);

    void deleteCar(Integer idCar);


}
