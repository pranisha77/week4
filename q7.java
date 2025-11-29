import java.util.Scanner;

/**
 * Write a description of class q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q7
{
    public static void main(String[] args){
        double sp;
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("\nEnter the marked price");
        double mp= sc.nextDouble();
        sc.nextLine();
        System.out.println("\nEnter the category");
        char category= sc.next().charAt(0);
    switch (category){
   case 'A': 
       case 'a':
           sp=mp-(mp*0.60);
            System.out.println("The selling price is "+sp);
            break;
            case 'B':
                case 'b':
                    sp=mp-(mp*0.40);
                    System.out.println("The selling price is "+sp);
                    break;
                    case 'C':
                        case 'c':
                            sp=mp-(mp*0.20);
                            System.out.println("The selling price is "+sp);
                            break;
           case 'D':
               case 'd':
                    sp=mp-(mp*0.10);
                    System.out.println("The selling price is "+sp);
                    break;
                    default: 
                        System.out.println("The selling price is "+mp);
                        
                        
                        
       
    }
    
}
}