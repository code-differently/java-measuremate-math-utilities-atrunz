package CalculatorProgram;

public class TipTaxCalculator{


    public static double tax(double billAmount, double Tax){
        return billAmount*(Tax/100);
    }

    public static double tip(double billAmount, double Tip){
        return billAmount*(Tip/100);

    }

    public static double totalBill(double billAmount, double tipRate, double taxRate){
        return (billAmount + (TipTaxCalculator.tip(billAmount, tipRate)) + (TipTaxCalculator.tax(billAmount, taxRate)));
    }

    public static long rounded(double billTotalRaw){
        return Math.round(billTotalRaw);
    }
}

