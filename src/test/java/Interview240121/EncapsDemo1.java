package Interview240121;

// two program for encapsulation
public class EncapsDemo1 {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        EncapsDemo1 obj=new EncapsDemo1();
        obj.setName("Mayur Patel");
        System.out.println(obj.getName());
    }
}
class EncapsDemo2{
    private String name;
    private String surname;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public static void main(String[] args) {
        EncapsDemo2 obj=new EncapsDemo2();
        obj.setName("Dipika");
        obj.setSurname("Patel");
        System.out.println(obj.getName());
        System.out.println(obj.getSurname());
    }
}
// Abstract class and method program
abstract class AbsClass1{       // abstract class used abstract key word
    abstract void eat();        // abstract method dose not have implementation
    public void run(){          // non abstract method with implementation
        System.out.println("dog can run");
    }
}
class AbsClass2 extends AbsClass1{
    public void eat(){
        System.out.println("dog can eat");
    }
    public static void main(String[] args) {
        AbsClass2 obj=new AbsClass2();
        obj.eat();
        obj.run();
    }
}


