package by.academy_it.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "mechanic_details")
public class MechanicDetails implements Serializable {

    @Id
    @GenericGenerator(
            name = "one-to-one(mechanic-mechanic_details",
            strategy = "foreign",
            parameters = @Parameter(name = "property", value = "mechanic")
    )
    @GeneratedValue(generator = "one-to-one(mechanic-mechanic_details")
    @Column(name = "mechanic_details_id")
    private Integer mechanicId;

    @Column(name = "mechanic_details_experience")
    private String mechanicExperience;

    @Column(name = "mechanic_details_salary")
    private String mechanicSalary;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Mechanic mechanic;
}
