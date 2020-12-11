package services;

import dao.PassportDao;
import dao.PassportDaoImpl;
import entities.Passport;

public class PassportServiceImpl implements PassportService {
    @Override
    public void save(Passport passport) {
        PassportDao passportDao = new PassportDaoImpl();
        passportDao.save(passport);
    }

    @Override
    public void update(Passport passport) {
        if (passport == null) {
            System.out.println("client is empty");
            return;
        }

        PassportDao passportDao = new PassportDaoImpl();
        passportDao.update(passport);
    }

    @Override
    public Passport findId(int id) {
        PassportDao passportDao = new PassportDaoImpl();
        return passportDao.findId(id);
    }

    @Override
    public void delete(Passport passport) {
        if (passport == null) {
            System.out.println("client is empty");
            return;
        }

        PassportDao passportDao = new PassportDaoImpl();
        passportDao.delete(passport);
    }
}
