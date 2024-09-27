package Inheritance;
//this class called Savings is a subclass of the super class Bank. I am going to use it to show single inheritance in java where a class only inherits from one parent class and in this case the child class(Savings) is going to inherit properties from the parent class(Bank)
public class Savings extends Bank {
    public double principal;

    @Override
    // mathematical formula for calculating compound interest = P(1+(R\100)^T - p
    // so I used this formula to define the method for calculating  the Compound interest
    //P is the principal;
    //R is the compound interest
    //T is the period in years
    public double calculateCompoundInterest(){
        return (principal*Math.pow((1+ (double) interestRate /100),periodInYears)-initialDepositForLoan);
    }
    public Savings (){
        super();
    }
    public Savings(double principal , int periodInYears, int interestRate){
        this.principal = principal;
        this.periodInYears = periodInYears;
        this.interestRate = interestRate;
    }



public static void main(String[]args){
    Savings save = new Savings(500000 , 5, 2);
    double CompoundInterest = save.calculateCompoundInterest();
    System.out.println("The compound interest is: " + CompoundInterest);
}



}
