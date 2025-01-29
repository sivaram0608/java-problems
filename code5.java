import java.util.Scanner;

public class code5{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        scanner.close();
        int number = scanner.nextInt();
        
        if( number < 5){
        System.out.println("true");
        }else{
            System.out.println("false");
            }
            
        }
       
    }

    

