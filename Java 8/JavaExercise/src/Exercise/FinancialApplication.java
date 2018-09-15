package Exercise;

public class FinancialApplication {

    public static void main(String[] args) {

        FinancialApplication fa = new FinancialApplication();
        float rs = fa.dotenyearsTution();

        float rs1 = fa.totalCostforFourYears();
        System.out.println("Total Totion For Ten Years: " + rs);
        System.out.println("Total Cost For Four Years: " + rs1);

    }

    public float dotenyearsTution() {
        float TUTION_PER_YEAR = 10000;
        float INCREASE_PER_YEAR = 0.05f;
        float NUMBERS_OF_YEAR = 10;
        float tenYearTution = (TUTION_PER_YEAR + (TUTION_PER_YEAR * INCREASE_PER_YEAR) * NUMBERS_OF_YEAR);

        return tenYearTution;
    }

    public float totalCostforFourYears() {
        float TUTION_PER_YEAR = 10000;
        float INCREASE_PER_YEAR = 0.05f;
        float NUMBERS_OF_YEAR = 4;
        float fpurYearTution = (TUTION_PER_YEAR + (TUTION_PER_YEAR * INCREASE_PER_YEAR) * NUMBERS_OF_YEAR);

        return fpurYearTution;
    }
}
