/**
 *
 * @author tyler
 */
import java.util.Random;
public class RollDie 
{

    public static void main(String[] args) 
    {
        Random randomNumbers = new Random();
        int[] frequency = new int[21];
        
        for(int roll = 1; roll <= 2; roll++)
            ++frequency[1 + randomNumbers.nextInt(20)];
        
        System.out.println("Student          Presenting");
        
        for(int face = 1; face < frequency.length; face++)
            System.out.println(face + "             " + frequency[face]);
    }
    
}
