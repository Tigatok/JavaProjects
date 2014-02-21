/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tyler
 */
public class BarChart {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) 
    {
        
        int[] arrayLetterGrade = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};
        System.out.println("Grade Distribution: ");
        
        for(int counter = 0; counter < arrayLetterGrade.length; counter++)
        {
            
            if(counter == 10)
                System.out.printf("%5d: ", 100 );
            else
                System.out.printf("%02d-%02d: ", counter*10, counter*10+9);
            
            for(int stars = 0; stars < arrayLetterGrade[counter]; stars++)
                System.out.print("*");

            System.out.println();
        }
        
    }
    
}
