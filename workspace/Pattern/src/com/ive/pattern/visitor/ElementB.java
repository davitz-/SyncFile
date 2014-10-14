package com.ive.pattern.visitor;

public class ElementB implements Element{
    @Override
    public void accept(Visitor visitor) {  
        visitor.visitor(this);  
  }  
}
