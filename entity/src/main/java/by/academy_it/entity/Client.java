package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
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

    @Column(name = "client_last_name")
    private String clientLastName;

        @OneToOne(
            mappedBy = "client",
            cascade = CascadeType.ALL
    )
    private ClientDetails clientDetails;

    @OneToMany(
            mappedBy = "client",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Car> car;

}
