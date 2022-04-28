package by.academy_it.service_station.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "work_list")
public class WorkList implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "coast")
    private String coast;

    @OneToMany(mappedBy = "workList")
    private Set<Orders> orders;

    @OneToMany(mappedBy = "workList")
    private Set<SparePart> sparePart;

}
