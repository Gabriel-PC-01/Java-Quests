package com.clovis.model;

import java.util.HashMap;
import java.util.Map;


/**
 *  Class Customer
 */
public class Customer extends Entity{


    private String name;
    private String email;
    private final String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

    private final String nameRegex = "^[A-Za-z]+(?: [A-Za-z]+)*$";

    @Override
    public Map<String, String> getField() {

        Map<String, String> fields= new HashMap<>();

        fields.put("Name : ", this.name);
        fields.put("Email : ", this.email);

        return fields;
    }

    /**
     * @param name of Customer as String.
     * @return EntityStatus where if name is blank return EMPTY_INPUT
     * and return INVALID_INPUT for names how this exmaple:
     *
     * 123Sheldon
     * (Maveric)-Shldon
     * #Sheldon-win
     * Return SUCESS for valid inputs
     */
    public EntityStatus setName(final String name){

        if (name == null) {
            return EntityStatus.EMPTY_INPUT;
        }

        if ( name.isEmpty() || name.isBlank() ) {

            return EntityStatus.EMPTY_INPUT;
        }

        if (!name.matches(nameRegex)) {
            return EntityStatus.INVALID_INPUT;
        }

        this.name = name;

        return EntityStatus.SUCCESS;
    }


    /**
     * @param email of Customer as String .
     * @return EntityStatus where if email is blank return EMPTY_INPUT
     * and return INVALID_INPUT for emails how this exmaple:
     *
     * sheldon.com
     * sheldon@gmail
     * #Sheldon
     * sheldon-win@gmail.com
     */
    public EntityStatus setEmail(final String email){

        if (email == null) {
            return EntityStatus.EMPTY_INPUT;
        }

        if (email.isEmpty() || email.isBlank()) {
            return EntityStatus.EMPTY_INPUT;
        }

        if (!email.matches(emailRegex)) {
            return EntityStatus.INVALID_INPUT;
        }

        this.email = email;

        return EntityStatus.SUCCESS;
    }
}
