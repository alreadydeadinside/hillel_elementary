package dao;

import entities.Role;

public interface RoleDao {

    void save(Role role);

    void update(Role role);

    Role getById(int id);

    void delete(Role role);
}
