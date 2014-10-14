package com.ive.pattern.visitor;

public class VisitorB extends Visitor{
    
    @Override
    public void visitor(ElementA a) {  
        System.out.println("当男人恋爱时，凡事不懂也装懂");  
    }  
  
    @Override
    public void visitor(ElementB b) {  
        System.out.println("当女人恋爱时，遇事懂也装不懂");  
    } 
}
