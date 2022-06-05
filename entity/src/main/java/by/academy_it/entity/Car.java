package by.academy_it.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
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

}
