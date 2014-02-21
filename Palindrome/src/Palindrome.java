/**
 *
 * @author tyler
 */
import java.util.Scanner;
public class Palindrome 
{
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
         System.out.print("Please enter a 5 digit number: ");
        int fiveDigit = input.nextInt();
       
        
        while(fiveDigit >= 10000 && fiveDigit < 100000)
        { 
        int firstDigit = fiveDigit/10000;
        System.out.print(firstDigit);
        
        int secondDigit = (fiveDigit%10000)/1000;
        System.out.print(secondDigit);
        
        int thirdDigit = (fiveDigit%1000)/100;
        System.out.print(thirdDigit);
        
        int fourthDigit = (fiveDigit%100)/10;
        System.out.print(fourthDigit);

        int fifthDigit = (fiveDigit%10)/1;
        System.out.println(fifthDigit);
        
        if(firstDigit == fifthDigit && secondDigit == fourthDigit)
        {
            System.out.println("Your 5 digit integer is a palindrome!");
            break;
        }
        else
        {
            System.out.println("Please enter again: " );
            fiveDigit = input.nextInt();
        }
        
        }
    }
}
