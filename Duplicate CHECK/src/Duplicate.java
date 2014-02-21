import java.util.Scanner;

public class Duplicate {


       public static void main (String args[]) {
              int array[] = new int [5];
              Scanner input = new Scanner(System.in);
              int loopCount = 0;

              while (loopCount < array.length) {
                     System.out.println("Enter number: ");
                     int temp = input.nextInt();

                     
                     if (temp >= 10 && temp <= 100) {
                           boolean flag = false; 

                           
                           for (int i = 0; i < loopCount; i++) {
                                  
                                  if (temp == array[i]) {
                                         flag = true;
                                  }
                           }

                           if (!flag) {
                                  array[loopCount] = temp;
                                  loopCount ++;
                                  System.out.println(temp + " is added.");
                           }
                           else {
                                  System.out.println(temp + " has been entered.");
                           }
                     }
                     else {
                           System.out.println("Numbers should be between 10 and 100");
                     }

                     System.out.println("The numbers currently in the array are:");
                     for (int i = 0; i < loopCount; i++ ) {
                           System.out.print(array[i] + " ");
                     }

                     System.out.println("\n");
              }
       }
}