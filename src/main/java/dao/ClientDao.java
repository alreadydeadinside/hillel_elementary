package dao;

import entities.Client;

public interface ClientDao {

    void save(Client client);

    void update(Client client);

    Client getById(int id);

    void delete(Client client);

    Client getByPhone(long phone);
}
