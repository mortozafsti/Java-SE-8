package ChapterTwo;

import java.util.Scanner;

/**
 *
 * @author Cf-37
 */
public class ComputeLoan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Annual Interest Rate: 7.25");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        
        System.out.println("Enter Number Of Years: 5");
        int numberofyears = input.nextInt();
        
        System.out.println("Enter Loan Amount: 120000");
        double loanamount = input.nextDouble();
        
        double monthlyPayment = loanamount * monthlyInterestRate / (1-1/Math.pow(1+monthlyInterestRate, numberofyears * 12));
        double totalPayment = monthlyPayment * numberofyears * 12;
        
        System.out.println("The monthly payment is $"+(int) (monthlyPayment * 100) / 100);
        System.out.println("The Total payment is $"+(int) (totalPayment * 100) / 100);
    }
}
