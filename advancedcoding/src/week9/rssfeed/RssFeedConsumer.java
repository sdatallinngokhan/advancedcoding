package week9.rssfeed;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.net.URL;

public class RssFeedConsumer {

    public static void main(String[] args) {
        try {
            String url = "http://feeds.bbci.co.uk/news/world/rss.xml";
            XmlReader xmlReader = new XmlReader(new URL(url));
            SyndFeed syndFeed = new SyndFeedInput().build(xmlReader);

            for (SyndEntry syndEntry : syndFeed.getEntries()) {
                System.out.println(syndEntry.getTitle());
                System.out.println(syndEntry.getPublishedDate());
                System.out.println(syndEntry.getLink());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
