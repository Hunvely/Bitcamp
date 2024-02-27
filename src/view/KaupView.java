package view;

import builder.UserBuilder;
import model.UserDto;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.sql.SQLOutput;
import java.util.Scanner;

public class KaupView {

    public static void main(Scanner input) {

        UtilService util = UtilServiceImpl.getInstance();

        UserDto person = new UserBuilder()
                .height(util.createHeight())
                .weight(util.createWeight())
                .build();

        KaupService kaup = KaupServiceImpl.getInstance();

        double bmi = kaup.createBmi(person);
        String bodyMass = kaup.createBodyMass(bmi);

        System.out.print("================= BMI 계산기 =================\n " +
                "BMI : " + bmi + " 체질량 : " + bodyMass + "\n" +
                "================= BMI 계산기 =================");

    }
}
