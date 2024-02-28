package service;

import model.UserDto;

import java.util.List;

public interface UserService {

    String join(UserDto user);

    String login(UserDto user);

    UserDto findUserById(String username);

    void updatePassword(UserDto userDto);

    String deleteUser(String username);

    List<UserDto> getUserList();

    List<UserDto> findUsersByName(String name);

    List<UserDto> findUserByJob(String job);

    int countUsers();
}
