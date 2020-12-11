package services;

import entities.Status;

public interface StatusService {

    void save(Status status);

    void update(Status status);

    Status findId(int id);

    void delete(Status status);
}
