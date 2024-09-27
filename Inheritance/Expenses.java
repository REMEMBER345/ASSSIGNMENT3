package Inheritance;

public class Expenses extends  Bank{
    public double totalExpenditure;

    //constructor
    public Expenses(double totalExpenditure){
        this.totalExpenditure = totalExpenditure;
    }
    @Override
    public double getBalance() {
        return super.getBalance();
    }
    public void setBalance(double Balance) {
        super.setBalance(Balance);
    }
    // method to calculate the remaining amount after expenditure
    public double calculateRemainingAmount(){
        return Balance - totalExpenditure;
    }
    public static void main (String[]args){
        Expenses budget = new Expenses(100000);
        budget.setBalance(250000);
        budget.getBalance();
        double RemainingAmount = budget.calculateRemainingAmount();
        System.out.println("The remaining amount is: " + RemainingAmount);
    }
}
