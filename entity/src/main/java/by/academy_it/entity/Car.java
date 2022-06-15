package by.academy_it.entity;

import lombok.*;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
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
    @Column(name = "car_id")
    private Integer carId;

    @Column(name = "car_model")
    private String carModel;

    @Column(name = "car_color")
    private String carColor;

    @Column(name = "car_number")
    private String carNumber;

//    @OneToMany(
//            mappedBy = "car",
//            fetch = FetchType.LAZY,
//            cascade = CascadeType.ALL)
//    private List<Orders> orders;

//    @OneToOne(
//            mappedBy = "car",
//            cascade = CascadeType.ALL
//    )
//    private CarDetails carDetails;

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Car car = (Car) o;
//        return Objects.equals(carId, car.carId);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(carId, carModel, carColor, carNumber, orders);
//    }
}
