/**
 *
 * @author tyler
 */
public class InitArray {

    public static void main(String[] args) {/*
        int[] arrayx = new int[10];
        System.out.println("Index"+ "    Value");
        
        for(int counter = 0; counter < arrayx.length; counter++)
            System.out.println(counter + "        "+arrayx[counter]);*/
    
    /*
    int[] array = {32, 27, 26, 25, 24, 23, 50, 20};
    
    System.out.println("Index    "+ "Value");
    
    for(int counter = 0; counter < array.length; counter++)
    {
        System.out.println(counter +"        "+ array[counter]);
    }
    */
        /*
        final int ARRAY_LENGTH = 10;
        int[] array=new int[ARRAY_LENGTH];
        
        for(int counter = 0; counter < array.length; counter++)
            array[counter] = 2 + 2 * counter;
        
        System.out.println("Value     Index");
        
        for(int counter = 0; counter < array.length; counter++)      
        System.out.println(counter + "     " + array[counter]);
        */
        
        
        int[] array = {87, 86,65,5,5,5,5,5,5,343};
                int total = 0;
        
        for(int counter = 0; counter <array.length; counter++)
        {
            total = total + array[counter];

        }
                
                            
            System.out.println(total);
    }
}
