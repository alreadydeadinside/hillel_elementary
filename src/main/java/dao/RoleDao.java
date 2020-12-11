package dao;

import entities.Role;

public interface RoleDao {

    void save(Role role);

    void update(Role role);

    Role findId(int id);

    void delete(Role role);
}
