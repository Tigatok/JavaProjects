/**
 *
 * @author tyler
 */
import java.util.Scanner;
public class ChangeSchedule 
{
    public void ChangeSchedule()
            {
                 Scanner input2 = new Scanner(System.in);
                 String[] daysOfWeek;
                 System.out.println("Please change the date.");
                 System.out.println("Current Schedule: ");
                 
                 ScheduleLayout days = new ScheduleLayout();
                 days.Days();
                 
            }
    
}
