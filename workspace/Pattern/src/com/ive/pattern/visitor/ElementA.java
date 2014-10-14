package com.ive.pattern.visitor;

public class ElementA implements Element{

    @Override
    public void accept(Visitor visitor) {  
          visitor.visitor(this);  
    }  
}
