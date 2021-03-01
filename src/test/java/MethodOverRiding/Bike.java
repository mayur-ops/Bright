package MethodOverRiding;

public class Bike {
    public void run(){
        System.out.println(" bike is running safely");
    }
}
class Splendor extends Bike{
    public void run(){
        System.out.println("splendor is running safely");
    }
    public static void main(String[] args) {
        // Splendor obj=new Splendor(); // child class reference variable is refer child class object
        //  Bike obj1=new Splendor(); // parent class reference variable is refer child class object (upcasting)
         Bike obj2=new Bike(); //
        //obj.run();
        // obj1.run();
           obj2.run();
    }
}

// method over riding not possible by static key word
class Parent{
    public static void property(){
        System.out.println(" this is parents property");
    }
}// parents class ends
class Children extends Parent{
    public static void property(){
        System.out.println(" this is children property");
    }
    public static void main(String[] args) {
        property();
    }
}// child class ends
