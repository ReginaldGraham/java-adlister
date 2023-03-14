package models;

import java.io.Serializable;

public class Author implements Serializable {

    private int id;

    private String firstName;

    private String Lastname;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }
    public Author(){

    }

    public Author(String firstName, String lastname) {
        this.firstName = firstName;
        Lastname = lastname;
    }
}
