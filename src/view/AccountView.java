package view;

import controller.AccountController;
import model.AccountDto;

import java.util.List;
import java.util.Scanner;

public class AccountView {

    public static void main(Scanner input) {

        AccountController accountCtrl = new AccountController();

        while (true) {
            System.out.println("========================================================== 은행 프로그램 메뉴 ==========================================================");
            System.out.println(" | 0 - 종료 | 1 - Create account Menu | 2 - Deposit Menu | 3 - Withdraw Menu | 4 - Check your balance Menu | 5 - Account Cancellation Menu | 6 - Load Account Menu | ");

            String menuSelect = input.next();

            switch (menuSelect) {
                case "0":
                    System.out.println(" === Close the banking program. === ");
                    return;
                case "1":
                    System.out.println(" === Start Create account === ");
                    accountCtrl.createAccount(input);
                    break;
                case "2":
                    System.out.println(" === Start Deposit Menu === ");
                    accountCtrl.deposit(input);
                    break;
                case "3":
                    System.out.println(" === Start Withdraw Menu === ");
                    accountCtrl.withdraw(input);
                    break;
                case "4":
                    System.out.println(" === Start Check your balance Menu");
                    accountCtrl.getBalance(input);
                    break;
                case "5":
                    System.out.println(" === Start account cancellation Menu === ");
                   // List<AccountDto> checkBalance(input);
                    accountCtrl.cancelAccount(input);
                    break;
                case "6":
                    System.out.println(" === Start Load Account Menu === ");
                    accountCtrl.getAccounts(input);
                    break;
            }
        }
    }
}


