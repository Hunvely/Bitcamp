package Algorithms;

import java.util.Random;

public class Lotto {

    public static void main(String[] args) {

        LottoNum lottoNum = new LottoNumImpl();

        int lottoNumber[] = new int[6];
        int winningLotto[] = new int[6];

        lottoNumber = lottoNum.createArrayWithoutDuplication(lottoNumber);
        lottoNumber = lottoNum.sortLottoNumber(lottoNumber);
        lottoNum.printLotto(lottoNumber);

    }
}

// 로또 구입
interface BuyLotto {
    int[] butLotto();
}

// 로또 구입 기능 구현
class BuyLottoImpl implements BuyLotto {
    @Override
    public int[] butLotto() {
        return new int[0];
    }
}

// 로또 번호
interface LottoNum {

    // 로또 번호 랜덤 생성
    int createRandemLottoNumber(int start, int end);

    // 로또 번호 중복 제거
    int[] createArrayWithoutDuplication(int[] lottoNum);

    // 로또 버블 정렬
    int[] sortLottoNumber(int[] lottoNum);

    // 로또 출력
    void printLotto(int[] lottoNum);
}

// 로또 번호 기능 구현
class LottoNumImpl implements LottoNum {

    // 로또 번호 랜덤 생성
    @Override
    public int createRandemLottoNumber(int start, int end) {
        Random random = new Random();
        return random.nextInt(end - start + 1) + start;
    }

    // 로또 번호 중복 제거
    @Override
    public int[] createArrayWithoutDuplication(int[] lottoNum) {
        for (int i = 0; i < lottoNum.length; i++) {
            lottoNum[i] = createRandemLottoNumber(1, 45);
            for (int j = 0; j < i; j++) {
                if (lottoNum[i] == lottoNum[j]) {
                    i--;
                    break;
                }
            }
        }
        return lottoNum;
    }

    // 로또 버블 정렬
    @Override
    public int[] sortLottoNumber(int[] lottoNum) {

        for (int i = 0; i < lottoNum.length; i++) {
            for (int j = i + 1; j < lottoNum.length; j++) {
                int temp;
                if (lottoNum[i] > lottoNum[j]) {
                    temp = lottoNum[i];
                    lottoNum[i] = lottoNum[j];
                    lottoNum[j] = temp;
                }
            }
        }
        return lottoNum;
    }

    // 로또 출력
    @Override
    public void printLotto(int[] lottoNum) {
        System.out.print("로또 번호 : ");
        for (int i = 0; i < lottoNum.length; i++) {
            System.out.print(lottoNum[i] + " ");
        }
    }
}

// 로또 당첨
interface LottoWin {
}

// 로또 당첨 기능 구현
class LottoWinImpl implements LottoWin {

}