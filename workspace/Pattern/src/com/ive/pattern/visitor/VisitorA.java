package com.ive.pattern.visitor;

public class VisitorA extends Visitor{

    @Override
    public void visitor(ElementA a) {
        System.out.println("当男人成功时，背后多半有一个伟大的女人");  
        
    }

    @Override
    public void visitor(ElementB b) {
        System.out.println("当女人成功时，背后大多有一个不成功的男人");
        
    }
}
