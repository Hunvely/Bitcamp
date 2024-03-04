package view;

import model.Board;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {

    public static void main() {

        List<Board> articles = new ArrayList<>();

        UtilService util = UtilServiceImpl.getInstance();

        Board article = Board.builder()
                .title(util.createRandomTitle())
                .content((util.createRandomContent()))
                .writer(util.createRandomName())
                .build();

        for (int i = 0; i < 5; i++) {
            articles.add(Board.builder()
                            .title(util.createRandomTitle())
                            .content((util.createRandomContent()))
                            .writer(util.createRandomName())
                            .build());
        }


        //for-each 문
        for (Board boardDto : articles) {
            System.out.println(boardDto.toString());
        }

        System.out.println();

        //람다식 for문의 최종
        articles.forEach(i -> {
            System.out.println(i.toString());
        });
    }
}
