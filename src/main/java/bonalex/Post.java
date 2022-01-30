package bonalex;

public class Post {
    private String title;
    private String detailLink;
    private String author;
    private String authorDetailsLink;
    private String dateOfCreated;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetailLink() {
        return detailLink;
    }

    public void setDetailLink(String detailLink) {
        this.detailLink = detailLink;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorDetailsLink() {
        return authorDetailsLink;
    }

    public void setAuthorDetailsLink(String authorDetailsLink) {
        this.authorDetailsLink = authorDetailsLink;
    }

    public String getDateOfCreated() {
        return dateOfCreated;
    }

    public void setDateOfCreated(String dateOfCreated) {
        this.dateOfCreated = dateOfCreated;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", detailLink='" + detailLink + '\'' +
                ", author='" + author + '\'' +
                ", authorDetailsLink='" + authorDetailsLink + '\'' +
                ", dateOfCreated='" + dateOfCreated + '\'' +
                '}';
    }
}
