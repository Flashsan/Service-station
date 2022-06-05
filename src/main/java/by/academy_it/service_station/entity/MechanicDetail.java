package by.academy_it.service_station.entity;


import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;

//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
//@ToString (exclude = "mechanic")
//@EqualsAndHashCode
@Entity
@Table(name = "mechanic_details")
public class MechanicDetail implements Serializable {

    @Id
    @GenericGenerator(
            name = "one-to-one(mechanic-mechanic_detail",
            strategy = "foreign",
            parameters = @Parameter(name = "property", value = "mechanic")
    )
    @GeneratedValue(generator = "one-to-one(mechanic-mechanic_detail")
    @Column(name = "mechanic_id")
    private Integer mechanicId;

    @Column(name = "experience")
    private String experience;

    @Column(name = "salary")
    private String salary;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Mechanic mechanic;
}
