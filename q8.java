import java.util.Scanner;

/**
 * Write a description of class q8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q8
{ public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your gpa");
    double gpa= sc.nextDouble();
    if (gpa<=4.00 && gpa>0){
        if(gpa>=3.6){
            System.out.println("You have scored A+");
            
        }
        else if (gpa>=3.2){
            System.out.println("You have scores A");
            
        }
        else if (gpa>=2.8){
            System.out.println("You have scored B+");
            
        }
        else if (gpa>=2.4){
            System.out.println("You have scored B");
            
        }
        else if (gpa>=2) {
            System.out.println("You have scored c");
        }
        else if (gpa<2){
            System.out.println("You have scored NG");
            
        }
        else{
            System.out.println("You entered invalid gpa. Please enter valid gpa");
        }
        
    }
}
}