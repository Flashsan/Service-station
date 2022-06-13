package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "mechanic")
public class Mechanic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mechanicId")
    private Integer mechanicId;

    @Column(name = "mechanic_name")
    private String mechanicName;

    @Column(name = "mechanic_last_name")
    private String mechanicLastName;

    @Column(name = "mechanic_work_experience")
    private String mechanicWorkExperience;

    //    @OneToOne(
//            mappedBy = "mechanic",
//            cascade = CascadeType.ALL
//    )
//    private MechanicDetail mechanicDetails;
//
//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "mechanic_orders",
//            joinColumns = {@JoinColumn(name = "mechanic_id")},
//            inverseJoinColumns = {@JoinColumn(name = "orders_id")}
//    )
//    private Set<Orders> orders = new HashSet<>();

}
