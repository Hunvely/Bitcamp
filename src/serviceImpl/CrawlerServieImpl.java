package serviceImpl;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import service.CrawlerServie;

import java.io.IOException;

public class CrawlerServieImpl implements CrawlerServie {
    @Override
    public void fineNameFromWeb() throws IOException {
        Document doc = Jsoup.connect("웹데이터를 가져올 주소").get();
    }
}
