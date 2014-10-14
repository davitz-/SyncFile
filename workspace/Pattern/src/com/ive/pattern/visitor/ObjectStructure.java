package com.ive.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {  
    private List<Element> elements = new ArrayList<Element>();  
  
    public void attach(Element element){  
        elements.add(element);  
    }  
      
    public void detach(Element element){  
        elements.remove(elements);  
    }  
      
    //遍历各种具体元素并执行他们的accept方法  
    public void display(Visitor visitor){  
        for(Element p:elements){  
            p.accept(visitor);  
        }  
    }  
}