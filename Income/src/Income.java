/**
 *
 * @author 300210747
 */
import java.util.Scanner;
public class Income {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter how many incomes you want to calculate: ");
        
        int num = input.nextInt();

        double[] incomeArray = new double[num+1];
        for(int i = 1; i < incomeArray.length; i++)
        {
            System.out.print("Please enter an Income: ");
            incomeArray[i]  = input.nextDouble();
            System.out.println(incomeArray[i]);
        }
        
        double highestIncome = incomeArray[0];
        for(int i = 0; i < incomeArray.length; i++)
        {
            if (incomeArray[i] > highestIncome)
            {
                highestIncome  = incomeArray[i];
            }
        }
        System.out.print("The highest Income is: "+highestIncome);
        
        for(int i = 1; i < incomeArray.length; i++)
        {
            if(incomeArray[i] < ((highestIncome)*.10))
            {
                System.out.println();
                System.out.println("Family "+i+" makes less than 10% of the maximum income.");
            }
        }
    }
}