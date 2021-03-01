package Interview260121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SingleDimensalArrays1 {
    public static void main(String[] args) {
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        //arr[5]=60;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        //System.out.println(arr[5]); // out of bound exception.
    }
}
class SingleForEachLoop{
    public static void main(String[] args) {
        int arr[]=new int[2];
        arr[0]=10;
        arr[1]=20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        for(int i:arr){
            System.out.println(i);
        }
    }
}
class DecInstInitializationArrays{
    public static void main(String[] args) {
        int arr[]={33,3,4,40};
        for(int i:arr){
            System.out.println(i);
        }
    }
}
class EvenNumberArrays{
    public static void main(String[] args) {
        int arr[]={10,20,13,15,26,17,19};
        for(int i:arr){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
class OddNumberArrays{
    public static void main(String[] args) {
        int arr[]={10,20,13,15,26,17,19};
        for(int i:arr){
            if(i%2 !=0){
                System.out.println(i);
            }
        }
    }
}
class AscendingOrderArrays{
    public static void main(String[] args) {
        int arr[]={10,20,13,15,26,17,19};
        Arrays.sort(arr); // ascending order syntax
        for(int i:arr){
            System.out.println(i);
        }
    }
}
class DescendingOrderArrays{
    public static void main(String[] args) {
        int arr[]={10,20,13,15,26,17,19};
        Integer a[]=new Integer[]{10,20,13,15,26,17,19}; // convert into wrapper class
        Arrays.sort(a,Collections.reverseOrder()); // syntax of descending order printout
        for(int i:a){
            System.out.println(i);
        }
    }
}
class MinMaxArrays{
    public static void main(String[] args) {
        int arr[]={-8,10,-2,40,-4,50};
        Arrays.sort(arr); // ascending order syntax
            System.out.println(arr[0]); // min
            System.out.println(arr[arr.length-1]);  // max
    }
}

class ArrayListInArrays{
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        System.out.println(animals.get(0));   // print by index number
        for(String animal:animals){  // for each loop can print all animals
            if (animal=="Tiger"){
                System.out.println(animal);   // print individual animal as you wish
            }
        }
    }
}
class ArrayListInAlphabeticalOrder{
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Elephant");
        //Collections.sort(animals);                    // syntax of alphabetical order
        Collections.sort(animals,Collections.reverseOrder());    // syntax for reverse alphabetical order.
        for(String animal : animals){
            System.out.println(animal);
        }
    }
}
class TryAndCatchArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList();
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        System.out.println(numbers.get(0));
        try {
            System.out.println(numbers.get(3));
        }catch (Exception e){
            System.out.println(" catch block handle");
        }
        finally {
            System.out.println("finally try and catch block handle the exception");
        }
        System.out.println(numbers.get(2));
    }
}

class StringDemo2{
    public static void main(String[] args) {
        String s1="Mayur";
        String s2="Patel";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.trim());
        System.out.println(s1.startsWith("May"));
        System.out.println(s1.endsWith("ur"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(3));
        System.out.println(s1.length());
        System.out.println(s1.replace("Mayur","Dipika"));
        System.out.println(s1.contains("yu"));
        System.out.println(s1.concat(s2));
    }
}