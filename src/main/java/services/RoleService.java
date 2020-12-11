package services;

import entities.Role;

public interface RoleService {

    void save(Role role);

    void update(Role role);

    Role getById(int id);

    void delete(Role role);
}
