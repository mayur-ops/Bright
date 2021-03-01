package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collection.*;
import static java.util.Collections.reverseOrder;


public class SingleDimension1 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        //arr[5]=60;// Array Index out of bounds Exception
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        for(int i: arr){            // for each loop
            System.out.println(i);
        }
    }
}
class SingleDimension2{
    public static void main(String[] args) {
        int arr[]={33,3,4,25};

        for(int i:arr){
            System.out.println(i);
        }
    }
}

class OddEvenNumber{
    public static void main(String[] args) {
        int arr[]={2,5,55,80,60,50};
        for(int i:arr){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}

class AscendingOrder{
    public static void main(String[] args) {
        int arr[]={33,3,4,50,56,89,23};
        Arrays.sort(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
}

class DecendingOrder{
    public static void main(String[] args) {
        int arr[]={33,3,4,50,69,67,89};

        Integer a[]=new Integer[]{33,3,4,50,69,67,89};
        Arrays.sort(a, Collections.reverseOrder());
        for(int i:a){
            System.out.println(i);
        }
    }
}
class MinMax{
    public static void main(String[] args) {
        int[] arr={-2,-18,2,25,12,6,8};

        Arrays.sort(arr);

        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
    }
}