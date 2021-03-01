package Simple;

public class LocalDemo {
    public static void main(String[] args) {
        int a = 10;     //Local variable
        int b = 20;
        int c = a + b;
        System.out.println(c);
    }
} // class ends

    class InstanceVariable {
        int d=10;       //Instance variable
        int e=20;
        int f=d+e;
        public static void main (String[] args){
            InstanceVariable obj=new InstanceVariable();
            System.out.println(obj.f);
            obj.demo();
        }
        public void demo(){     //non-udm
            System.out.println(f);
        }
}    // class ends

    class StaticVariableDemo{
    static int g=10;        // static variable
    static int h=20;
    static int i=g+h;

    public static void demo2(){  // static udm
        System.out.println(i);
    }

        public static void main (String[] args){
            StaticVariableDemo obj=new StaticVariableDemo();
            obj.demo2();
        }
} // class ends

    class NonStaticUdmDemo {    //non static user define method
        public void Demo() {
            int a = 10;
            int b = 20;
            int c = a + b;
            System.out.println(c);
        }
        public static void main(String[] args) {       // non-static udm need object
        NonStaticUdmDemo obj=new NonStaticUdmDemo();
        obj.Demo();
        }
    } // class ends

    class StaticUdmDemo {
    public static void demo1 (){
        int x=10;
        int y=20;
        int c=x+y;
        System.out.println(c);
    }
        public static void main(String[] args) {        // static udm don't need object
            demo1();
        }
    }   // class ends

// call instance variable in main method = need object
//call instance variable in non-static user define method = don't need object
//call instance variable in static user define method = not possible(call instance specific)

// call static variable in main method = don't need object
//call static variable in not-static define method  = don't need object
//call static variable in static user define method = don't need object

// call non-static user define method in main method = need object
//call static user define method in main method = don't need object


class StringDemo{

    public static void main(String[] args) {
        String FirstName="Ketan";
        String LastName="Patel";
        int a= 10;
        int b=20;
        int c= a+b;

        System.out.println(FirstName + LastName);
        System.out.println(FirstName + " " + LastName);
        System.out.println("Ketan"+"Patel");
        System.out.println("Ketan" + " " + "Patel");
        System.out.println("total of a and b is = " + c);

    }
}



