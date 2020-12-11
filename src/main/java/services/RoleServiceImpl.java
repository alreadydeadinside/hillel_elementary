package services;

import dao.RoleDao;
import dao.RoleDaoImpl;
import entities.Role;

public class RoleServiceImpl implements RoleService {
    @Override
    public void save(Role role) {
        RoleDao roleDao = new RoleDaoImpl();
        roleDao.save(role);
    }

    @Override
    public void update(Role role) {
        if (role == null) {
            System.out.println("client is empty");
            return;
        }

        RoleDao roleDao = new RoleDaoImpl();
        roleDao.update(role);
    }

    @Override
    public Role getById(int id) {
        RoleDao roleDao = new RoleDaoImpl();
        return roleDao.getById(id);
    }

    @Override
    public void delete(Role role) {
        if (role == null) {
            System.out.println("client is empty");
            return;
        }

        RoleDao roleDao = new RoleDaoImpl();
        roleDao.delete(role);
    }
}
