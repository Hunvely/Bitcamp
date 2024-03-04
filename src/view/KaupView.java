package view;

import model.User;
import service.KaupService;
import service.UtilService;
import serviceImpl.KaupServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class KaupView {

    public static void main(Scanner input) {

        UtilService util = UtilServiceImpl.getInstance();

        User person = User.bulder()
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
