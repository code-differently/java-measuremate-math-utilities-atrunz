package CalculatorProgram;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        //scanner to enter bill amount
        System.out.println("Enter your bill amount: ");
        double billAmount = scanner.nextDouble();


        //enter tax rate in % (double)
        System.out.println("Enter your tax rate (%): ");
        double taxRate = scanner.nextDouble();

        //enter tip rate in % (double)
        System.out.println("Enter your tip rate (%): ");
        double tipRate = scanner.nextDouble();

        //return total raw
        double totalRaw = TipTaxCalculator.totalBill(billAmount, tipRate, taxRate);

        //return total rounded
        long totalRounded = TipTaxCalculator.rounded(totalRaw);

        System.out.println("Bill amount: " + billAmount);
        System.out.println("Tax amount: " + TipTaxCalculator.tax(billAmount, taxRate));
        System.out.println("Tip amount: " + TipTaxCalculator.tax(billAmount, tipRate));
        System.out.println("Total (raw) " + totalRaw);
        System.out.println("Total (rounded) " + totalRounded);

    }
}
