package service;

import model.UserDto;

public interface KaupService {


    public double createBmi(UserDto user);

    public String createBodyMass(double bmi);
}
