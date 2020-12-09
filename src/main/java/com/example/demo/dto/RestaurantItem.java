package com.example.demo.dto;
import com.fasterxml.jackson.annotation.JsonView;

public class RestaurantItem {
    @JsonView(com.example.demo.dto.View.Summary.class)
    private Long item_ID;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private String item_Name;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private String item_Price;
    @JsonView(View.Summary.class)
    private RestaurantMenu MenuId;
    private String item_Description;

    public RestaurantItem() {
    }

    public RestaurantItem(Long item_ID, String item_Name, String item_Price, RestaurantMenu menuId, String item_Description) {
        this.item_ID = item_ID;
        this.item_Name = item_Name;
        this.item_Price = item_Price;
        MenuId = menuId;
        this.item_Description = item_Description;
    }

    public Long getItem_ID() {
        return item_ID;
    }

    public void setItem_ID(Long item_ID) {
        this.item_ID = item_ID;
    }

    public String getItem_Name() {
        return item_Name;
    }

    public void setItem_Name(String item_Name) {
        this.item_Name = item_Name;
    }

    public String getItem_Price() {
        return item_Price;
    }

    public void setItem_Price(String item_Price) {
        this.item_Price = item_Price;
    }

    public RestaurantMenu getMenuId() {
        return MenuId;
    }

    public void setMenuId(RestaurantMenu menuId) {
        MenuId = menuId;
    }

    public String getItem_Description() {
        return item_Description;
    }

    public void setItem_Description(String item_Description) {
        this.item_Description = item_Description;
    }


}
