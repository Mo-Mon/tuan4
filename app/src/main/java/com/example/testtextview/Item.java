package com.example.testtextview;

public class Item {
    private String name;
    private String noiDung;
    public Item(String name,String noiDung){
        this.name=name;
        this.noiDung=noiDung;
    }
    public String getName(){
        return this.name;
    }
    public String getNoiDung(){
        return this.noiDung;
    }
}
