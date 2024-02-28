package controller;

import model.UserDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.HashMap;
import java.util.Map;

public class UserController {


    private Map<String, UserDto> users;

    public UserController() {
        this.users = new HashMap<>();
    }

    public void addUsers() {
        AuthServiceImpl.getInstance().addUsers();
    }

    void findUser(String username) {
        System.out.println(users.get(username).toString());
    }

    // 서비스에 있는 거 다 끌고 와야함

}
