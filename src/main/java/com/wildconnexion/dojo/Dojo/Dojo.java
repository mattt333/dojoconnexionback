package com.wildconnexion.dojo.Dojo;

public class Dojo {



    private int id ;
    private String name;

    public Dojo(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int setId(int id){
        return this.id = id;
    }
    public String setId(String name){
        return this.name = name;
    }
}