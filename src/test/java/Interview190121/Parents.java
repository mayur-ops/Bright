package Interview190121;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

// Single Inheritance
public class Parents {
    public void children(){
        System.out.println("children can go to school");
    }
}
class child1 extends Parents{
    public void vinus(){
        System.out.println("she is in primery school");
    }
    public static void main(String[] args) {
        child1 obj=new child1();
        obj.vinus();
        obj.children();
    }
}
class Vehicle{
    public void car(){
        System.out.println("car can drive on road");
    }
}
class Ford extends Vehicle{
    public void car1(){
        System.out.println("ford car made in UK");
    }
    public static void main(String[] args) {
        Ford obj=new Ford();
        obj.car1();
        obj.car();
    }
}
// Multi-Level inheritance
class GrandParents{
    public void child(){
        System.out.println("Grandparents have children and grand children");
    }
}
class Children1 extends GrandParents{
    public void child1(){
        System.out.println("child can go school");
    }
}
class Children2 extends Children1{
    public void child2(){
        System.out.println("child can go swim");
    }
    public static void main(String[] args) {
        Children2 obj=new Children2();
        obj.child2();
        obj.child1();
        obj.child();
    }
}
class Bank{
    public void internationalBank(){
        System.out.println("world wide branches of bank");
    }
}
class Hsbc extends Bank{
    public void mainBranch(){
        System.out.println("hsbc main branch in UK");
    }
}
class Hsbc2 extends Hsbc{
    public void subBranch(){
        System.out.println("sub branch in London");
    }
    public static void main(String[] args) {
        Hsbc2 obj=new Hsbc2();
        obj.subBranch();
        obj.mainBranch();
        obj.internationalBank();
    }
}
//Hirarchical inheritance
class Animal{
    public void Dog(){
        System.out.println("dog can eat");
    }
}
class Dog1 extends Animal{
    public void run(){
        System.out.println("dog can run");
    }
}
class Dog2 extends Animal{
    public void bark(){
        System.out.println("dog can barking");
    }
    public static void main(String[] args) {
        Dog2 obj=new Dog2();
        obj.bark();
        obj.Dog();
       // obj.run();
    }
}
// Method overloading same data type different parameters
class Calculator{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b-c);
    }
    public static void main(String[] args) {
       Calculator obj=new Calculator();
       obj.add(10,20);
       obj.add(10,20,15);
    }
}
// Method overloading different data type and different parameters
class Calculator2{
    public void sub(int a, float b){
        System.out.println(a-b);
    }
    public void sub(int a, double b, float c){
        System.out.println(a+b-c);
    }
    public static void main(String[] args) {
        Calculator2 obj=new Calculator2();
        obj.sub(40,20.50f);
        obj.sub(50,25.25,15.5f);
    }
}
// Method overriding with three different way reference variable
class Car{
    public void ford(){
        System.out.println("ford car new model arrived");
    }
}
class Car2 extends Car{
    public void bmw(){
        System.out.println("bmw introduce new electric model");
    }
    public static void main(String[] args) {
       Car2 obj=new Car2(); // child class reference variable refer to the child object
       Car obj1=new Car2(); // Parent class reference variable refer to the child class object (upcasting)
       Car obj2=new Car(); // Parent class reference variable refer to the parent object
    }
}

// one program for super keyword
class Super{
    String milk="white";
}
class Super2 extends Super{
    String milk="Flavour milk";
    public void printMilk(){
        System.out.println(super.milk);
    }
    public static void main(String[] args) {
        Super2 obj=new Super2();
        obj.printMilk();
    }
}