package view;

import builder.SubjectBuilder;
import builder.UserBuilder;
import model.StudentGradeDto;
import model.SubjectDto;
import model.UserDto;
import service.GradeService;
import service.UtilService;
import serviceImpl.GradeServiceImpl;
import serviceImpl.UtilServiceImpl;

import java.util.Scanner;

public class GradeView {

    public static void main(Scanner input) {


        System.out.println("한 학생 과목 점수");
        System.out.println(" 이름 : ");
        System.out.println("국어 점수 : ");
        System.out.println("영어 점수: ");
        System.out.println("수학 점수 : ");
        System.out.println("평균 점수 : ");

        UtilService util = UtilServiceImpl.getInstance();
        GradeService grade = GradeServiceImpl.getInstance();

        UserDto student = new UserBuilder()
                .name(input.next())
                .build();

        SubjectDto subjects = new SubjectBuilder()
                .korean(util.createRandomInterger(0, 100))
                .english(util.createRandomInterger(0, 100))
                .math(util.createRandomInterger(0, 100))
                .build();

        int totalScores = grade.getGradeSum(subjects.getKorean(),subjects.getEnglish(),subjects.getMath());
        double averageScores = grade.getGradeAvg(totalScores);

        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : " + student.getUserName());
        System.out.println("국어 점수 : " + subjects.getKorean());
        System.out.println("영어 점수 : " + subjects.getEnglish());
        System.out.println("수학 점수 : " + subjects.getMath());
        System.out.println("점수 총합 : " + totalScores);
        System.out.println("점수 평균 : " + averageScores);

    }
}
