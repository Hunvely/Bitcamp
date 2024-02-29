package service;

import model.UserDto;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public interface UserService {

    String join(Scanner input);

    //String addUsers();

    String login(Scanner input);

    UserDto findUserById(Scanner input);

    String updatePassword(Scanner input);

    UserDto deleteUser(Scanner input);

    public List<UserDto> getUserInfo(Scanner input);

    List<UserDto> findUsersByName(Scanner input);

    List<UserDto> findUserByJob(Scanner input);

    String countUsers();
}
