//ABSTRACTION
//abstraction involves hiding the implementation details and showing
//only the functionality.
//this is achieved through abstract classes or interfaces.

//Abstract class to define genral properties of a laptop 
abstract class Laptop{
    String name;
    String proc;
    int ram;
    int price;
    //Abstract method to display laptop details 
    public abstract void displayDetails();
}
//concrete subclass that implements the abstract method 
class LaptopDetails extends Laptop{
    //constructor to initialize the laptop properties
    public LaptopDetails(String name,String proc,int ram,int price){
        this.name = name;
        this.proc = proc;
        this.ram = ram;
        this.price = price;

    }
//implementation of abstract method

    public void displayDetails(){
        System.out.println("Laptopname:"+name);
        System.out.println("processor:"+proc);
        System.out.println("RAM:"+ram+"GB");
        System.out.println("Price:"+price+"INR");

    }
}
public class Abstraction{
    public static void main(String[] args) {
        //create an instance of the concrete laptopDetails class
        Laptop lap1 = new LaptopDetails("orange","i7",16,80000);
        lap1.displayDetails();
    }
}
   

