/**
 *
 * @author tyler
 */
import java.util.Scanner;
public class Binary 
{
    

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a Binary number: ");
        long bin = input.nextLong();
        
        int base =1;
        int dec = 0;
        
        while(bin > 0)
        {
            long rem = bin%10;
            bin /= 10;
            rem *= base;
            dec += rem;
            base *= 2;
        }
        System.out.print(dec);
                
        
        
    }
    
}
