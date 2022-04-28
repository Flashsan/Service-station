package by.academy_it.service_station.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mechanic_details")
public class MechanicDetails implements Serializable {

    @Id
    @GenericGenerator(
            name = "one-to-one",
            strategy = "foreign",
            parameters = @Parameter(name = "property", value = "mechanic")
    )
    @GeneratedValue(generator = "one-to-one")
    @Column(name = "mechanic_id")
    private Integer mechanicId;

    @Column(name = "experience_mechanic")
    private String experienceMechanic;

    @Column(name = "salary_mechanic")
    private String salaryMechanic;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Mechanic mechanic;
}
