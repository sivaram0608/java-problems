
//encapsulatio  is the concept of hiding the 
//internal stage of an object and only allowing 
//access through  methods(gettrs and setters)


class laptop{
    private String name;
    private String proc;
    private int ram;
    private int price;
    //getter and setter method for name
    public String getName(){
        return name;

    }//getter and seter method for proc
    public void setName(String name){
        this.name=name;

    }
    public String getProc(){
        return proc;
    }
    public void setProc(String proc){
        this.proc = proc;
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram = ram;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
public class code9 {
    public static void main(String []args){
        //create laptopb object
        laptop lap1 =new laptop();
        lap1.setName("orange");
        lap1.setProc("i7");
        lap1.setRam(16);
        lap1.setPrice(80000);
        System.out.println(lap1.getRam());
    }

    
    
    

}
