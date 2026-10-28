package com.clovis.discount;


@FunctionalInterface
public interface DiscountFormula{
    Double apply(WeightsForDiscounts weights);
}
