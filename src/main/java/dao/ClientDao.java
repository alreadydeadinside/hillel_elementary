package dao;

import entities.Client;

public interface ClientDao {

    void save(Client client);

    void update(Client client);

    Client findUser(int id);

    void delete(Client client);

    Client getByPhone(long phone);
}
