package service;

import model.AccountDto;

import java.util.List;
import java.util.Scanner;

public interface AccountService {

    String createAccount(AccountDto account, Scanner input);

    String deposit(AccountDto account, Scanner input);

    String withdraw(AccountDto account, Scanner input);

    String getBalance(String accountNumber);

    String cancelAccount(String accountNumber);

    List<AccountDto> getAccounts();

}
