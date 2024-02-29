package controller;

import builder.AccountBuilder;
import model.AccountDto;
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
        System.out.println("계좌번호와 예금주를 입력하시오.");
        return accountService.createAccount(new AccountBuilder()
                .id(input.nextLong())
                .accountNum(input.next())
                .accountHold(input.next())
                .balance(input.nextDouble())
                .date(LocalDate.now())
                .build(), input);
    }

    public String deposit(Scanner input) {
        return accountService.deposit(new AccountBuilder()
                .id(input.nextLong())
                .accountNum(input.next())
                .accountHold(input.next())
                .balance(input.nextDouble())
                .date(LocalDate.now())
                .build(), input);
    }

    public String withdraw(Scanner input) {
        return accountService.withdraw(new AccountBuilder()
                .id(input.nextLong())
                .accountNum(input.next())
                .accountNum(input.next())
                .balance(input.nextDouble())
                .date(LocalDate.now())
                .build(), input);
    }

    public String getBalance(Scanner input) {
        return accountService.getBalance(input.next());
    }

    public String cancelAccount(Scanner input) {
        return accountService.cancelAccount(input.next());
    }

    public List<AccountDto> getAccounts(Scanner input) {
        return accountService.getAccounts();
    }
}
