package com.clovis.customer;

import java.util.Objects;

public class Customer {

    private String customerName;
    private Integer monthsAsCustomer;
    private CustomerType type;
    private Integer purchasesMade;


    public Customer(String customerName, Integer monthsAsCustomer, CustomerType type, Integer purchasesMade) throws RuntimeException {

        if (Objects.isNull(customerName) || customerName.isBlank()) {
            throw new IllegalArgumentException();
        }
        this.customerName = customerName;

        if (Objects.isNull(monthsAsCustomer) || monthsAsCustomer < 0) {
            throw new IllegalArgumentException();
        }
        this.monthsAsCustomer = monthsAsCustomer;

        if (Objects.isNull(type)) {
            throw new IllegalArgumentException();
        }
        this.type = type;

        if (Objects.isNull(purchasesMade) || purchasesMade < 0) {
            throw new IllegalArgumentException();
        }
        this.purchasesMade = purchasesMade;

    }

    public Integer getMonthsAsCustomer() {
        return monthsAsCustomer;
    }


    public Integer getPurchasesMade() {
        return purchasesMade;
    }

    public CustomerType getType() {
        return type;
    }

}