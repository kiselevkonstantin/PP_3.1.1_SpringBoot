package ru.kiselev.kataSpringBoot.pp231_springBoot.dao;


import ru.kiselev.kataSpringBoot.pp231_springBoot.model.User;

import java.util.List;

public interface UserDAO {

    // вывести список Users
    List<User> getAllUsers();

    // добавить User
    void addUser(User user);

    // удалить User
    void deleteUser(int id);

    // изменить User
    void updateUser(int id, User user);

    User getUserByID(int id);
}

