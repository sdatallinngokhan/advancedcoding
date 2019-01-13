package week9.rssfeed;

import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.net.URL;

public class RssFeedReaderAndWriterToFile {

    public String getRssFeed() {
        StringBuilder sb = new StringBuilder();
        try {
            String url = "http://feeds.bbci.co.uk/news/world/rss.xml";
            XmlReader xmlReader = new XmlReader(new URL(url));
            SyndFeed syndFeed = new SyndFeedInput().build(xmlReader);

            for (SyndEntry syndEntry : syndFeed.getEntries()) {
                sb.append(syndEntry.getTitle().toUpperCase());
                sb.append("\n");
                sb.append(syndEntry.getLink());
                sb.append("\n");
                sb.append(syndEntry.getPublishedDate());
                sb.append("\n");
                sb.append("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public void writeFile(String rssNews) {
        try {
            File file = new File("/Users/gokhanpolat/Developer/tallinn3/rss.txt");
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.print(rssNews);

            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RssFeedReaderAndWriterToFile rssFeedReaderAndWriterToFile = new RssFeedReaderAndWriterToFile();

        String rssNews = rssFeedReaderAndWriterToFile.getRssFeed();

        rssFeedReaderAndWriterToFile.writeFile(rssNews);
    }
}
