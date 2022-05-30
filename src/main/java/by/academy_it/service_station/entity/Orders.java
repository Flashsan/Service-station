package by.academy_it.service_station.entity;



import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


//@Builder
//@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Entity
@Table(name = "orders")
public class Orders implements Serializable {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Integer id;
//
//    @Column(name = "description_orders")
//    private String descriptionOrders;
//
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
