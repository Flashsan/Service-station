package by.academy_it.service.impl;

import by.academy_it.dao.ProviderDao;
import by.academy_it.dao.SparePartDAO;
import by.academy_it.dao.WorkListDAO;
import by.academy_it.entity.SparePart;
import by.academy_it.entity.WorkList;
import by.academy_it.service.SparePartService;
import by.academy_it.service.WorkListService;
import by.academy_it.service.dto.SparePartDto;
import by.academy_it.service.dto.WorkListDto;

import java.util.List;
import java.util.stream.Collectors;


public class WorkListServiceImpl
        implements WorkListService {

    @Override
    public List<WorkListDto> showAllWorkLists() {
        WorkListDAO workListDAO =
                ProviderDao.getInstance().getWorkListDao();
        List<WorkListDto> resultList =
                workListDAO.findAll().stream()
                        .map(WorkListDto::new)
                        .collect(Collectors.toList());
        return resultList;
    }

    @Override
    public WorkListDto findWorkList(Integer id) {
        WorkListDAO workListDAO =
                ProviderDao.getInstance().getWorkListDao();
        WorkListDto workListDto =
                new WorkListDto(workListDAO.find(id));
        return workListDto;
    }

    @Override
    public void createWorkList(
            String name,
            String coast) {
        WorkListDAO workListDAO =
                ProviderDao.getInstance().getWorkListDao();
        WorkList workListCreate = WorkList.builder()
                .workListName(name)
                .workListCoast(coast)
                .build();
        workListDAO.save(workListCreate);
    }

    @Override
    public void updateInformationAboutWorkList(
            Integer id,
            String name,
            String coast) {
        WorkListDAO workListDAO =
                ProviderDao.getInstance().getWorkListDao();
        WorkList workListCreate =
                workListDAO.find(id);
        workListCreate.setWorkListName(name);
        workListCreate.setWorkListCoast(coast);
        workListDAO.save(workListCreate);

    }

    @Override
    public void deleteWorkList(Integer id) {
        WorkListDAO workListDAO =
                ProviderDao.getInstance().getWorkListDao();
        workListDAO.delete(id);
    }
}
