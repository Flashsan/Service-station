package by.academy_it.entity;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "spare_part")
public class SparePart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "spare_part_name_part")
    private String sparePartNamePart;

    @Column(name = "spare_part_brand")
    private String sparePartBrand;

    @Column(name = "spare_part_coast")
    private String sparePartCoast;
//
//    @ManyToOne
//    @JoinColumn(name = "work_list_id")
//    private WorkList workList;

}
