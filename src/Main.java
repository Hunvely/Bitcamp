import view.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println(" 0 - 종료 | 1 - 회원관리 | 2 - 성적표 | 3 - 게시판 | 4 - Kaup | 5 - 사용자관리(맵)");
            System.out.print("메뉴를 선택하세요 : ");
            String munuSelect = input.nextLine();

            switch (munuSelect) {
                case "0":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                case "1":
                    System.out.println("회원관리를 진행합니다");
                    AuthView.main(input);
                    break;
                case "2":
                    System.out.println("성적표 메뉴로 이동합니다.");
                    GradeView.main(input);
                    break;
                case "3":
                    System.out.println("게시판으로 입장합니다.");
                    BoardView.main();
                    break;
                case "4":
                    System.out.println("Kaup지수를 구하는 메뉴입니다.");
                    KaupView.main(input);
                    System.out.println();
                    break;
                case "5":
                    System.out.println("사용자 관리 메뉴");
                    UserView.main(input);
                    System.out.println();
                    break;
            }
        }
    }
}