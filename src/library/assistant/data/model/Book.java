package library.assistant.data.model;

/**
 *
 * @author afsal
 */
public class Book {
    String id;
    String title;
    String author;
    String publisher;
    Boolean isAvail;
    String genre;
    public Book(String id, String title, String author, String publisher, Boolean isAvai, String genre) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isAvail = isAvail;
        this.genre = genre;
    }

    public String getGenre(){
        return genre;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Boolean getAvailability() {
        return isAvail;
    }

    public void setIsAvail(Boolean isAvail) {
        this.isAvail = isAvail;
    }
    
    
}
