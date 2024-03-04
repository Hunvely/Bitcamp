package serviceImpl;

import model.Account;
import service.AccountService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();
    List<Account> accounts;

    public static AccountService getInstance() {
        return instance;
    }

    private AccountServiceImpl() {
        this.accounts = new ArrayList<>();
    }

    @Override
    public String createAccount(Account account) {
        accounts.add(account);
        return account.getAccountHolder() + "'s Account creation completed.";
    }

    @Override
    public String deposit(Account account) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(account.getAccountNumber())) {
                double depositAmount = account.getBalance();
                double currentBalance = acc.getBalance();
                double updateBalance = depositAmount + currentBalance;

                acc.setBalance(updateBalance);
                acc.setTransactionDate(LocalDate.now());

                return acc.getAccountHolder() + "'s deposit is completed. Current balance of " + acc.getAccountHolder() + "'s account : " + acc.getBalance() + "won";
            }
        }
        return "Sorry. Deposit failed. The account doesn't exist.";
    }


    @Override
    public String withdraw(Account account) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(account.getAccountNumber())) {
                double withdrawAmount = account.getBalance();
                double currentBalance = acc.getBalance();
                double updateBalance = currentBalance - withdrawAmount;

                if (updateBalance >= 0) {
                    acc.setBalance(updateBalance);
                    acc.setTransactionDate(LocalDate.now());

                    return acc.getAccountHolder() + "'s withdrawal is completed. Current balance of " + acc.getAccountHolder() + "'s account : " + acc.getBalance() + "won";
                } else {
                    return "Sorry. Withdrawal is failed. Your balance is insufficient.";
                }
            }
        }
        return "Sorry. Withdrawal is failed. The account doesn't exist.";
    }

    @Override
    public String getBalance(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return "Current balance of " + acc.getAccountHolder() + "'s account : " + acc.getBalance();
            }
        }
        return "Sorry. The account not found.";
    }

    @Override
    public String cancelAccount(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                accounts.remove(acc);
                return "The account has been deleted. Thank you.";
            }
        }
        return null;
    }

    @Override
    public List<Account> getAccounts(String accountNumber) {
        for (Account acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return accounts;
            }
        }
        //return "Sorry. The account not found.";
        return null;
    }
}
