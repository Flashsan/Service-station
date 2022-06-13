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
        this.id = car.getId();
        this.model = car.getModel();
        this.color = car.getColor();
        this.number = car.getNumber();

    }

}
