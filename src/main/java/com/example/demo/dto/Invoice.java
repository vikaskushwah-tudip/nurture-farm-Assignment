package com.example.demo.dto;
import com.fasterxml.jackson.annotation.JsonView;

public class Invoice {
    @JsonView(View.Summary.class)
    private Long billNumber;
    @JsonView(View.Summary.class)
    private Order orderInfo;
    @JsonView(View.Summary.class)
    private String totalAmount;

    public Invoice() {
    }

    public Invoice(Long billNumber, Order orderInfo, String totalAmount) {
        this.billNumber = billNumber;
        this.orderInfo = orderInfo;
        this.totalAmount = totalAmount;
    }

    public Long getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(Long billNumber) {
        this.billNumber = billNumber;
    }

    public Order getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Order orderInfo) {
        this.orderInfo = orderInfo;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

}
