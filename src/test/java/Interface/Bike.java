package Interface;

public interface Bike {
    abstract void run();
}
class Splendor implements Bike{
    public void run(){
        System.out.println(" running safely");
    }
    public static void main(String[] args) {
        Splendor obj=new Splendor();
        obj.run();
    }
}
// multiple inheritance program for interface
interface GrandParent{
    abstract void property();
}
interface Parents{
    abstract void balance();
}
interface Children extends GrandParent,Parents{
    abstract void amount();
}
class GrandChildren implements Children{
    public void property(){
        System.out.println("property of grand parents");
    }
    public void balance(){
        System.out.println("balance of parents");
    }
    public void amount(){
        System.out.println("amount of children");
    }
    public static void main(String[] args) {
        GrandChildren obj=new GrandChildren();
        obj.property();
        obj.balance();
        obj.amount();
    }
}