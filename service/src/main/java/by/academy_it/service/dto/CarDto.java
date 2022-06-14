package by.academy_it.service.dto;

import by.academy_it.entity.Car;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class CarDto {
    private Integer id;
    private String model;
    private String color;
    private String number;
    private Integer carDetails;

    public CarDto(Car car) {
        this.id = car.getCarId();
        this.model = car.getCarModel();
        this.color = car.getCarColor();
        this.number = car.getCarNumber();

    }

}
