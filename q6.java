import java.util.Scanner;

/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q6
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
    if(category=='A'||category=='a')
    {
        sp=mp-(mp*0.60);
        
        System.out.println("The selling price is "+sp);
        
    } else if (category=='B'||category=='b'){
        sp=mp-(mp*0.40);
        System.out.println("The selling price is "+sp);
    }
    else if (category=='C'||category=='c'){
        sp=mp-(mp*0.20);
        System.out.println("The selling price is "+sp);
        
    }else if (category=='D'||category=='D')
    {
        sp=mp-(mp*0.10);
        System.out.println("The selling price is "+sp);
    }
    else{
        System.out.println("The selling price is "+mp);
        
    }
    }
}