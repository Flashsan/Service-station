package by.academy_it.service_station.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "client")
//@EqualsAndHashCode
@Table(name = "client_detail")
@Entity
public class ClientDetail {

    @Id
    @GenericGenerator(
            name = "one-to-one(client-client_detail)",
            strategy = "foreign",
            parameters = @Parameter(name = "property", value = "client")
    )
    @GeneratedValue(generator = "one-to-one(client-client_detail)")
    @Column(name = "client_id")
    private Integer clientId;

    @Column(name = "address")
    private String address;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private Client client;
}
