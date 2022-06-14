package by.academy_it.service.dto;

import by.academy_it.entity.WorkList;
import lombok.*;

/**
 * WorkListDto
 *
 * @author Alexander Grigorovich
 * @version 22.05.2022
 */

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class WorkListDto {
    private Integer id;
    private String name;
    private String coast;

    public WorkListDto(WorkList workList) {
        this.id = workList.getWorkListId();
        this.name = workList.getWorkListName();
        this.coast = workList.getWorkListCoast();
    }

}
