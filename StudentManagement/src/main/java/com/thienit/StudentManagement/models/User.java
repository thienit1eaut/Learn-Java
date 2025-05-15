package com.thienit.StudentManagement.models;

public class User {
    private String name;
    private String phone;
    private String email;
    private String address;
    private String content;

    // Constructors
    public User() {}

    public User(String name, String phone, String email, String address, String content) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.content = content;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
