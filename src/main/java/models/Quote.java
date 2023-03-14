package models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Quote implements Serializable {
    private int id;
private ArrayList<Author> authors;

    private String content;


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public Quote(){

    }

    public Quote(ArrayList<Author> authors, String content) {
        this.authors = authors;
        this.content = content;
    }
}
