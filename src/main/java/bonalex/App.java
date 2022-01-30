package bonalex;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws IOException {
        List<Post> posts = new ArrayList<>();
        System.out.println("Connecting to main page ");
        Document doc = Jsoup.connect("https://4pda.to/").get();
        Elements postTitleElements = doc.getElementsByAttributeValue("itemprop", "url");

        for (Element postTitleElement : postTitleElements) {
            String detailsLink = postTitleElement.attr("href");
            Post post = new Post();
            post.setDetailLink(detailsLink);
            post.setTitle(postTitleElement.attr("title"));
            System.out.println("Connecting to post: " + detailsLink);
            Document postDetailsDoc = Jsoup.connect(detailsLink).get();
            try {
                Element authorElement = postDetailsDoc.getElementsByClass("name").first().child(0);
                post.setAuthor(authorElement.text());
                post.setDetailLink(authorElement.attr("href"));
                post.setDateOfCreated(postDetailsDoc.getElementsByClass("date").first().text());
            } catch (NullPointerException e) {
                post.setAuthor("Author not determinated");
                post.setAuthorDetailsLink("No link");
                post.setDateOfCreated("No date");
            }
            posts.add(post);
        }

        posts.forEach(System.out::println);
    }
}
