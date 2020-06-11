package com.marlabs.program5;

public class Water {
    String taste="tasteless";
    int amount=0;
    boolean isDrinking=true;

    Water(String taste,int amount, boolean isDrinking)
    {
        this.taste= taste;
        this.amount=amount;
        this.isDrinking=isDrinking;
    }
    Water()
    {

    }


    void cap(String x,int y,boolean z){

        String taste=x;
        int amount=y;
        boolean isDrinking=z;

    }

    void taste()
    {
        System.out.println("The water tastes "+this.taste+". I drank "+this.amount+"ml and the statement that this water is safe for drinking is"+this.isDrinking);
    }

}
