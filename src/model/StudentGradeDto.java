package model;

public class StudentGradeDto {

    private int id;
    private String name;
    private int scoreOfKorean;
    private int scoreOfEnglish;
    private int scoreOfMath;

    public StudentGradeDto(String name, int scoreOfKorean, int scoreOfEnglish, int scoreOfMath) {
        this.name = name;
        this.scoreOfKorean = scoreOfKorean;
        this.scoreOfEnglish = scoreOfEnglish;
        this.scoreOfMath = scoreOfMath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScoreOfKorean() {
        return scoreOfKorean;
    }

    public void setScoreOfKorean(int scoreOfKorean) {
        this.scoreOfKorean = scoreOfKorean;
    }

    public int getScoreOfEnglish() {
        return scoreOfEnglish;
    }

    public void setScoreOfEnglish(int scoreOfEnglish) {
        this.scoreOfEnglish = scoreOfEnglish;
    }

    public int getScoreOfMath() {
        return scoreOfMath;
    }

    public void setScoreOfMath(int scoreOfMath) {
        this.scoreOfMath = scoreOfMath;
    }

    @Override
    public String toString() {
        return "StudentGradeDto{" +
                "name='" + name + '\'' +
                ", scoreOfKorean=" + scoreOfKorean +
                ", scoreOfEnglish=" + scoreOfEnglish +
                ", scoreOfMath=" + scoreOfMath +
                '}';
    }
}
