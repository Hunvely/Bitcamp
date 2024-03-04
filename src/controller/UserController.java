package controller;

import model.User;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.List;
import java.util.Scanner;

public class UserController {

    UserService user;

    public UserController() {
        this.user = UserServiceImpl.getInstance(); // 매개 변수를 생성자를 통해 AuthServie auth = AuthServiceImpl.getIstance()가 메모리에 항상 상주하는 것이 아니라 사용할 때만 메모리를 점유함.
    }

    public String join(Scanner input) {
        return user.join(input);
    }

    public String login(Scanner input) {
        return user.login(input);
    }

    public User findUserById(Scanner input) {
        return user.findUserById(input);
    }

    public String updatePassword(Scanner input) {
        return user.updatePassword(input);
    }

    public User deleteUser(Scanner input) {
        return user.deleteUser(input);
    }

    public List<User> getUserInfo(Scanner input) {
        return user.getUserInfo(input);
    }

    public List<User> findUserByName(Scanner input) {
        return user.findUsersByName(input);
    }


    /*public void addUsers() {
        UserServiceImpl.getInstance().addUsers();
    }*/

    public List<User> findUsersByName(Scanner input) {
        return user.findUsersByName(input);
    }

    public List<User> findUserByJob(Scanner input) {
        return user.findUserByJob(input);
    }

    public String countUsers() {
        System.out.println("현재 회원 수는 " + user.countUsers() + " 명입니다.");
        return user.countUsers();
    }
}
