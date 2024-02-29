package builder;

import model.AccountDto;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class AccountBuilder {

    private long id;

    private String accountNumber;

    private String accountHolder;

    private double balance;

    private LocalDate transactionDate;

    public AccountBuilder id(long id) {
        this.id = id;
        return this;
    }

    public AccountBuilder accountNum(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public AccountBuilder accountHold(String accountHolder) {
        this.accountHolder = accountHolder;
        return this;
    }

    public AccountBuilder balance(double balance) {
        this.balance = balance;
        return this;
    }

    public AccountBuilder date(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return this;
    }

    public AccountDto build() {
        return new AccountDto(id,accountNumber,accountHolder,balance,transactionDate);
    }
}
