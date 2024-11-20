package ru.kiselev.kataSpringBoot.pp231_springBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kiselev.kataSpringBoot.pp231_springBoot.dao.UserDAO;
import ru.kiselev.kataSpringBoot.pp231_springBoot.model.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private final UserDAO userDao;

    @Autowired
    public UserServiceImpl(UserDAO userDao) {
        this.userDao = userDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }


    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }


    @Override
    public void deleteUser(int id) {
        userDao.deleteUser(id);
    }


    @Override
    public void updateUser(int id, User user) {
        userDao.updateUser(id, user);
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserByID(int id) {
        return userDao.getUserByID(id);
    }
}

