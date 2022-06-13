package by.academy_it.service.impl;

import by.academy_it.dao.AdministratorDAO;
import by.academy_it.dao.ClientDAO;
import by.academy_it.dao.ProviderDao;
import by.academy_it.entity.Client;
import by.academy_it.service.ClientService;
import by.academy_it.service.dto.ClientDto;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 */
public class ClientServiceImpl
        implements ClientService {

    /**
     * @return
     */
    @Override
    public List<ClientDto> showAllClients() {
        ClientDAO clientDAO =
                ProviderDao.getInstance().getClientDao();
        List<ClientDto> resultList =
                clientDAO.findAll().stream()
                        .map(ClientDto::new)
                        .collect(Collectors.toList());
        return resultList;
    }

    /**
     * @param clientId
     * @return
     */
    @Override
    public ClientDto findClient(Integer clientId) {
        ClientDAO clientDAO =
                ProviderDao.getInstance().getClientDao();
        ClientDto clientDto =
                new ClientDto(clientDAO.find(clientId));
        return clientDto;
    }

    /**
     * @param name
     * @param lastName
     */
    @Override
    public void createClient(String name, String lastName) {
        ClientDAO clientDAO =
                ProviderDao.getInstance().getClientDao();
        Client clientCreate = Client.builder()
                .clientName(name)
                .clientLastName(lastName)
                .build();
        clientDAO.save(clientCreate);
    }

    /**
     * @param clientId
     * @param name
     * @param lastName
     */
    @Override
    public void updateInformationAboutClient(
            Integer clientId,
            String name,
            String lastName) {
        ClientDAO clientDAO =
                ProviderDao.getInstance().getClientDao();
        Client clientUpdate = clientDAO.find(clientId);
        clientUpdate.setClientName(name);
        clientUpdate.setClientLastName(lastName);
        clientDAO.save(clientUpdate);
    }

    /**
     *
     * @param clientId
     */
    @Override
    public void deleteClient(Integer clientId) {
        ClientDAO clientDAO =
                ProviderDao.getInstance().getClientDao();
        clientDAO.delete(clientId);
    }
}
