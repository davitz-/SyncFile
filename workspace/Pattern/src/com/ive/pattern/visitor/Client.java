package com.ive.pattern.visitor;

public class Client {      
    public static void main(String[] args) {  
        ObjectStructure o = new ObjectStructure();  //依赖于ObjectStructure  
        //实例化具体元素  
        o.attach(new ElementA());    
      
        //当成功时不同元素的不同反映  
        Visitor success = new VisitorA();           //依赖于抽象的Visitor接口  
        o.display(success);  
      
         //当恋爱时的不同反映  
         Visitor amativeness = new VisitorB();          //依赖于抽象的Visitor接口  
         o.display(amativeness);  
      
    }  
}
