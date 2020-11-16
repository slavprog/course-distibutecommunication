package com.course.distributecommunication.frontend.model;

public class AuthorDto
{
    private int id;
    private String firstName;
    private String lastName;

    public AuthorDto(int id) {
        this.id = id;
    }

    public AuthorDto(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
}
