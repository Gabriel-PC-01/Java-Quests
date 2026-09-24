package com.clovis.model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;


/**
 * OrderTest
 */
public class OrderTest {

    private Order order;

    @BeforeEach
    void setup(){
        order = new Order();

    }

    @DisplayName("Testing Valid Names")
    @ParameterizedTest
    @ValueSource(strings = {"Allan Watsson", "Marcos Oliveira Santos da Silva Machado", "Albert Einsten",})
    void testCutomerNameCase1(String costumerName){

        assertEquals(order.setCosutmerName(costumerName), EntityStatus.SUCCESS);

    }


    @DisplayName("Testing Invalid Names")
    @ParameterizedTest
    @ValueSource(strings = {"Allan 123 Five", "Hunter#(Pro)", "@Mister +Dunet"})
    void testNameCase2(String name) {

        assertEquals( order.setCosutmerName( name ), EntityStatus.INVALID_INPUT, "Error : Invalid name accepted, Input" + name );

    }

    @DisplayName("Testing Empty and Blank Names")
    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource (strings = {" ", "  ", "\t", "\n"})
    void testNameCase3(String name) {

        assertEquals( order.setCosutmerName( name), EntityStatus.EMPTY_INPUT, "Error : Invalid email not accepted, Input : " + name);

    }

    @ParameterizedTest
    @ValueSource(strings = {"Pepsi 500ml", "product-123", "Coca-Cola"})
    @DisplayName("Testing Valid product names")
    void testProductNameCase1(String name){

        assertEquals( order.setProductName(name), EntityStatus.SUCCESS );

    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource(strings = {" ", "   ", "\n", "\t"})
    @DisplayName("Testing empty and blank names")
    void testProductNameCase2(String name){

        assertEquals(order.setProductName(name), EntityStatus.EMPTY_INPUT , "Invalid name accepted. Input : " + name);

    }
}
