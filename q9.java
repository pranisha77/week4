import java.util.Scanner;

/**
 * Write a description of class q9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q9
{public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter you gpa");
    double gpa= sc.nextDouble();
    System.out.println("Enter your attendance");
    double attendance= sc.nextDouble();
    System.out.println("Enter attitude score");
    double attitude= sc.nextDouble();
    if (gpa>3.2){
        if (attendance>80){
            if (attitude<7){
                System.out.println(" eligible for scholarship");
                
            }
            else  {
            System.out.println("need to improve attitude");
        }}
        else{
            System.out.println("need to improve attitude and attendance score");
            
            
            
        } }else { System.out.println("need to improve gpa, attendance and attitude");
            
            
        }
    }
    
        
            
                
            }
                
            
            
        
    
    
    
    


