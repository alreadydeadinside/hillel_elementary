package services;

import dao.ClientDao;
import dao.ClientDaoImpl;
import entities.Client;

public class ClientServiceImpl implements ClientService {

    @Override
    public void save(Client client) {
        if (client == null) {
            System.out.println("client is empty");
            return;
        }

        ClientDao clientDao = new ClientDaoImpl();
        clientDao.save(client);
    }

    @Override
    public void update(Client client) {
        if (client == null) {
            System.out.println("client is empty");
            return;
        }

        ClientDao clientDao = new ClientDaoImpl();
        clientDao.update(client);
    }

    @Override
    public Client getById(int id) {
        ClientDao customerDao = new ClientDaoImpl();
        return customerDao.getById(id);
    }

    @Override
    public void delete(Client client) {
        if (client == null) {
            System.out.println("client is empty");
            return;
        }

        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(client);
    }

    @Override
    public Client getByPhone(long phone) {
        ClientDao customerDao = new ClientDaoImpl();
        return customerDao.getByPhone(phone);
    }
}
