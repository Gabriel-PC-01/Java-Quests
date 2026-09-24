package com.clovis.model;


import java.util.HashMap;
import java.util.Map;


/**
 * Product
 */
public class Product extends Entity{

    private Integer quantity;
    private String name;


    /**
     *
     * @param quantity of product as positive Integer
     * @return setQuantity where if quantity is minor or
     * equals 0, return INVALID_INPUT. For valid inputs
     * return SUCCESS
     *
     *
     */
    public EntityStatus setQuantity(final Integer quantity){

        if (quantity == null) {
            return EntityStatus.EMPTY_INPUT;
        }
        if ( quantity <=0 ){

            return EntityStatus.INVALID_INPUT;
        }

        this.quantity= quantity;

        return EntityStatus.SUCCESS;
    }


    /**
     * @param name of product as String.
     * @return EntityStatus where if name is blank return EMPTY_INPUT
     * For valid inputs return SUCCESS;
     */
    public EntityStatus setName(final String name){

        if (name == null) {
            return EntityStatus.EMPTY_INPUT;
        }

        if ( name.isEmpty() || name.isBlank()) {

            return EntityStatus.EMPTY_INPUT;
        }

        this.name = name;

        return EntityStatus.SUCCESS;
    }


    @Override
    public Map<String, String> getField() {

        Map<String, String> fields= new HashMap<>();

        fields.put("Name : ", this.name);
        fields.put("Quantity : ", this.quantity.toString());

        return fields;
    }
}
