package service;

import model.User;

public interface KaupService {


    public double createBmi(User user);

    public String createBodyMass(double bmi);
}
