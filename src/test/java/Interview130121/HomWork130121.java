package Interview130121;

public class HomWork130121 {
                                                // Question 1
    public static void main(String[] args) {
        HomWork130121 obj=new HomWork130121();
        obj.hwDemo();
    } //main method ends
    public void hwDemo(){       // non static UDM
        int a=10;   //Local variable
        int b=20;
        int c=a+b;
        System.out.println(c);
    } // non static udm ends
} //class ends

class HomeWork1 {
    public static void main(String[] args) {
        HomeWork1 obj1=new HomeWork1();
        obj1.hwDemo1();
    } // main method ends
    public void hwDemo1(){          // non static UDM
        int a=20;       //Local variable
        int b=30;
        int c=a+b;
        System.out.println(c);
    } // non static udm ends
} //class ends

                                    // Question 2
class HomeWork2 {
        public static void main(String[] args) {
            hwDemo2();
        } //main method ends
        public static void hwDemo2(){       // static UDM
            int a=10;
            int b=20;
            int c=a+b;
            System.out.println(c);
        } //static UDM ends
    } // class ends
class HomeWork3{
    public static void main(String[] args) {
        hmDemo3();
    }// main method ends
    public static void hmDemo3(){
        int a=20;
        int b=30;
        int c=a+b;
        System.out.println(c);
    } // static UDM ends
} // class ends
                            // Question 3
class HomeWork4{
    int a=10;   // instance variable
    int b=20;
    int c=a+b;
        public static void main(String[] args) {
            HomeWork4 obj4=new HomeWork4();
            System.out.println(obj4.c);
        }  // main method ends
} // class ends
                            //Question 4
class HomeWork5{
    int a=40;   // instance variable
    int b=50;
    int c=a+b;
    public static void main(String[] args) {
        HomeWork5 obj5=new HomeWork5();
        obj5.hmDemo5();
    }   // main method ends
    public void hmDemo5(){
        System.out.println(c);
    } // non static UDM ends
} // class ends
                            // Question 5
class HomeWork6{
    static int a=10;
    static int b=20;
    static int c=a+b;
    public static void main(String[] args) {
        System.out.println(c);
    }// main method ends
}// class ends
                            // Question 6
class HomeWork7{
    static int a=30;
    static int b=40;
    static int c=a+b;
    public static void main(String[] args) {
        HomeWork7 obj7=new HomeWork7();
        obj7.hmDemo7();
    }// main method ends
    public void hmDemo7(){
        System.out.println(c);
    }//non static udm ends
}// class ends
                                // Question 7
class HomeWork8{
    static int a=40;
    static int b=20;
    static int c=a+b;
    public static void main(String[] args) {
        hmDemo8();
    }//main method ends
    public static void hmDemo8(){
        System.out.println(c);
    }// static udm ends
}//class ends
                                //Question 8
class HomeWork9{
    static int a=20;
    static int b=30;
    static int c=a+b;
    public static void main(String[] args) {
        HomeWork9 obj9=new HomeWork9();
        obj9.hmDemo9();
    }// main methods ends
    public void hmDemo9(){
        if (c<=50){
            System.out.println("value is right");
        }// non static udm ends
    }// non static udm ends
}// class ends
                        // Question 9
class HomeWork10 {
    int a=40;
    int b=40;
    int c=a+b;
    public static void main(String[] args) {
        HomeWork10 obj10=new HomeWork10();
        obj10.hmDemo10();
    }//main method ends
    public void hmDemo10(){
        System.out.println(c);
        if (c<=80){
            System.out.println("value is false");
        }else {
            System.out.println("value is right");
        }
        if (c>80){
            System.out.println("value is false");
        }else {
            System.out.println("value is right");
        }
    }// non static udm ends
}//class ends
                                // Question 10
class HomeWork11{
    static double item=16.50;

    public static void main(String[] args) {

     if(item<=5.00 && item<=10.20){
         System.out.println("item price is cheap");
     }else if(item>=10.20  && item<=12.50){
         System.out.println("item price is average ");
     }else if(item>=12.50 && item<=16.50){
         System.out.println("item price is right");
     }else {
         System.out.println("item price market value");
     }
    }// main method ends
}//class ends

                        //nested if statement
class Homework12{
    public static void main(String[] args) {
        int temp=20;

        if(temp>=20){
            System.out.println("weather is hot");
            if(temp<=20){
                System.out.println("weather is cold");
            }// inner if block ends
        }//outer if block ends
    }// main method ends
}// class ends