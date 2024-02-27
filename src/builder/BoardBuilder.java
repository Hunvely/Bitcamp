package builder;

import model.BoardDto;

public class BoardBuilder {

    private String title;
    private String contnet;
    private String writer;

    public BoardBuilder title(String title) {
        this.title = title;
        return this;
    }

    public BoardBuilder content(String contnet) {
        this.contnet = contnet;
        return this;
    }

    public BoardBuilder writer(String writer) {
        this.writer = writer;
        return this;
    }

    public BoardDto build() {
        return new BoardDto(title,contnet,writer);
    }
}

