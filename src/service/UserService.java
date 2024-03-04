package service;

import model.User;

import java.util.List;
import java.util.Scanner;


public interface UserService {

    String join(Scanner input);

    //String addUsers();

    String login(Scanner input);

    User findUserById(Scanner input);

    String updatePassword(Scanner input);

    User deleteUser(Scanner input);

    public List<User> getUserInfo(Scanner input);

    List<User> findUsersByName(Scanner input);

    List<User> findUserByJob(Scanner input);

    String countUsers();
}
