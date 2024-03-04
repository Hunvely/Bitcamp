package model;

import lombok.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
@ToString(exclude = {"id"})

public class Subject {

    private int id;
    private int korean;
    private int english;
    private int math;

    @Builder(builderMethodName = "builder")
    public Subject(int id, int korean, int english, int math) {
        this.id = id;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
}
