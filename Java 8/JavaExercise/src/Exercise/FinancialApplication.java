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
        float tution = 10000;
        float increase = 0.05f;
        float NUMBERS_OF_YEAR = 10;
        float tenYearTution = (tution + (tution * increase) * NUMBERS_OF_YEAR);

        return tenYearTution;
    }

    public float totalCostforFourYears() {
        float tution = 10000;
        float increase = 0.05f;
        float NUMBERS_OF_YEAR = 4;
        float tenYearTution = (tution + (tution * increase) * NUMBERS_OF_YEAR);

        return tenYearTution;
    }
}
