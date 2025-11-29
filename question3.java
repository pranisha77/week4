import java.util.Scanner;

/**
 * Write a description of class question3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question3
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println("Enter the number");
        if(num>0){
            System.out.println("The number is positive");
            
        }
        else if(num<0){
            
            System.out.println("The number is negative");
            
            
        }
        else {
            System.out.println("The number is zero");
            
        }
    }
}
    
        
    
