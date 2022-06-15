package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

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

//    @ManyToOne
//    @JoinColumn(name = "administrator_id")
//    private Administrator administrator;
//
//    @ManyToOne
//    @JoinColumn(name = "car_id")
//    private Car car;
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Orders orders = (Orders) o;
//        return Objects.equals(ordersId, orders.ordersId);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(ordersId, ordersDescription, administrator, car);
//    }
////
//    @ManyToMany(mappedBy = "orders")
//    private Set<Mechanic> mechanic = new HashSet<>();
//
//    @ManyToOne
//    @JoinColumn(name = "workList_id")
//    private WorkList workList;
//
//    @ManyToOne
//    @JoinColumn(name = "client_id")
//    private Client client;



}
