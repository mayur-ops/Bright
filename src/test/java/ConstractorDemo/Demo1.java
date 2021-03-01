package ConstractorDemo;

public class Demo1 {

    public Demo1(){
        int a=10;
        int b=20;
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Demo1 obj=new Demo1();
    } // main method ends
}// class ends

class Demo2{
    public Demo2(int a, int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        Demo2 obj2=new Demo2(10,20);
        Demo2 obj3=new Demo2(20,40);
    }
}// class ends

class Demo3{
    int a;
    int b;
    public Demo3(int c, int d){
        this.a=c;
        this.b=d;
        System.out.println(c+d);
    }
    public static void main(String[] args) {
        Demo3 obj3=new Demo3(30,40);
    }
}
