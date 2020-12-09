package com.example.demo.dto;
import com.fasterxml.jackson.annotation.JsonView;

import java.time.LocalDateTime;

public class BookingInfo {
    @JsonView(com.example.demo.dto.View.Summary.class)
    private Long bookingId;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private RestaurantTable restaurantTable;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private User customerPersonalInfo;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private LocalDateTime startDateAndTime;
    @JsonView(com.example.demo.dto.View.Summary.class)
    private String numberOfPerson;
    @JsonView(View.Summary.class)
    private String bookingStatus;


    public BookingInfo(Long bookingId, RestaurantTable restaurantTable, User customer_PersonalInfo, String numberOfPerson, String bookingStatus) {
        this.bookingId = bookingId;
        this.restaurantTable = restaurantTable;
        customerPersonalInfo = customer_PersonalInfo;
        this.numberOfPerson = numberOfPerson;
        this.bookingStatus = bookingStatus;
    }

    public BookingInfo() {
    }

    public RestaurantTable getRestaurantTable() {
        return restaurantTable;
    }

    public void setRestaurantTable(RestaurantTable restaurantTable) {
        this.restaurantTable = restaurantTable;
    }

    public User getCustomerPersonalInfo() {
        return customerPersonalInfo;
    }

    public void setCustomerPersonalInfo(User customerPersonalInfo) {
        this.customerPersonalInfo = customerPersonalInfo;
    }

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDateTime getStartDateAndTime() {
        return startDateAndTime;
    }

    public void setStartDateAndTime(LocalDateTime startDateAndTime) {
        this.startDateAndTime = startDateAndTime;
    }

    public String getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(String numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    }
