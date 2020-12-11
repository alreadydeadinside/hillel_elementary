package services;

import entities.Passport;

public interface PassportService {

    void save(Passport passport);

    void update(Passport passport);

    Passport getById(int id);

    void delete(Passport passport);
}
