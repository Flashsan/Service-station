package by.academy_it.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "clients_details")
public class ClientDetails implements Serializable {
    @Id
    @GenericGenerator(
            name = "one-to-one(client-client_details)",
            strategy = "foreign",
            parameters = @Parameter(name = "property", value = "client")
    )
    @GeneratedValue(generator = "one-to-one(client-client_details")
    @Column(name = "client_id")
    private Integer clientId;
}