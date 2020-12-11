package dao;

import entities.Account;

public interface AccountDao {

    void save(Account account);

    void update(Account account);

    Account findId(int id);

    void delete(Account account);
}
