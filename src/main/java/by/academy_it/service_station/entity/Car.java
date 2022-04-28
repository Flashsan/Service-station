package by.academy_it.service_station.entity;

import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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
//@EqualsAndHashCode
@Table(name = "car")
@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "model")
    private String model;

    @Column(name = "number")
    private String number;

    @OneToOne(
            mappedBy = "car",
            cascade = CascadeType.ALL
    )
    private CarDetail carDetail;

    @OneToMany(mappedBy = "car")
    @Fetch(FetchMode.SELECT)
    private Set<Orders> orders = new HashSet<>();

}
