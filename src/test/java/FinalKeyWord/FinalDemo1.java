package FinalKeyWord;

public class FinalDemo1 {
    final int number=10;

    public void Demo1(){}
    //number=20;
}
// final key word for method
class Bike{
   final public void run(){
       System.out.println(" bike is running");
   }
   class Splendor{
       //public void run();
   }
}
//
final class Parent{
    public void property(){
        System.out.println(" parent class property");
    }
}
//class child extends Parent{}

// Final method inheritance is possible
class Mayur{
    final public void demo1(){
        System.out.println("parent property");
    }
}
class Vinus extends Mayur{
    final public void demo2(){
        System.out.println("child property");
    }
    public static void main(String[] args) {
        Vinus obj=new Vinus();
        obj.demo1();
    }
}