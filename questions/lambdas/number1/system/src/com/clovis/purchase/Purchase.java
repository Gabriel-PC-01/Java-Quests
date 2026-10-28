package com.clovis.purchase;

import com.clovis.customer.Customer;
import com.clovis.discount.DiscountFormula;
import com.clovis.discount.WeightsForDiscounts;

public class Purchase {

    private Customer customer;
    private Double price;


    public Purchase(Customer customer, Double price) {

        this.customer = customer;
        this.price = price;

    }

    public void applyDiscount(DiscountFormula formula , WeightsForDiscounts weights){

        System.out.println("Valor da formula : " + formula.apply(weights));
        price = price - ( price * formula.apply(weights) );

    }

    @Override
    public String toString() {
        return "Purchase{" +
                "customer=" + customer +
                ", price=" + price +
                ", formula=" + formula +
                '}';
    }
}
