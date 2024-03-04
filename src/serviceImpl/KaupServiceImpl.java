package serviceImpl;

import model.User;
import service.KaupService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KaupServiceImpl implements KaupService {

    private static KaupService instance = new KaupServiceImpl();

    Map<String, User> users;
    List<User> kaupList;

    private KaupServiceImpl() {
        users = new HashMap<>();
        kaupList = new ArrayList<>();
    }

    public static KaupService getInstance() {
        return instance;
    }


    @Override
    public double createBmi(User user) {
        double height = user.getHeight();
        double weight = user.getWeight();
        double bmi = weight / ((height / 100) * (height / 100));
        return bmi;
    }

    @Override
    public String createBodyMass(double bmi) {
        String bodyMass = "";

        if (bmi < 18.5) {
            bodyMass = "저체중";
        }
        if (bmi > 18.5 && bmi < 23) {
            bodyMass = "정상";
        }
        if (bmi > 23 && bmi < 25) {
            bodyMass = "과체중";
        }
        if (bmi > 25) {
            bodyMass = "비만";
        }
        return bodyMass;
    }
}
