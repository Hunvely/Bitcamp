package serviceImpl;

import builder.UserBuilder;
import model.UserDto;
import service.UserService;

import java.util.*;

public class UserServiceImpl implements UserService {

    private static UserService instance = new UserServiceImpl();

    public static UserService getInstance() {
        return instance;
    }

    Map<String, UserDto> users;

    List<String> list;

    private UserServiceImpl() {
        this.users = new HashMap<>();
        this.list = new ArrayList<String>();
    }


    @Override
    public String join(Scanner input) {
        System.out.println("아이디 | 비밀번호 | 비밀번호 확인 | 이름 | 주민번호 | 전화번호 | 주소 | 직업 순으로 입력하세요.");
        String username = input.next();
        users.put(username,
                new UserBuilder()
                        .username(username)
                        .password(input.next())
                        .repassword(input.next())
                        .name(input.next())
                        .socialSecurityNumber(input.next())
                        .phoneNumber(input.next())
                        .address(input.next())
                        .job(input.next())
                        .build());
        System.out.println(username.toString() + "님 회원 가입을 축하합니다 ~ ");
        return "";
    }

  /*  @Override
    public String addUsers() {
        return null;
    }*/

    @Override
    public String login(Scanner input) {
        System.out.print("ID를 입력하세요 : ");
        String username = input.next();

        UserDto user = users.get(username);
        if (user != null) {
            System.out.print("비밀번호를 입력하세요 : ");
            String userPassword = input.next();

            if (userPassword.equals(user.getPassword())) {
                System.out.println("로그인에 성공했습니다!");
            }
            else System.out.println("로그인에 실패했습니다!");
        }
        else System.out.println("아이디가 존재하지 않습니다.");

        return "로그인이 성공적으로 되었습니다.";
    }

    @Override
    public UserDto findUserById(Scanner input) {
        System.out.print("검색 할 ID를 입력하세요 : ");
        String userId = input.next();

        UserDto user = users.get(userId);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("아이디가 존재하지 않습니다");
        }

        return null;
    }

    @Override
    public String updatePassword(Scanner input) {
        System.out.print("아이디를 입력하세요 : ");
        String username = input.next();
        UserDto user = users.get(username);
        if (user != null) {
            System.out.print("변경 비밀번호를 입력하세요 : ");
            String rePassword = input.next();
            user.setPassword(rePassword);
            System.out.println("비밀번호가 변경되었습니다.");
        } else {
            System.out.println("비밀번호가 변경되지 않았습니다. ");
        }
        return null;
    }

    @Override
    public UserDto deleteUser(Scanner input) {
        System.out.print("탈퇴 할 아이디를 입력하세요 : ");
        String userId = input.next();

        UserDto user = users.get(userId);
        if (userId.equals(user.getUsername())) {
            users.remove(userId);
            System.out.println("탈퇴가 완료되었습니다.");
        } else {
            System.out.println("입력한 아이디가 올바르지 않습니다.");
        }
        return null;
    }

    @Override
    public List<UserDto> getUserInfo(Scanner input) {
       // users.forEach((k, v) -> System.out.println("{" + k + "," + v + "},"));
        return new ArrayList<>(users.values());
    }

    @Override
    public List<UserDto> findUsersByName(Scanner input) {
        System.out.print("찾는 회원의 이름을 입력하세요 : ");
        String name = input.next();
        UserDto userName = users.get(name);
        if (userName != null) {
            System.out.println(userName);
        } else {
            System.out.println("찾는 회원의 이름이 존재하지 않습니다.");
        }
        return null;
    }

    @Override
    public List<UserDto> findUserByJob(Scanner input) {
        System.out.print("찾는 회원의 직업을 검색하세요 : ");
        String job = input.next();
        UserDto userJob = users.get(job);
        if (userJob != null) {
            System.out.println(userJob);
        } else {
            System.out.println("찾는 회원의 직업이 존재하지 않습니다.");
        }
        return null;
    }

    @Override
    public String countUsers() {
        return users.size() + "";
    }
}
