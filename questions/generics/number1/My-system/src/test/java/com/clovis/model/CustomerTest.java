package com.clovis.model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

/**
 * CustomerTest
 */
public class CustomerTest {

    private Customer customer;


    @BeforeEach
    void setup(){
        customer = new Customer();
    }


    @DisplayName("Testing Valid Emails")
    @ParameterizedTest
    @ValueSource(strings = {"person@gmail.com", "person@gmail.edu.br", "person123@hotmail.com",})
    void testEmailCase1(String email) {

        assertEquals( customer.setEmail( email ),EntityStatus.SUCCESS , "Error : Valid email not accepted, Input : " + email  );

    }

    @DisplayName("Testing Invalid Emails")
    @ParameterizedTest
    @ValueSource(strings = {"person.com", "person", "pe##rson123@hotmail.com@",})
    void testEmailCase2(String email) {

        assertEquals( customer.setEmail( email ), EntityStatus.INVALID_INPUT, "Error : Invalid email not accepted, Input : " + email );

    }

    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource (strings = {"", "  ", "\t", "\n"})
    void testEmailCase3(String email) {

        assertEquals( customer.setEmail( email ), EntityStatus.EMPTY_INPUT, "Error : Invalid email not accepted, Input : " + email );

    }


    @DisplayName("Testing Valid Names")
    @ParameterizedTest
    @ValueSource(strings = {"Allan Watsson", "Marcos Oliveira Santos da Silva Machado", "Albert Einsten",})
    void testNameCase1(String name) {

        assertEquals( customer.setName( name ), EntityStatus.SUCCESS, "Error : Valid name not accepted, Input : " + name );

    }


    @DisplayName("Testing Invalid Names")
    @ParameterizedTest
    @ValueSource(strings = {"Allan 123 Five", "Hunter#(Pro)", "@Mister +Dunet"})
    void testNameCase2(String name) {

        assertEquals( customer.setName( name ), EntityStatus.INVALID_INPUT, "Error : Invalid name accepted, Input" + name );

    }

    @DisplayName("Testing Empty and Blank Names")
    @ParameterizedTest
    @NullSource
    @EmptySource
    @ValueSource (strings = {" ", "  ", "\t", "\n"})
    void testNameCase3(String name) {

        assertEquals( customer.setName( name), EntityStatus.EMPTY_INPUT, "Error : Invalid email not accepted, Input : " + name);

    }
}
