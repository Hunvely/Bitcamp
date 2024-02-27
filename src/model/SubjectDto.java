package model;

public class SubjectDto {

    private int id;
    private int korean;
    private int english;
    private int math;

    public SubjectDto(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public int getKorean() {
        return korean;
    }

    public void setKorean(int korean) {
        this.korean = korean;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public String toString() {
        return "SubjectDto{" +
                "korean=" + korean +
                ", english=" + english +
                ", math=" + math +
                '}';
    }
}
