
import java.util.Collections;
import java.util.LinkedList;

public class code14 {
    public static void main(String[]args){
        LinkedList<Integer> cars = new LinkedList<Integer>();
        cars.add(45);
        cars.add(34);
        cars.add(07);
        cars.addFirst(45);
        cars.addLast(45);
        cars.removeLast();
        cars.remove(2);
        System.out.println(cars);
        Collections.sort(cars);
        for(int i:cars){
            System.out.println(i);
        }
    }
    
}
