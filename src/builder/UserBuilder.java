package builder;

import model.UserDto;

public class UserBuilder {

    private String username;
    private String password;
    private String rePassword;
    private String name;
    private String socialSecurityNumber;
    private String phoneNumber;
    private String address;
    private String job;
    private double weight;
    private double height;

    public UserBuilder username(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder password(String password) {
        this.password = password;
        return this;
    }

    public UserBuilder repassword(String rePassword) {
        this.rePassword = rePassword;
        return this;
    }

    public UserBuilder name(String name) {
        this.name = name;
        return this;
    }

    public UserBuilder socialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
        return this;
    }

    public UserBuilder phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public UserBuilder address(String address) {
        this.address = address;
        return this;
    }

    public UserBuilder job(String job) {
        this.job = job;
        return this;
    }

    public UserBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }

    public UserBuilder height(double height) {
        this.height = height;
        return this;
    }

    public UserDto build() {
        return new UserDto(username, password, rePassword, name, socialSecurityNumber, phoneNumber, address, job, weight, height);
    }
}
