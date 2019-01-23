package com.javatpoint;

import java.util.logging.Level;

public class Employee {
    private int id;
    private String name;
    private Address address;//Aggregation

    public Employee(){
        LoggerSingleton.getInstance().log(Level.INFO, "def cons \r\n");
    }

    public Employee(int id){
        this.id = id;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void show(){
        LoggerSingleton.getInstance().log(Level.INFO, "id:{0} \r\n name:{1} \r\n address:{2} \r\n");
    }
}
