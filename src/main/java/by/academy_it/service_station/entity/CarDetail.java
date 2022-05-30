package by.academy_it.service_station.entity;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;

//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString(exclude = "car")
//@EqualsAndHashCode
@Table(name = "car_detail")
@Entity
public class CarDetail implements Serializable {

//    @Id
//    @GenericGenerator(
//            name = "one-to-one(car-car_detail)",
//            strategy = "foreign",
//            parameters = @Parameter(name = "property", value = "car")
//    )
//    @GeneratedValue(generator = "one-to-one(car-car_detail)")
//    @Column(name = "car_id")
//    private Integer carId;
//
//    @Column(name = "color")
//    private String color;
//
//    @Column(name = "generation")
//    private String generation;
//
//    @Column(name = "year_of_issue")
//    private String yearOfIssue;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @PrimaryKeyJoinColumn
//    private Car car;
}
