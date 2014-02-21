/**
 * Tyler M.
 */
//******************************************************************* 
//  Lab3Try.java     Date: January 17, 2014     Author: Alan Kennedy 
//  Modified by: 
//  Purpose: Read a series of integers from the user into a 
//           5-element array and calculate the average. 
//******************************************************************* 
import java.util.Scanner; 
public class Lab3Try { 
   public static void main (String[] args) {

      Scanner scan = new Scanner(System.in);

      double[] vec = new double[5]; 
      int count = 0; 
      double sum = 0; 
      String input;

      System.out.print("Enter a number (xxx to quit): "); 
      input = scan.next();

      while(!input.toLowerCase().equals("xxx")) {
        try{
         vec[count] = Double.parseDouble(input);  // convert a string to a double 
         sum+=vec[count]; 
         count++;
        }
        catch(NumberFormatException e){
            System.out.println("Invalid Input. Try again.");
        }
        catch(ArrayIndexOutOfBoundsException e){
         System.out.println("This program can only handle up to 5 values.");   
         break;
        }
         System.out.print("Enter a number (xxx to quit): "); 
         input = scan.next();

      } // while

      if(count>0) { 
         System.out.print("\nThe average of these values:"); 
         for(int i=0; i<count; i++) 
            System.out.print("  " + vec[i]); 
         System.out.println("  is: " + sum/count + "\n"); 
      } // if 
   } // main 
}