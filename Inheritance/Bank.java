package Inheritance;

import java.util.ArrayList;
import java.util.List;
public class Bank {
    private String bankName;
    public String BranchName;
    public String Address;
    public double Balance;
    public int interestRate;
    public  double initialDepositForLoan;
    public int periodInYears;
    public List <String> accounts;
    //constructor to initialize the list.

    public Bank(){
        this.accounts = new ArrayList<>();
    }
    //method to register new customers who open up bank accounts

    public void registerCustomer(String customerDetails){
        this.accounts.add(customerDetails); //this adds a new customer anytime registration occurs
    }
    //method to display this customer registration information

    public void displayCustomerDetails(){
        for (String account: accounts){
            System.out.println(account); // to output the customer details
        }
    }
    // constructor to initialize the interestRate and period in years.
    public Bank(double initialDepositForLoan, int interestRate, int periodInYears){
        this.initialDepositForLoan = initialDepositForLoan;
        this.interestRate = interestRate;
        this.periodInYears = periodInYears;
    }
    // mathematical expression for calculating simple interest; Simple Interest = Principal*rate*time;

    // method to calculate simple interest
    public double calculateSimpleInterest(){
        return (initialDepositForLoan* interestRate* periodInYears)/100; // this is the Simple interest rate formula which is Principal*Rate*Time
    }
    public double calculateCompoundInterest(){
        return (initialDepositForLoan*Math.pow((1+ (double) interestRate /100),periodInYears)-initialDepositForLoan);
    }
    //getters and setters
    public String getBankName(){
        return  bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getBalance(){
        return Balance;
    }
    public void setBalance(double Balance){
        this.Balance = Balance;
    }

    public String getBranchName(){
        return BranchName;
    }
    public void setBranchName(String BranchName){
        this.BranchName = BranchName;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }
    public double getInitialDepositForLoan(){
        return initialDepositForLoan;
    }

    public void setInitialDepositForLoan(double initialDepositForLoan) {
        this.initialDepositForLoan = initialDepositForLoan;
    }

    public static void main (String[]args){
      Bank one = new Bank();
      one.setBankName("Absa Bank");
      one.setBalance(1200000);
      one.setBranchName("Kansanga");
      one.setAddress("Plot1211 Ggaba Road");
      System.out.println("Bank one is : ");
      System.out.println("Bank name: " + one.getBankName());
      System.out.println("Balance: " + one.getBalance());
      System.out.println("Branch: " + one.getBranchName());
      System.out.println("Address: " + one.getAddress());

        one.setBankName("DFCU Bank");
        one.setBalance(1000000);
        one.setBranchName("Kyenjojo");
        one.setAddress("Plot1451 Fort Portal Road");
        System.out.println("Bank two is:");
        System.out.println("Bank name: " + one.getBankName());
        System.out.println("Balance: " + one.getBalance());
        System.out.println("Branch: " + one.getBranchName());
        System.out.println("Address: " + one.getAddress());

        Bank myAcc = new Bank();
        Bank myDetails = new Bank();

        System.out.println("The following are the new customer Details");
        System.out.println("Welcome dear customer and thank you for trusting us with your finances!");
        myAcc.registerCustomer( "Customer name: "+  "Remember Joselyne");
        myDetails.setBankName("Absa Bank");
        myDetails.setBranchName("Kansanga Branch");
        myDetails.setAddress("Kitalanga Kansanga");
        myDetails.setBalance(3000000);
        myDetails.setInitialDepositForLoan(2000000);

        myAcc.displayCustomerDetails(); // to output the customer details

        System.out.println("Bank name: "+ myDetails.getBankName());
        System.out.println("Branch name: "+ myDetails.getBranchName());
        System.out.println("Customer Address: "+ myDetails.getAddress());
        System.out.println("Customer credit balance: "+ myDetails.getBalance());
        System.out.println("The customer's initial deposit for  the loan is: " + myDetails.getInitialDepositForLoan());

        Bank myInterest = new Bank(2000000,20,4);
        double SimpleInterest = myInterest.calculateSimpleInterest();
        System.out.println("Simple interest for "  +  myInterest.periodInYears + "years: " + SimpleInterest);
    }

}
