package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_lastname")
    private String clientLastname;

    //    @OneToOne(
//            mappedBy = "client",
//            cascade = CascadeType.ALL
//    )
//    private ClientDetail clientDetail;
//
//    @OneToMany(mappedBy = "client")
//    private Set<Orders> orders;

}
