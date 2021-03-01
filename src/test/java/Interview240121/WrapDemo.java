package Interview240121;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

// wrapper class program
public class WrapDemo {
    public static void main(String[] args) {
        int a=20;
        Integer i=a;
            System.out.println(i);
            System.out.println(a);
        int b=i;
            System.out.println(b);
        byte c=10;
        Byte d=c;
            System.out.println(d);
         byte e=d;
        System.out.println(e);
    }
}
//program for method with return
class Return{
    public int methodWithReturn(){
        int a=20;
        int b=30;
        return b-a;
    }
    public static void main(String[] args) {
        Return obj=new Return();
        System.out.println(obj.methodWithReturn());
    }
}
// program of method with parameters for return type.
class Return1{
    public int methodWithReturn1(int a, int b){
      return a+b;
    }
    public static void main(String[] args) {
        Return1 obj1=new Return1();
        System.out.println(obj1.methodWithReturn1(20,30));
    }
}
// program for widening and narrowing
class WideningNarrowing{
    public static void main(String[] args) {
        short s=150;                    // widening
        float f=s;
            System.out.println(f);
        short s1= (short)f;             // narrowing
            System.out.println(s1);
    }
}