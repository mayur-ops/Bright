package MethodWithReturn;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Return1 {
    public String demo2(){
        String ftname="Mayur";
        String lsname="Patel";
        return ftname+" "+lsname;
    }
    public static void main(String[] args) {
        Return1 obj=new Return1();
        System.out.println(obj.demo2());
    }
}

class ReturnDemo1{
    public int demo1(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        ReturnDemo1 obj=new ReturnDemo1();
        System.out.println(obj.demo1(20,30));
    }
}
