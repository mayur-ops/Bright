package Abstract;

abstract class AbstractDemo1 {
    abstract void run();

    public void average(){
        System.out.println(" good milage");
    }
}
class Honda extends AbstractDemo1{
    public void run(){
        System.out.println("running safely");
    }
    public static void main(String[] args) {
        Honda obj=new Honda();
        obj.run();
        obj.average();
    }
}
