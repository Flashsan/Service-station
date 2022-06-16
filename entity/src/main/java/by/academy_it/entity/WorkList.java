package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "work_list")
public class WorkList implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_list_id")
    private Integer workListId;

    @Column(name = "work_list_name")
    private String workListName;

    @Column(name = "work_list_coast")
    private String workListCoast;

    @OneToMany(mappedBy = "workList")
    private Set<SparePart> sparePart;

    @ManyToOne
    @JoinColumn(name = "orders_id")
    private Orders orders;

    @ManyToMany(mappedBy = "work_list")
    private Set<Mechanic> mechanic;


}
