package ChapterSix;

/**
 *
 * @author User
 */
public class Test {

    //It is called from another class
    public static void main(String[] args) {
        MethodEx8 re = new MethodEx8();
        int rs = re.makeSubstituteFromMethod(5, 7);
        System.out.println("Result: " + rs);

        re.makeMultiSingleMethod(10, 2);
    }
}
