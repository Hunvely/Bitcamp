package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString(exclude = {"id"}) // id를 제외하고 출력함. 빼고 싶은 것들 넣으면 됨

public class StudentGrade {

    private int id;
    private String name;
    private int scoreOfKorean;
    private int scoreOfEnglish;
    private int scoreOfMath;

    @Builder(builderMethodName = "builder")
    public StudentGrade(int id, String name, int scoreOfKorean, int scoreOfEnglish, int scoreOfMath) {
        this.id = id;
        this.name = name;
        this.scoreOfKorean = scoreOfKorean;
        this.scoreOfEnglish = scoreOfEnglish;
        this.scoreOfMath = scoreOfMath;
    }
}
