package com.marlabs.program2;

class ABC
{
    int instanceVar1;
    float instanceVar2;
    public ABC()
   {
       System.out.println("Default Constructor of "+this.getClass().getSimpleName());
       methodABC(20,30,40);
   }
   public float ABC(int a1,int a2,int a3,int a4)
   {
       instanceVar2=(a1+a2+a3+a4)/4;
       System.out.println("String overload Constructor of "+this.getClass().getSimpleName());
       return instanceVar2;
   }

   void methodABC(int a,int b,int c)
   {
        instanceVar1=(a*b*c)/3;
   }
}


public class XYZ {
    long instanceVar1;
    int instanceVar2;
    public XYZ()
    {
        System.out.println("Default Constructor of "+this.getClass().getSimpleName());
        methodXYZ(10,10,10);
    }
    public int XYZ(int a1,int a2,int a3,int a4)
    {
        instanceVar2=(a1^2+a2^2+a3^2+a4^2);
        System.out.println("String overload Constructor of "+this.getClass().getSimpleName());
        return instanceVar2;
    }
    void methodXYZ(int a,int b,int c)
    {
        instanceVar1=(a^b^c)/3;
    }
}
