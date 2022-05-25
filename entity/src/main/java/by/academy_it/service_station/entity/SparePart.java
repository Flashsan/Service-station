package by.academy_it.service_station.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "workList")
@Table(name = "spare_part")
@Entity
public class SparePart implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name_part")
    private String namePart;

    @Column(name = "brand")
    private String brand;

    @Column(name = "coast")
    private String coast;

    @ManyToOne
    @JoinColumn(name = "work_list_id")
    private WorkList workList;


}
