package com.ive.pattern.visitor.medicion;

public class MedicineA extends Medicine{
    public MedicineA(String name, double price) {  
        super(name, price);  
    }  
  
    public void accept(Visitor visitor) {  
        visitor.visitor(this);  
    } 
}
