package com.bivgroup;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="Uni")
public class Uni {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        return id+"::"+name;
    }

}