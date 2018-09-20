
package ChapterTen;

import java.util.Date;

public class Loan {
    
    double annualInterestRate;
    int numberOfYears;
    double loanAmount;
    Date loanDate;

    public Loan() {
       this(2.5, 1,1000);
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public double getMonthlyPayment(){ 
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /(1-(1 / Math.pow(1+ monthlyInterestRate,  numberOfYears * 12)));
        
        return monthlyPayment;
    }
    public double getTotalPayment(){ 
     double totalPayment = getMonthlyPayment() * numberOfYears * 12;
     return totalPayment;
    }
    
    
}
