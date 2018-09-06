
package EvidemceOne;

/**
 *
 * @author User
 */
public class SecondMinutesHours {
    public static void main(String[] args) {
        long totalmillisecond = System.currentTimeMillis();
        
        long totalSecond = totalmillisecond / 1000;
        long currentSecond = totalSecond % 60;
        
        long totalMinutes = totalSecond / 60;
        long currentMinute = totalMinutes % 60;
        
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;
        
        System.out.println("Current Time is "+currentHour+":"+currentMinute+":"+currentSecond+" GMT");
    }
}
