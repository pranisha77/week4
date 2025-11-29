import java.util.Scanner;

/**
 * Write a description of class questionno1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class questionno1
{
    public static void main(String[] args){
              Scanner sc= new Scanner(System.in);
              
              
        System.out.println("Enter your marks");
        int marks= sc.nextInt();
          
          if (marks>=60){
              System.out.println("You have passed the exam");
          }
          else {
              System.out.println("You have failed the exam");
              
          }
          
        
    }
}