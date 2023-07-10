package lambdas.groupingBy;

public class Tuple {
    private final BlogPostType type;
    private final String author;

    public Tuple(BlogPostType type, String author) {
        this.type = type;
        this.author = author;
    }

    public BlogPostType getType() {
        return type;
    }

    public String getAuthor() {
        return author;
    }
}
