/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChapterTwo;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class ShowCurrentTime {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long totalmillsecond = System.currentTimeMillis();
        long totalSecond = totalmillsecond / 1000;
        long currentSecond = totalSecond / 60;
        long totalMinutes = totalSecond / 60;
        long currentMinutes = totalMinutes / 60;
        long totalhour = totalMinutes / 60;
        long Currentlhour = totalMinutes % 24;

        System.out.println("Current time is " + Currentlhour + ":" + currentMinutes + ":" + currentSecond + " GMT");

        double s = 1.0;
        double d = 5.0;
        double c = s-- + ++d;
        System.out.println("S: " + s);
        System.out.println("C: " + c);
    }
}
