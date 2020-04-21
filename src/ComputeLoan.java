import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args){
        //Creat a Scanner object
        Scanner input = new Scanner(System.in);

        //Enter annual interest rate in percentage, e.g., 7.25%
        System.out.print("Enter annual interest rate , e.g., 7.25%：");
        double annualInterestRate = input.nextDouble();

        //Obtain monthly interest rate
        double monthlyInterestRate = annualInterestRate /1200;

        //Enter number of years
        System.out.print("Enter number of years as an integer, e.g., 5:");
        int numberOfYear = input.nextInt();

        //Enter loan amount
        System.out.print("Enter loan amount, e.g., 1200000.95:");
        double loanAmount = input .nextDouble();

        //Calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate / (1
                - 1/Math.pow(1 + monthlyInterestRate,numberOfYear*12));
        double totalPaymen  = monthlyPayment * numberOfYear * 12;

        //Display results
        System.out.println("The monthly payment is $" + (int)(monthlyPayment*100)/100.0);
        System.out.println("The total payment is $" + (int)(totalPaymen*100)/100.0);

    }
}
