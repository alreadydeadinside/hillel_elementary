package services;

import entities.Client;

public interface ClientService {

    void save(Client client);

    void update(Client client);

    Client findUser(int id);

    void delete(Client client);

    Client findPhone(long phone);
}
