package InheritanceDemo;

public class Animal { // Animal super class
    public void eat(){
        System.out.println("eating");
    }
}// class ends
class Dog extends Animal{ // child class
public void bark(){
    System.out.println("barking");
}
    public static void main(String[] args) {
        Dog obj=new Dog();
        obj.bark();
        obj.eat();
    }
}// class ends
