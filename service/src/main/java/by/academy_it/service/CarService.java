package by.academy_it.service;

import by.academy_it.entity.Car;
import by.academy_it.service.dto.CarDto;

import java.util.List;

public interface CarService {

    List<CarDto> showAllCar();

    void createCar(String model,
                   String color,
                   String number);


}
