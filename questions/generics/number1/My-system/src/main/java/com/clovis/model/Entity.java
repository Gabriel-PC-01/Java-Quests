package com.clovis.model;
import java.util.Map;




public abstract class Entity{


    protected String type;


    /**
     * @return a Maps whith all datas about one
     Entity.
     */
    abstract public Map<String, String> getField();

}
