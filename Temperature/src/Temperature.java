/**
 * @Name Tyler Marshall
 * @author 300210747
 */
import java.util.Scanner;
public class Temperature 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double[] temperatureArray = new double[11]; //setting up the array for temperature
        double totalTemp = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter 10 days' temperature: "); //get input
        
        /**
         * Stores the scanner input into each element of the array Temperature
         */
        for(int i = 1; i < (temperatureArray.length); i++)
        {
            System.out.print("\nPlease enter temperature " +i +": ");
            temperatureArray[i] = input.nextDouble();
        }
        /**
         * Calculates the totalTemp for the array values
         */
        for ( double i: temperatureArray)
        {
            totalTemp += i;
           // System.out.println(totalTemp);
        }
        /**
         * Calculates the average temperature, then stores it, and
         * outputs the number of days that were over average.
         */
        double averageTemp = totalTemp/temperatureArray.length; //divides the totalTemperature by the length of the array.
        System.out.println("\nThe average temperature is: "+averageTemp + " degrees"); //displays the average temperature
        System.out.println();
        for(int i = 1; i < (temperatureArray.length); i++)
        {
            if(temperatureArray[i] > averageTemp)
            {
                System.out.println("Day "+i+"'s temperature: " + temperatureArray[i]+ 
                        " was above the average temperature.");
            }
        }
    }
}