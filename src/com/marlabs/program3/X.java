package com.marlabs.program3;

public class X {
    int var1=0;
    public X(int var2)
    {
        Y obj1 = new Y(var2);
        this.var1= obj1.m1(this.var1);
    }
}
