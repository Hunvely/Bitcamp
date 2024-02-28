package view;

import builder.BoardBuilder;
import model.BoardDto;
import service.UtilService;
import serviceImpl.UtilServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class BoardView {

    public static void main() {

        List<BoardDto> articles = new ArrayList<>();

        UtilService util = UtilServiceImpl.getInstance();

        BoardDto article = new BoardBuilder()
                .title(util.createRandomTitle())
                .content((util.createRandomContent()))
                .writer(util.createRandomName())
                .build();

        for (int i = 0; i < 5; i++) {
            articles.add(new BoardBuilder()
                            .title(util.createRandomTitle())
                            .content((util.createRandomContent()))
                            .writer(util.createRandomName())
                            .build());
        }


        //for-each 문
        for (BoardDto boardDto : articles) {
            System.out.println(boardDto.toString());
        }

        System.out.println();

        //람다식 for문의 최종
        articles.forEach(i -> {
            System.out.println(i.toString());
        });
    }
}
