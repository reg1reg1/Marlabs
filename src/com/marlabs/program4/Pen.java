package com.marlabs.program4;

public class Pen implements Stationery{

    String owner="Anonymous";
    String color="Black";

    public Pen(String owner,String color)
    {
        this.owner=owner;
        this.color=color;
    }



    public String returnOwner() {
        return this.owner;
    }


    public String returnType() {
        return this.color;
    }
}
