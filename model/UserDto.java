package model;

public class UserDto {

    private int id;
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

    public String getUserId() {
        return username;
    }

    public void setUserId(String userId) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }

    public String getUserName() {
        return name;
    }

    public void setUserName(String userName) {
        this.name = name;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // 싱글톤 패턴을 위해 모든 필드를 포함하는 생성자 만듦.
    public UserDto(String username, String password, String rePassword, String name, String socialSecurityNumber, String tell, String address, String job, double weight, double height) {
        this.username = username;
        this.password = password;
        this.rePassword = rePassword;
        this.name = name;
        this.socialSecurityNumber = socialSecurityNumber;
        this.phoneNumber = tell;
        this.address = address;
        this.job = job;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "userId='" + username + '\'' +
                ", password='" + password + '\'' +
                ", rePassword='" + rePassword + '\'' +
                ", userName='" + name + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", job='" + job + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
