package serviceImpl;

import builder.AccountBuilder;
import model.AccountDto;
import service.AccountService;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();
    List<AccountDto> accounts;

    public static AccountService getInstance() {
        return instance;
    }

    private AccountServiceImpl() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public String createAccount(AccountDto account, Scanner input) {
        System.out.print("등록할 계좌번호를 입력하세요 : ");
        String userAccount = input.next();

        return null;
    }

    @Override
    public String deposit(AccountDto account, Scanner input) {
        return null;
    }

    @Override
    public String withdraw(AccountDto account, Scanner input) {
        return null;
    }

    @Override
    public String getBalance(String accountNumber) {
        return null;
    }

    @Override
    public String cancelAccount(String accountNumber) {
        return null;
    }

    @Override
    public List<AccountDto> getAccounts() {
        return null;
    }
}
