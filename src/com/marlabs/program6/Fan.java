package com.marlabs.program6;

public class Fan implements Machine{
    int speed;
    boolean isOn;
    final boolean doesCool=false;
    @Override
    public void decreaseSpeed(int inc) {
        this.speed-=inc;
        if(this.speed<0)
        {
            this.speed=0;
            this.isOn=false;
        }
    }

    @Override
    public void increaseSpeed(int inc) {
        this.speed+=inc;
        if(this.speed>0)
        {
            this.isOn=true;
        }

    }

    @Override
    public void flipSwitch() {
        this.isOn=!this.isOn;
    }
    boolean isDoesCool()
    {
        return this.doesCool;
    }
    void objectInformation()
    {
        System.out.println("This is a fan and switch is "+this.isOn+" at speed "+this.speed+" and its cooling is "+this.doesCool);
    }
}