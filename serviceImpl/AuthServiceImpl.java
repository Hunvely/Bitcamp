package serviceImpl;

import builder.UserBuilder;
import model.UserDto;
import service.AuthService;
import service.UtilService;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AuthServiceImpl implements AuthService {


    private static AuthService instance = new AuthServiceImpl();

    Map<String, UserDto> users;

    private AuthServiceImpl() { // 기본 생성자 비공개로 생성.
        this.users = new HashMap<>(); // 호출할 때만 객체가 생성됨.
    }

    public static AuthService getInstance() { // 정적 생성 메서드
        return instance;
    }

    @Override
    public String join(Scanner input) {
        System.out.println("ID, 비밀번호, 비밀번호 확인, 이름, 주민 번호," +
                " 전화번호, 주소, 직업을 순서대로 입력하세요.");

        UserDto userInfo = new UserBuilder()
                .username(input.next())
                .password(input.next())
                .repassword(input.next())
                .name(input.next())
                .socialSecurityNumber(input.next())
                .phoneNumber(input.next())
                .address(input.next())
                .job(input.next())
                .build()
                ;
        return null;
    }

    @Override
    public String login() {
        return null;
    }

    @Override
    public String addUsers() {
        Map<String, UserDto> map = new HashMap<>();
        UtilService util = UtilServiceImpl.getInstance();
        for (int i = 0; i < 5; i++) {
            String username = util.createRandomUsername();
            map.put(username,
                    new UserBuilder()
                            .username(username)
                            .password("1")
                            .repassword("1")
                            .name(util.createRandomName())
                            .build());
        }
        users = map;
        return "더미값 추가";
    }

    @Override
    public UserDto findUser(String username) {
        UserDto user = new UserBuilder().build();
        return user;
    }

    @Override
    public Map<String, UserDto> getUserMap() {
        users.forEach((k,v)-> System.out.println("{"+k+","+v+"},"));
        return users;
    }

    @Override
    public String count() {
        return users.size() + "";
    }
}
