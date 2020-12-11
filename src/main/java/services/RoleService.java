package services;

import entities.Role;

public interface RoleService {

    void save(Role role);

    void update(Role role);

    Role findId(int id);

    void delete(Role role);
}
