package com.clovis.customer;

public class BuildCustomer {

    private String customerName;
    private Integer monthsAsCustomer;
    private CustomerType type;
    private Integer purchasesMade;

    public BuildCustomer customerName(String customerName){

        this.customerName = customerName;
        return this;
    }
    public BuildCustomer monthAsCustomer(Integer monthsAsCustomer){
        this.monthsAsCustomer = monthsAsCustomer;
        return this;
    }
    public BuildCustomer type(CustomerType type){
        this.type = type;
        return this;
    }
    public BuildCustomer purchasesMade(Integer purchasesMade){
        this.purchasesMade = purchasesMade;
        return this;
    }

    public  Customer build(){
        return new Customer(customerName,monthsAsCustomer, type, purchasesMade);
    }

}
