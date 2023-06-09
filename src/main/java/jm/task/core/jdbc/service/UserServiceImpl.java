package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {


    UserDao userDaoHiber = new UserDaoHibernateImpl();

    @Override
    public void createUsersTable() {
        userDaoHiber.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        userDaoHiber.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        userDaoHiber.saveUser(name, lastName, age);
        System.out.printf("User с именем - %s был добавлен в базу данных \n", name);
    }

    @Override
    public void removeUserById(long id) {
        userDaoHiber.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userDaoHiber.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }

    @Override
    public void cleanUsersTable() {
        userDaoHiber.cleanUsersTable();
    }
}
