package models;

import java.io.Serializable;



public class Quote implements Serializable {

    private int id;

    private String content;
//    int authorId;
    private Author author;

    public Quote() {
    }

    public Quote(int id, String content, Author author) {
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author =  author;
    }


}
