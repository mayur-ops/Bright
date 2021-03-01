package Interview180121;
                                // Question 1
public class ForLoopDemo1 {
    public static void main(String[] args) {
        for(int a=10;a<=15;a++){
            System.out.println(a);
        }// for loop ends
    }// main method ends
}// class ends
class ForLoopDemo2{
    public static void main(String[] args) {
        ForLoopDemo2 obj2=new ForLoopDemo2();
        obj2.forLoop();
    } // main method ends
    public void forLoop(){
        for(int a=15; a>=10; a--){
            System.out.println(a);
        }// for loop ends
    }// non static UDM ends
}// class ends
class ForLoopDemo3{
    public static void main(String[] args) {
        forLoop2();
    } // main method ends
    public static void forLoop2(){
        for(int b=5; b<=10; b++){
            System.out.println(b);
        }// for loop ends
    } // static udm ends
}// class ends
                                            // Question 2
class WhileLoopDemo1{
    public static void main(String[] args) {
       int a=5;
        while (a<=10){
            System.out.println(a);
            a++;
        } // while loop ends
    }// main method ends
}// class ends
class WhileLoopDemo2{
    public static void main(String[] args) {
        WhileLoopDemo2 obj2=new WhileLoopDemo2();
        obj2.whileLoop1();  // non static udm calls
        whileLoop2();   // static udm calls
    } // main method ends
    public void whileLoop1(){
        int a=1;
        while (a<=5){
            System.out.println(a);
            a++;
        } // non static while loop ends
    } // not static UDM ends
    public static void whileLoop2(){
        int a=1;
        while (a<=5){
            System.out.println(a);
            a++;
        } // static while loop ends
    } // static udm ends
}// class ends
class DoWhileLoopDemo1{
    public static void main(String[] args) {
        int a=1;
        do{
            System.out.println(a);
            a++;
        }while (a<=5);      // do while loop ends
    } // main method ends
}// class ends
                                            //Question 3
class BreakForLoop{
    public static void main(String[] args) {
        for(int a=20; a<=25;a++){
            if(a==23){
              break;
            }// if block ends
            System.out.println(a);
        }//for loop ends
    }// main method ends
}// class ends
class BreakWhileLoop{
    public static void main(String[] args) {
        int a=10;
        while (a<=20){
            if(a==15){
               break;
            }// if block ends
            System.out.println(a);
            a++;
        }// while ends
    }// main ends
}//class ends
class BreakDoWhileLoop{
    public static void main(String[] args) {
        int a=5;
        do{
            if(a==10){
               break;
            }// if block ends
            System.out.println(a);
            a++;
        }while (a<=15);
    }//main method ends
}// class ends
                                            // Question 4
class SwitchStatement{
    public static void main(String[] args) {
        int day=5;
        switch (day){
            case 1:
                System.out.println("today is monday");
                break;
            case 2:
                System.out.println("today is tuesday");
                break;
            case 3:
                System.out.println("today is wednesday");
                break;
            case 4:
                System.out.println("today is thursday");
                break;
            case 5:
                System.out.println("today is friday");
                break;
            case 6:
                System.out.println("today is saturday");
                break;
            case 7:
                System.out.println("today is sunday");
                break;
            default:
                System.out.println(" days are not match");
        }// switch block ends
    }//main ends
}// class ends
                                                // Question 5
class DefaultConstructor{
    public DefaultConstructor(){
        int a=100;
        int b=5;
        System.out.println(a/b);
    }// constructor ends
    public static void main(String[] args) {
        DefaultConstructor obj=new DefaultConstructor();
    }// main method ends
}// class ends
class ParameterizedConstructor{
    public ParameterizedConstructor(int a, int b){
        System.out.println(a+b);
    }// constructor ends
    public static void main(String[] args) {
        ParameterizedConstructor obj=new ParameterizedConstructor(100,200);
    }// main method ends
}// class ends
                                                    // Question 6
class ThisKeyWord{
    int a;
    int b;
    public ThisKeyWord(int c,int d){
        this.a=c;
        this.b=d;
        System.out.println(c*d);
    }// constructor ends
    public static void main(String[] args) {
        ThisKeyWord obj=new ThisKeyWord(20,30);
    }// main method ends
}// class ends