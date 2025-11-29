import java.util.Scanner;

/**
 * Write a description of class questionno5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class questionno5
{ public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int num= sc.nextInt();
    int a = 3;
    int b = 5;
     System.out.println("Enter the number");
    if (num%a==0 && num%b==0){
        
        System.out.println("The number is divisble by 3 and 5");
        
    }
     else if(num%a==0) {
        System.out.println("The number is divisible by 3 but not 5 ");
        
    }
    else if (num%b==0){
        System.out.println("The number is  divisible by 5 but not 3");
        
        
        
    }
    else {
        System.out.println("The number is divisble by both");
        
    }
    
    
   }
}