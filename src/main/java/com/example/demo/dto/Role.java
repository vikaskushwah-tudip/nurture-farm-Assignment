package com.example.demo.dto;
import com.fasterxml.jackson.annotation.JsonView;

public class Role {

    @JsonView(View.Summary.class)
    private Long id;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private String name;

    public Role(){

    }

    public Role(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
