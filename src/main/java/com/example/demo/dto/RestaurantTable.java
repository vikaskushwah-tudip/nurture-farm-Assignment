package com.example.demo.dto;
import com.fasterxml.jackson.annotation.JsonView;

public class RestaurantTable {
    @JsonView(com.example.demo.dto.View.Summary.class)
    private Long tableId;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private String tableType;
    private String description;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private User createdby;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private String status;
    @JsonView(View.Summary.class)
    private Role assignee;

    public RestaurantTable(Long tableId, String tableType, String description, User createdby, String status, Role assignee) {
        this.tableId = tableId;
        this.tableType = tableType;
        this.description = description;
        this.createdby = createdby;
        this.status = status;
        this.assignee = assignee;
    }

    public RestaurantTable() {
    }

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public String getTableType() {
        return tableType;
    }

    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public User getCreatedby() {
        return createdby;
    }

    public void setCreatedby(User createdby) {
        this.createdby = createdby;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Role getAssignee() {
        return assignee;
    }

    public void setAssignee(Role assignee) {
        this.assignee = assignee;
    }

}
