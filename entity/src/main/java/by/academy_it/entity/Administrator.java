package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * Administrator.class describes an entity 'Administrator'.
 *
 * @author Alexander Grigorovich
 * @version 22.05.2022
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "administrator")
public class Administrator
        implements Serializable {

    /**
     * id entity administrator.
     */
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    @Column(
            name = "administrator_id"
    )
    private Integer administratorId;

    /**
     * name entity administrator.
     */
    @Column(
            name = "administrator_name"
    )
    private String administratorName;

    /**
     * lastname entity administrator.
     */
    @Column(
            name = "administrator_last_name"
    )
    private String administratorLastName;

    /**
     * list orders
     */
    @OneToMany(
            mappedBy = "administrator",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private List<Orders> orders;


}
