import java.util.Scanner;

/**
 * Write a description of class q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q11
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your annual income (Npr):");
        double income = sc.nextDouble();
        double tax = 0;
        if (income <= 50000000){
            tax = income*0.01;
            
        } else if (income <= 7000000){
            tax = 5000000*0.01+ ((income - 5000000)*0.10);
            
        }else if (income <= 10000000){
            tax = 5000000*0.01+ (2000000*0.10+((income - 7000000)*0.20));
        } else if (income <= 20000000){
            tax = 5000000*0.01+(20000000*0.10+(3000000*0.20+(income-10000000)*0.30));
            
        } else if (income <= 50000000){
            tax = 5000000*0.01+(2000000*0.10+(3000000*0.20+(10000000*0.30+((income - 20000000)*0.36))));
            
        } else{
            tax = 5000000*0.01+(2000000*0.10+(3000000*0.20+(10000000*0.30+(30000000*0.36+((income - 50000000)* 0.39)))));
            
        }
        System.out.println("Your total tax is: NPR"+tax);
        
    }
}