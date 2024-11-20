package ru.kiselev.kataSpringBoot.pp231_springBoot.service;


import ru.kiselev.kataSpringBoot.pp231_springBoot.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(int id, User user);

    User getUserByID(int id);
}
