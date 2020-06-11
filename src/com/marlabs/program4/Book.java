package com.marlabs.program4;

public class Book implements Stationery{
    private String owner="DefaultName";
    private String bookType="Anonymous";
    public Book(String name)
    {
        this.owner=name;
    }
    public String returnOwner()
    {
        return this.owner;
    }
    public String returnType()
    {
        return this.bookType;
    }

}
