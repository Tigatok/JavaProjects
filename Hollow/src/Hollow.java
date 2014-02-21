/**
 *
 * @author 300210747
 */
import java.util.Scanner;
public class Hollow
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What size box would you like to create? ");
        int size = in.nextInt();
        for(int i = 0; i < size; i++)
        {

            if(i == 0)

                for(int h = 0; h<size; h++)

                    if(h != size-1)
                        System.out.print("*");

                    else System.out.println("*");

            else if(i==size-1)

                for(int k = 0;k<size; k++)

                    System.out.print("*");                 

            else {

                    for(int x = 0; x<size;x++)

                        if(x == 0)

                            System.out.print("*");

                        else if(x == size-1) 

                            System.out.println("*");

                        else System.out.print(" "); 

                }

        }

    }
}