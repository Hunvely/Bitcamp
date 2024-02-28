package controller;

import model.UserDto;
import service.UserService;
import serviceImpl.UserServiceImpl;

import java.util.List;
import java.util.Map;
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

    public UserDto findUserById(Scanner input) {
        return user.findUserById(input);
    }

    public String updatePassword(Scanner input) {
        return user.updatePassword(input);
    }

    public UserDto deleteUser(Scanner input) {
        return user.deleteUser(input);
    }

    public Map<String, UserDto> getUserInfo() {
        user.getUserInfo();
        return (Map<String, UserDto>) user;
    }


    /*public void addUsers() {
        UserServiceImpl.getInstance().addUsers();
    }*/

    public List<UserDto> findUsersByName(Scanner input) {
        return user.findUsersByName(input);
    }

    public String countUsers() {
        System.out.println("현재 회원 수는 " + user.countUsers() + " 명입니다.");
        return user.countUsers();
    }

    // 서비스에 있는 거 다 끌고 와야함

}
