/**
 *
 * @author tyler
 */
import java.util.Scanner;
public class Schedule
{
    public static void Schedule()
    {
        System.out.print("Would you like to: \n1- View Schedule or 2- Change Schedule (Doesn't work) \nSelection: ");
        Scanner input = new Scanner(System.in);
        final int scheduleSelection = input.nextInt();

        switch(scheduleSelection)
        {
            case 1:
                getSchedule();
                break;
         //   case 2:
           //     setSchedule();
             //   break;    
        }
    }  
    
    private static void getSchedule()
    {
        ScheduleLayout schedule = new ScheduleLayout();
        System.out.println("Your Schedule is: ");
        schedule.Days();
    }
    
  /*  public static void setSchedule()
    {
        System.out.println("Now changing schedule");
        ChangeSchedule changeSchedule = new ChangeSchedule();
        changeSchedule.ChangeSchedule();
        //go to the change schedule class.
        
    }*/
}