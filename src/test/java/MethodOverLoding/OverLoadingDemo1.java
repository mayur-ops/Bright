package MethodOverLoding;

public class OverLoadingDemo1 {
    public void demo1(int a,int b){
        System.out.println(a+b);
    }
    public void demo1(int a,int b, int c){
        System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        OverLoadingDemo1 obj=new OverLoadingDemo1();
        obj.demo1(10,20);
        obj.demo1(10,20,50);
    }
}// class ends

class OverLoadingDemo2{
    public void demo2(int a, int b){
        System.out.println(a+b);
    }
    public void demo2(float a, float b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        OverLoadingDemo2 obj=new OverLoadingDemo2();
        obj.demo2(20,30);
        obj.demo2(20.40f,30.40f);
    }
} // class ends

