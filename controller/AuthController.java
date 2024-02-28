package controller;

import model.UserDto;
import service.AuthService;
import serviceImpl.AuthServiceImpl;

import java.util.Map;
import java.util.Scanner;

public class AuthController{

    AuthService auth;

    public AuthController()  {
        this.auth = AuthServiceImpl.getInstance(); // 매개 변수를 생성자를 통해 AuthServie auth = AuthServiceImpl.getIstance()가 메모리에 항상 상주하는 것이 아니라 사용할 때만 메모리를 점유함.
    }

    public String join(Scanner input) {
        return auth.join(input);
    }

    public String login() {
        return auth.login();
    }

    public String addUsers() {
        auth.addUsers();
        return "";
    }

    public UserDto findUser(String username) {
        auth.findUser(username);
        return null;
    }

    public Map<String, UserDto> getUserMap() {
        return auth.getUserMap();
    }

    public String count() {
        System.out.println("회원 수 : " + auth.count() + " 명");
        return auth.count();
    }
}
