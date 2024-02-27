package serviceImpl;

import service.GradeService;
import service.UtilService;

public class GradeServiceImpl implements GradeService {

    private static GradeService instance = new GradeServiceImpl();

    private GradeServiceImpl() {
    }

    public static GradeService getInstance() {
        return instance;
    }

    @Override
    public int getGradeSum(int k, int e, int m) {
        int kScore = k;
        int eScore = e;
        int mScore = m;
        int totalScore = kScore + eScore + mScore;
        return totalScore;
    }

    @Override
    public double getGradeAvg(int totalScore) {
        double avg = (double)totalScore / 3;
        return avg;
    }
}

