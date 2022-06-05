package by.academy_it.entity;


import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;

//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@EqualsAndHashCode
//@Entity
//@Table(name = "car_details")
public class CarDetails implements Serializable {

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
//    @Column(name = "car_details_type_engine")
//    private String typeEngine;
//
//    @Column(name = "car_details_value_engine")
//    private String valueEngine;
//
//    @Column(name = "car_details_type_transmission")
//    private String typeTransmission;
//
//    @Column(name = "car_details_type_body")
//    private String typeBody;
//
//    @Column(name = "car_details_year_of_issue")
//    private String yearOfIssue;
//
//    @OneToOne(fetch = FetchType.LAZY)
//    @PrimaryKeyJoinColumn
//    private Car car;
}
