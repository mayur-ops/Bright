package WideningDemo;

public class WideningDemo1 {
    public static void main(String[] args) {
        int a=100;
        float b=a;
        System.out.println(b);
        System.out.println(a);
    }
}
class WideningDemo2{
    public static void main(String[] args) {
        //widening from long to double
        long l=2568;
        double d=l;
        System.out.println(l);
        System.out.println(d);
    }
}
