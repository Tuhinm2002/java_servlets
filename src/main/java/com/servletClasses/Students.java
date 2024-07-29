package com.servletClasses;

public class Students {
    private String Name;
    private int roll;

    public Students(String name,int roll){

        this.Name = name;
        this.roll =roll;
    }

    public String getName(){
        return this.Name;
    }

    public int getRoll(){
        return this.roll;
    }

    @Override
    public String toString() {
        return "Students{" +
                "Name='" + Name + '\'' +
                ", roll=" + roll +
                '}';
    }
}
