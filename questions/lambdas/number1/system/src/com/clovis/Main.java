package com.clovis;

import com.clovis.customer.BuildCustomer;
import com.clovis.customer.Customer;
import com.clovis.customer.CustomerType;
import com.clovis.discount.DiscountFormula;
import com.clovis.discount.WeightsForDiscounts;
import com.clovis.purchase.Purchase;

class Main{

    static void main() {

        var customerBuilder =  new BuildCustomer();
        Customer customer = customerBuilder
                .monthAsCustomer(10)
                .customerName("Bob")
                .purchasesMade(10)
                .type(CustomerType.STANDARD)
                .build();


        DiscountFormula formula = (w) -> {
            return
                    ((customer.getMonthsAsCustomer() % 101) * w.monthsAsCustomerWeignt()) / 100 ;
        };
        WeightsForDiscounts weights = new WeightsForDiscounts(0.0, 0.9, 0.0);


        Purchase purchase = new Purchase(customer, 59.90);
        purchase.applyDiscount(formula, weights);
        System.out.println(purchase.toString());


    }


}