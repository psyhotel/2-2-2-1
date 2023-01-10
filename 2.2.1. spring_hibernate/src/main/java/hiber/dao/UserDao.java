package hiber.dao;

import hiber.model.User;

import java.util.List;

public interface UserDao {
    void add(User user);

    List<User> listUsers();

    List<User> findByModelAndSeries(String model, int series);

    User getCar(String model, int series);
}
