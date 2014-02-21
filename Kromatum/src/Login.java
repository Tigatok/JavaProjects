import java.io.FileInputStream;    
import java.io.IOException;    
import java.util.Scanner;    
    
public class Login
{        
    public Login() throws IOException 
    {
        boolean flag=false;
        while(!flag)
        {
        Scanner scanner1, scanner2;
        
        scanner1 = new Scanner(new FileInputStream("/home/tyler/NetBeansProjects/Kromatum/loginFile.txt"));
        scanner2 = new Scanner(System.in);
       
        String name, pword, n, p;
        System.out.print("Enter Username: ");
        n = scanner2.next();
        
        System.out.print("Enter password: ");
        p = scanner2.next();
        System.out.println();
        
        while(scanner1.hasNext())
        {
            name = scanner1.next();
            pword = scanner1.next();
            
            if(n.equals(name) && p.equals(pword)) 
            {
                System.out.println("You are logged in.");
                flag = true;
            }                
        }
        if(!flag)
        System.out.println("Incorrect password.");
        }
    }
}