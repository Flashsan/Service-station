package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "car")
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "car_model")
    private String model;

    @Column(name = "car_color")
    private String color;

    @Column(name = "car_number")
    private String number;

    //    @OneToOne(
//            mappedBy = "car",
//            cascade = CascadeType.ALL
//    )
//    private CarDetails carDetails;

//    @OneToMany(mappedBy = "car")
//    @Fetch(FetchMode.SELECT)
//    private Set<Orders> orders = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(id, car.id) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, number);
    }


}
