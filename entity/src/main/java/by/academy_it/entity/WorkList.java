package by.academy_it.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;


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
    private Integer id;

    @Column(name = "work_list_name")
    private String workListName;

    @Column(name = "work_list_coast")
    private String workListCoast;

//    @OneToMany(mappedBy = "workList")
//    private Set<Orders> orders;
//
//    @OneToMany(mappedBy = "workList")
//    private Set<SparePart> sparePart;

}
