package SuperKeyWord;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Animal {
    String color="White";
}
class Dog extends Animal{
    String color="Black";
    public void printColour(){
        System.out.println(super.color);
    }
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.printColour();
    }
}