package ChapterThirteen;

import java.math.BigInteger;
import java.util.Arrays;

public class ShortCompareableObject {

    public static void main(String[] args) {

        String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};
        Arrays.sort(cities);
        for (String city : cities) {
            System.out.print(city + " ");
        }
        
        System.out.println();
        
        BigInteger[] hugeNumber = {new BigInteger("23232310923"),
            new BigInteger("957846231222"), new BigInteger("1458963254")};
        Arrays.sort(hugeNumber);
        for (BigInteger bigInteger : hugeNumber) {
            System.out.print(bigInteger + " ");
        }
    }
}
