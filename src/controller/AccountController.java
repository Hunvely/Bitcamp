package controller;

import model.Account;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class AccountController {

    AccountService accountService;

    public AccountController() {
        this.accountService = AccountServiceImpl.getInstance();
    }

    public String createAccount(Scanner input) {
        System.out.println("Please input [sequence] [account] [accountHolder] [balance] you wish to register");
        System.out.print("[Input] : ");
        return accountService.createAccount(Account.builder()
                .id(input.nextLong())
                .accountNumber(input.next())
                .accountHolder(input.next())
                .balance(input.nextDouble())
                .transactionDate(LocalDate.now())
                .build());

    }

    public String deposit(Scanner input) {
        System.out.println("Input the amount you wish to deposit.");
        System.out.print("[Input Account Number] [Input Deposit Amount] : ");
        return accountService.deposit(Account.builder()
                .accountNumber(input.next())
                .balance(input.nextDouble())
                .transactionDate(LocalDate.now())
                .build());
    }

    public String withdraw(Scanner input) {
        System.out.println("Input the amount you wish to withdraw.");
        System.out.print("[Input Account Number] [Input Withdraw Amount] : ");
        return accountService.withdraw(Account.builder()
                .accountNumber(input.next())
                .balance(input.nextDouble())
                .transactionDate(LocalDate.now())
                .build());
    }

    public String getBalance(Scanner input) {
        System.out.println("Enter the account number to check your balance.");
        System.out.print("[Input] : ");
        return accountService.getBalance(input.next());
    }

    public String cancelAccount(Scanner input) {
        System.out.println("Enter the account number you wish to delete.");
        System.out.print("[Input] : ");
        return accountService.cancelAccount(input.next());
    }

    public List<Account> getAccounts(Scanner input) {
        System.out.println("Enter the account number for which you want to search account details.");
        System.out.print("[Input] : ");
        return accountService.getAccounts(input.next());
    }
}
