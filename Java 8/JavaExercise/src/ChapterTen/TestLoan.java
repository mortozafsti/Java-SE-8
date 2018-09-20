package ChapterTen;

public class TestLoan {

    public static void main(String[] args) {

        Loan loan = new Loan(2.5, 2, 1000);

        System.out.println(loan.getMonthlyPayment());
        System.out.println(loan.getTotalPayment());
        System.out.println(loan.getLoanAmount());
        System.out.println(loan.getLoanDate());
        System.out.println(loan.getAnnualInterestRate());
    }
}
