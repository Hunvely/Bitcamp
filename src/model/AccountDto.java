package model;

import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class AccountDto {

    private long id;

    private String accountNumber;

    private String accountHolder;

    private double balance;

    private LocalDate transactionDate;

}
