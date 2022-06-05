package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString(exclude = "orders")
@EqualsAndHashCode
@Entity
@Table(name = "mechanic")
public class Mechanic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "mechanic_name")
    private String name;

    @Column(name = "mechanic_surname")
    private String surname;

    @Column(name = "mechanic_work_experience")
    private String workExperience;

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
