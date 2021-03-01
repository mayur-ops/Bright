package InheritanceDemo;

public class Animal1 { //Animal1 class start
    public void eat(){
        System.out.println("eating");
    }
}// Animal1 class ends
class Dog1 extends Animal{
    public void bark(){
        System.out.println("barking");
    }
}// Dog1 class ends
class BabyDog extends Dog1{
    public void weep(){
        System.out.println("weeping");
    }
    public static void main(String[] args) {
        BabyDog obj= new BabyDog();
        obj.weep();
        obj.bark();
        obj.eat();
    }
}// baby dog class ends
