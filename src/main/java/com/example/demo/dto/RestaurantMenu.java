package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonView;

public class RestaurantMenu {

    @JsonView(View.Summary.class)
    private Long menuId;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private String menuType;

    public RestaurantMenu() {
    }

    public RestaurantMenu(Long menuId, String menuType) {
        this.menuId = menuId;
        this.menuType = menuType;
    }

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

}
