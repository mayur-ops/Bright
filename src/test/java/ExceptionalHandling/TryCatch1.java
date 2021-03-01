package ExceptionalHandling;

import java.util.ArrayList;

public class TryCatch1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10); // index 0
        numbers.add(20); // index 1
        numbers.add(30); // index 2

        System.out.println(numbers.get(0));
        try {
            System.out.println(numbers.get(3));   // out of bound exceptional because out of index number
        }catch (Exception e){
            System.out.println("something went wrong");
        }
        finally {
            System.out.println("try and catch block handle the exception");
        }
        System.out.println(numbers.get(1));
    }
}
