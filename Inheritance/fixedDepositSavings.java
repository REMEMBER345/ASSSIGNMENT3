package Inheritance;
//fixedDepositSavings extends the Savings Class
public class fixedDepositSavings extends Savings{
    // method to calculateFixedDepositSavings; amount that will be withdrawn at the end of the investment period
    //we are going to use compound interest to calculate the total amount
// mathematically calculating the amount is given by A = P(1+r/n)^(n*t)
    //where A is the total amount, P is the principal, r is the rate, t is the time in years ab=nd n is the compound rate
    public int compoundRate;
    public fixedDepositSavings(double principal , int periodInYears, int interestRate, int compoundRate){
        this.principal = principal;
        this.periodInYears = periodInYears;
        this.interestRate = interestRate;
        this.compoundRate = compoundRate;
    }
    public double calculateAmount(){
        return principal*Math.pow(1+(double)(interestRate/compoundRate),compoundRate*periodInYears);
    }
    public static void main(String[]args){
        fixedDepositSavings fixed = new fixedDepositSavings(100000,2 ,2, 5);
    double Amount = fixed.calculateAmount();
    System.out.println("The amount is: "+ Amount);
    }
}
