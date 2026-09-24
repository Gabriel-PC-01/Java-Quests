package com.clovis.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Order
 */
public class Order extends Entity{

    private String costumerName;
    private final String costumerNameRegex = "^[A-Za-z]+(?: [A-Za-z]+)*$";
    private String productName;


    /**
     * @param name of Customer as String.
     * @return EntityStatus where if name is blank return EMPTY_INPUT
     * and return INVALID_INPUT for names how this exmaple:
     *
     * 123Sheldon
     * (Maveric)-Sheldon
     * #Sheldon-win
     *
     * Return SUCESS for valid inputs
     */
    public EntityStatus setCosutmerName(String costumerName){

        if (costumerName == null) {
            return EntityStatus.EMPTY_INPUT;
        }

        if (costumerName.isBlank() || costumerName.isEmpty()) {
            return EntityStatus.EMPTY_INPUT;

        }

        if(!costumerName.matches(costumerNameRegex)){
            return EntityStatus.INVALID_INPUT;
        }


        this.costumerName = costumerName;

        return EntityStatus.SUCCESS;
    }

    /**
     *
     * @param productName as String
     * @return EntityStatus where if productName is empty or
     * blank, return EMPTY_INPUT. Return SUCESS for valid inputs
     */
    public EntityStatus setProductName(String productName){

        if (productName == null) {
            return EntityStatus.EMPTY_INPUT;
        }

        if (productName.isBlank() || productName.isEmpty()) {
            return EntityStatus.EMPTY_INPUT;
        }

        this.productName = productName;

        return EntityStatus.SUCCESS;
    }

    @Override
    public Map<String, String> getField() {

        Map<String, String> fields= new HashMap<>();

        fields.put("Costumer : ", costumerName);
        fields.put("Product : ", productName);

        return fields;
    }

}
