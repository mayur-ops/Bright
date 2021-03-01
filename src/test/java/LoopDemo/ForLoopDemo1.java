package LoopDemo;

public class ForLoopDemo1 {
    public static void main(String[] args) {
        for(int i=1; i<=5;i++){
            System.out.println(i);
        }
    }
}// end class

class ForLoopDemo2{
    public static void main(String[] args) {
        for(int i=5;i>=0;i--){
            System.out.println(i);
        }
    }
}//class ends

class WhileLoopDemo3{
    public static void main(String[] args) {
        int i=1;
        while (i<=5){
            System.out.println(i);
            i++;
        }// loop ends
    }// main method ends
}// class ends

class DoWhileLoopDemo4{
    public static void main(String[] args) {
        int i=1;
        do {
            System.out.println(i);
            i++;
        }while (i<=5);
    }
}

class BreakWithForLoop{
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){

            if(i==6){
              break;
            }// ends if block
            System.out.println(i);
        }//ends for loop
    }// ends main method
}// ends class