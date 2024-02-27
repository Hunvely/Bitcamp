package serviceImpl;

import model.UserDto;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Override
    public String join(UserDto user) {
        return null;
    }

    @Override
    public String login(UserDto user) {
        return null;
    }

    @Override
    public UserDto findUserById(String username) {
        return null;
    }

    @Override
    public void updatePassword(UserDto userDto) {

    }

    @Override
    public String deleteUser(String username) {
        return null;
    }

    @Override
    public List<UserDto> getUserList() {
        return null;
    }

    @Override
    public List<UserDto> findUsersByName(String name) {
        return null;
    }

    @Override
    public List<UserDto> findUserByJob(String job) {
        return null;
    }

    @Override
    public int countUsers() {
        return 0;
    }
}
