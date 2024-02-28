package view;

import controller.AuthController;
import controller.UserController;
import model.UserDto;
import service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserView {

    public static void main(Scanner input) {

        AuthController ctrl = new AuthController();
        ctrl.addUsers();

        while (true) {
            System.out.println("[메뉴] | 0 - 종료\n" +
                    " 1 - 회원가입\n" +
                    " 2 - 로그인\n" +
                    " 3 - 마이페이지\n" +
                    " 4 - 회원정보 변경 \n" +
                    " 5 - 회원탈퇴\n" +
                    " 6 - 회원목록\n" +
                    " 7 - 이름검색\n" +
                    " 8 - 직업검색\n" +
                    " 9 - 회원 수");
            switch (input.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "6":
                    System.out.println("=== 회원 목록 ===");


            }
        }
    }
}
