package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

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
@Table(
        name = "administrator"
)
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Administrator that = (Administrator) o;
        return Objects.equals(administratorId, that.administratorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(administratorId, administratorName, administratorLastName, orders);
    }
}
