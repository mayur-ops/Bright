package MethodOverRiding;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Mayur {
    public void property(int a, int b){
        System.out.println(a+b);
    }
}
class Vinus extends Mayur{
    public void property(int a, int b){
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        Vinus obj=new Vinus();
        obj.property(20,10);
    }
}
