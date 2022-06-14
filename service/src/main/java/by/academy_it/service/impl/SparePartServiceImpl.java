package by.academy_it.service.impl;

import by.academy_it.dao.ProviderDao;
import by.academy_it.dao.SparePartDAO;
import by.academy_it.entity.SparePart;
import by.academy_it.service.SparePartService;
import by.academy_it.service.dto.SparePartDto;

import java.util.List;
import java.util.stream.Collectors;


public class SparePartServiceImpl
        implements SparePartService {

    @Override
    public List<SparePartDto> showAllSpareParts() {
        SparePartDAO sparePartDAO =
                ProviderDao.getInstance().getSparePartDao();
        List<SparePartDto> resultList =
                sparePartDAO.findAll().stream()
                        .map(SparePartDto::new)
                        .collect(Collectors.toList());
        return resultList;
    }

    @Override
    public SparePartDto findSparePart(Integer id) {
        SparePartDAO sparePartDAO =
                ProviderDao.getInstance().getSparePartDao();
        SparePartDto sparePartDto =
                new SparePartDto(sparePartDAO.find(id));
        return sparePartDto;
    }

    @Override
    public void createSparePart(
            String namePart,
            String brand,
            String coast) {
        SparePartDAO sparePartDAO =
                ProviderDao.getInstance().getSparePartDao();
        SparePart sparePartCreate = SparePart.builder()
                .sparePartNamePart(namePart)
                .sparePartBrand(brand)
                .sparePartCoast(coast)
                .build();
        sparePartDAO.save(sparePartCreate);
    }

    @Override
    public void updateInformationAboutSparePart(
            Integer id,
            String namePart,
            String brand,
            String coast) {
        SparePartDAO sparePartDAO =
                ProviderDao.getInstance().getSparePartDao();
        SparePart sparePartCreate =
                sparePartDAO.find(id);
        sparePartCreate.setSparePartNamePart(namePart);
        sparePartCreate.setSparePartBrand(brand);
        sparePartCreate.setSparePartCoast(coast);
        sparePartDAO.save(sparePartCreate);

    }

    @Override
    public void deleteSparePart(Integer id) {
        SparePartDAO sparePartDAO =
                ProviderDao.getInstance().getSparePartDao();
        sparePartDAO.delete(id);
    }
}
