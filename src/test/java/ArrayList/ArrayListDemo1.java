package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars.get(0));

        for (String car : cars) {
            if (car == "BMW") {
                System.out.println(car);
            }
        }
    }
}
class ArrayListDemo3{
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("volvo");
        cars.add("BMW");
        cars.add("Ford");
        // Collections.sort(cars);
        Collections.sort(cars,Collections.reverseOrder());
        for(String car:cars){
            System.out.println(car);
        }
    }
}

// example of declaring wrapper class in list
class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Byte> numbers = new ArrayList<>();
        ArrayList<Short> numbers2 = new ArrayList<>();
        ArrayList<Integer> numbers3 = new ArrayList<>();
        ArrayList<Long> numbers4 = new ArrayList<>();
        ArrayList<Float> numbers5 = new ArrayList<>();
        ArrayList<Double> numbers6 = new ArrayList<>();
        ArrayList<String> numbers7 = new ArrayList<>();
        ArrayList<Character> numbers8 = new ArrayList<>();
        ArrayList<Boolean> numbers9=new ArrayList<>();
    }
}