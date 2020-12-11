package services;

import dao.AccountDao;
import dao.AccountDaoImpl;
import entities.Account;

public class AccountServiceImpl implements AccountService {

    @Override
    public void save(Account account) {
        if (account == null) {
            System.out.println("client is empty");
            return;
        }

        AccountDao accountDao = new AccountDaoImpl();
        accountDao.save(account);
    }

    @Override
    public void update(Account account) {
        if (account == null) {
            System.out.println("client is empty");
            return;
        }

        AccountDao accountDao = new AccountDaoImpl();
        accountDao.update(account);
    }

    @Override
    public Account getById(int id) {
        AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getById(id);
    }

    @Override
    public void delete(Account account) {
        if (account == null) {
            System.out.println("client is empty");
            return;
        }

        AccountDao accountDao = new AccountDaoImpl();
        accountDao.delete(account);
    }
}
