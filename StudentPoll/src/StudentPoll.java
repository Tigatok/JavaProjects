/**
 *
 * @author tyler
 */
public class StudentPoll 
{

    public static void main(String[] args) 
    {
        int[] responses = {1,2,5,4,-2,3,5,2,1,3,3,1,5,3,3,3,3,
            2,3,3,2,7,6,14};
        
        int[] frequency = new int[6];
        
        for(int i = 0; i < responses.length; i++)
        {
            try
            {
                ++frequency[responses [ i ]];
                
            }
            catch(IndexOutOfBoundsException e)
            {
                System.out.println(e);
                System.out.printf(" Responses: [%d] = %d\n\n",
                        i, responses[i]);
            }
        }
    }
    
}
