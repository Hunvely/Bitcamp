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

        UserController userCtrl = new UserController(); // 메서드 안에 있기 때문에 객체 바로 선언. 필드일 경우 메모리 누수를 막기 위해 생성자를 이용해서 객체 생성해야함.
        // userCtrl.addUsers();

        while (true) {
            System.out.println("[메뉴] | 0 - 종료\n" +
                    " 1 - 회원가입\n" +
                    " 2 - 로그인\n" +
                    " 3 - 마이페이지\n" +
                    " 4 - 비밀번호 변경 \n" +
                    " 5 - 회원탈퇴\n" +
                    " 6 - 회원목록\n" +
                    " 7 - 이름검색\n" +
                    " 8 - 직업검색\n" +
                    " 9 - 회원 수");
            switch (input.next()) {
                case "0":
                    System.out.println("종료");
                    return;
                case "1":
                    System.out.println("=== 회원가입을 진행합니다. ===");
                    userCtrl.join(input);
                    break;
                case "2":
                    System.out.println("=== 로그인을 진행합니다. ===");
                    userCtrl.login(input);
                    break;
                case "3":
                    System.out.println("=== 마이페이지로 이동합니다. ===");
                    userCtrl.findUserById(input);
                    break;
                case "4":
                    System.out.println("=== 비밀번호를 변경합니다. ===");
                    userCtrl.updatePassword(input);
                    break;
                case "5":
                    System.out.println("=== 회원탈퇴를 진행합니다. ===");
                    userCtrl.deleteUser(input);
                    break;
                case "6":
                    System.out.println("=== 회원 목록을 조회합니다. ===");
                    userCtrl.getUserInfo();
                    break;
                case "7":
                    System.out.println("=== 회원 이름으로 검색합니다. ===");
                    break;
                case "8" :
                    System.out.println("=== 회원의 직업으로 검색합니다. ===");
                    break;
                case "9":
                    System.out.println("=== 회원의 수를 조회합니다. ===");
                    userCtrl.countUsers();
                    break;


            }
        }
    }
}
