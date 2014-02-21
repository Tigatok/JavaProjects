import java.io.IOException;
public class Kromatum
{
public static void main(String [] args) throws IOException
    {
         Login myLogin = new Login();
         System.out.println("What would you like to do?");
         System.out.printf("\n%s\n%s\n%s\n%s\n\n%s"                 ,
                                             "1. Schedule"          ,
                                             "2. Check PayCheck"    ,
                                             "3. Vacation Pay"      ,
                                             "4. Logout"            ,
                                             "Selection: "          );
         
         Menu myMenu = new Menu();
         myMenu.menuSelections();
    }
}