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

    @Column(name = "client_last_name")
    private String clientLastName;
//
//        @OneToOne(
//            mappedBy = "client",
//            cascade = CascadeType.ALL
//    )
//    private ClientDetails clientDetails;
//
//    @OneToMany(mappedBy = "client")
//    private Set<Orders> orders;
//
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Client client = (Client) o;
//        return Objects.equals(clientId, client.clientId) && Objects.equals(clientName, client.clientName) && Objects.equals(clientLastName, client.clientLastName);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(clientId, clientName, clientLastName);
//    }
}
