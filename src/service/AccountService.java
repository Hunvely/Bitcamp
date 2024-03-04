package service;

import model.Account;

import java.util.List;
import java.util.Scanner;

public interface AccountService {

    public String createAccount(Account account);

    public String deposit(Account account);

    public String withdraw(Account account);

    String getBalance(String accountNumber);

    String cancelAccount(String accountNumber);

    public List<Account> getAccounts(String accountNumber);

}
