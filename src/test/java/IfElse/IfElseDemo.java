package IfElse;

public class IfElseDemo {

    public static void main(String[] args) {
        double time=15.00;

        if(time>=6.00 && time<=12.00){
            System.out.println("it is morning");
        }
        else if (time >=12.00 && time<=17.00){
            System.out.println("it is afternoon");
        }
        else if (time >=17.00  && time<=20.00){
            System.out.println("it is evening");
        }
        else {
            System.out.println(" it is night");
        }
    }
}
