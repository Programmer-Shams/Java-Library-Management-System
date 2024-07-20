package VersionTwo;

public class BookClass {
    private String title;
    private String author;
    private String id;

    public BookClass(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getId() {
        return id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "\n" + "Title: " + title + "\n" +
                "Author: " + author + "\n" +
                "ID: " + id;
    }
}
