package com.clovis.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * ProductTest
 */
public class ProductTest {

    private Product product;


    @BeforeEach
    void setup(){
        product = new Product();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Pepsi 500ml", "product-123", "Coca-Cola"})
    @DisplayName("Testing Valid product names")
    void testNameCase1(String name){

        assertEquals( product.setName(name), EntityStatus.SUCCESS );

    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {" ", "   ", "\n", "\t"})
    @DisplayName("Testing empty and blank names")
    void testNameCase2(String name){

        assertEquals(product.setName(name), EntityStatus.EMPTY_INPUT , "Invalid name accepted. Input : " + name);

    }



    @Test
    @DisplayName("Testing Invalid quantitys")
    void testQuantityCase1(){


        assertEquals( product.setQuantity(0), EntityStatus.INVALID_INPUT );
        assertEquals( product.setQuantity(-2), EntityStatus.INVALID_INPUT );

    }

    @Test
    @DisplayName("Testing Valid quantitys")
    void testQuantityCase2(){

        assertEquals( product.setQuantity(15), EntityStatus.SUCCESS );
        assertEquals( product.setQuantity(2), EntityStatus.SUCCESS );

    }
}
