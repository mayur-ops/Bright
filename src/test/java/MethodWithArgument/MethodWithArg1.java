package MethodWithArgument;

public class MethodWithArg1 {
   public void demo1(int a, int b){
       System.out.println(a+b);
   }
    public static void main(String[] args) {
    MethodWithArg1 obj=new MethodWithArg1();
    obj.demo1(10,20);
    obj.demo1(20,30);
    obj.demo1(40,50);
    } // main methods ends
}// class ends

class MethodWithArg2{
    public static void demo2(int a,int b){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        demo2(20,30);
        demo2(40,50);
    } // main method ends
} // class ends
