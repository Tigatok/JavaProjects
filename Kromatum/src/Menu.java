/**
 *
 * @author tyler
 */
import java.util.Scanner;
public class Menu
{
    Scanner input = new Scanner(System.in);
    private final int selection = input.nextInt();
   
    public void menuSelections()
    {
        switch (selection)
        {
            case 1: 
                System.out.println("You have selected Schedule\n");                
                Schedule.Schedule();
                break;
                
            case 2: 
                System.out.println("You have selected Check PayCheck\n");
                break;
                
            case 3: 
                System.out.println("You have selected Employee Information\n");
            
            default:
                System.out.println("Logging out...\n");
                break;
        }
    }
    
}
