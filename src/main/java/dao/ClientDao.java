package dao;

import entities.Client;

public interface ClientDao {

    void save(Client client);

    void update(Client client);

    Client findId(int id);

    void delete(Client client);

    Client findPhone(long phone);
}
