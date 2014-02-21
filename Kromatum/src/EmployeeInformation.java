/**
 *
 * @author tyler
 */
import java.util.Scanner;
public class EmployeeInformation 
{
    private int selection1;
    public void getEmployeeInformaton()
    {
        Scanner selection = new Scanner(System.in);
        System.out.printf("%6s %6s %6s %6s %6s", "1. First Name", "2. Last Name", "3. Salary", "4. Address", "5. Title");
        selection1 = selection.nextInt();
        
        while(selection1 != -1)
        {
        switch(selection1)
        {
            case 1:
                
        }
        
    }
        
}
}
