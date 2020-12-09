package com.example.demo.dto;
import com.fasterxml.jackson.annotation.JsonView;

public class User {
    @JsonView(com.example.demo.dto.View.Summary.class)
    private Long id;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private String firstname;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private String lastname;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private String email;
    @JsonView(View.Summary.class)
    private String phoneNumber;
    private Role role;

    public User() {
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public User(Long id, String firstname, String lastname, String email, String phoneNumber, Role role) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public Role getRoles() {
        return role;
    }

    public void setRoles(Role role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
