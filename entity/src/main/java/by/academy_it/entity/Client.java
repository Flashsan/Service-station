package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
//@EqualsAndHashCode
@Table(name = "client")
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "client_name")
    private String name;

    @Column(name = "client_surname")
    private String surname;

//    @OneToOne(
//            mappedBy = "client",
//            cascade = CascadeType.ALL
//    )
//    private ClientDetail clientDetail;
//
//    @OneToMany(mappedBy = "client")
//    private Set<Orders> orders;

}
