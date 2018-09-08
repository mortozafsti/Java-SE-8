package ChapterThree;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SwitchStatement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter An Input: ");
        int input = sc.nextInt();

        switch (input) {
            case 0:
                System.out.println("000000");
                break;
            case 1:
                System.out.println("111111");
                break;
            case 2:
                System.out.println("Enter An New Input: ");
                int ninput = sc.nextInt();
                switch (ninput) {
                    case 0:
                        System.out.println("0 Inner");
                        break;
                    case 1:
                        System.out.println("1 Inner");
                        break;
                }
                System.out.println("222222");
                break;
            case 3:
                System.out.println("333333");
                break;
            case 4:
                System.out.println("4444444");
                break;
            default:
                System.out.println("............Default............");

        }
    }
}
