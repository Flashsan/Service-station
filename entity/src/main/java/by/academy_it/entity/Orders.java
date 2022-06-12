package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "orders")
public class Orders implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private Integer ordersId;

    @Column(name = "orders_description")
    private String ordersDescription;

//    @ManyToMany(mappedBy = "orders")
//    private Set<Mechanic> mechanic = new HashSet<>();
//
//    @ManyToOne
//    @JoinColumn(name = "car_id")
//    private Car car;
//
//    @ManyToOne
//    @JoinColumn(name = "workList_id")
//    private WorkList workList;
//
//    @ManyToOne
//    @JoinColumn(name = "client_id")
//    private Client client;
//
//    @ManyToOne
//    @JoinColumn(name = "administrator_id")
//    private Administrator administrator;


}
