package services;

import dao.ClientDao;
import dao.ClientDaoImpl;
import entities.Client;
import org.apache.log4j.Logger;

public class ClientServiceImpl implements ClientService {

    Logger logger = Logger.getLogger(ClientServiceImpl.class);

    @Override
    public void save(Client client) {
        logger.debug(client.toString());

        ClientDao clientDao = new ClientDaoImpl();
        clientDao.save(client);
    }

    @Override
    public void update(Client client) {
        logger.debug(client.toString());

        ClientDao clientDao = new ClientDaoImpl();
        clientDao.update(client);
    }

    @Override
    public Client getById(int id) {
        logger.debug(id);

        ClientDao customerDao = new ClientDaoImpl();
        return customerDao.getById(id);
    }

    @Override
    public void delete(Client client) {
        logger.debug(client.toString());

        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(client);
    }

    @Override
    public Client getByPhone(long phone) {
        logger.debug(phone);

        ClientDao customerDao = new ClientDaoImpl();
        return customerDao.getByPhone(phone);
    }
}
