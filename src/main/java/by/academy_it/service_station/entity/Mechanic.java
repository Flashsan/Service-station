package by.academy_it.service_station.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Entity
@Table(name = "mechanic")
public class Mechanic implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name_mechanic")
    private String nameMechanic;

    @Column(name = "surname_mechanic")
    private String surnameMechanic;

    @Column(name = "telephone_mechanic")
    private String telephoneMechanic;

    @OneToOne(
            mappedBy = "mechanic",
            cascade = CascadeType.ALL
    )
    private MechanicDetails mechanicDetails;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "orders_mechanic",
            joinColumns = {@JoinColumn(name = "mechanic_id")},
            inverseJoinColumns = {@JoinColumn(name = "orders_id")}
    )
    private Set<Orders> orders = new HashSet<Orders>();


}
