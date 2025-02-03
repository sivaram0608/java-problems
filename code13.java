import java.util.Collections;
import java.util.LinkedList;

public class code13 {
    public static void main(String[]args){
        LinkedList<String> cars = new LinkedList<String>();
        cars. add("Volvo");
        cars. add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        Collections.sort(cars);
        //sort cars
        for(String i : cars){
        System.out.println( i);
        }
        }
    }
         


