/**
 * @author Tyler Marshall 300210747
 */
public class BankAccount implements BalanceReportable{
    protected int accountNumber; //Declares protected accountNumber
    protected double balance; // Decalred balance as protected
    protected String name; //Declares a string named name as protected.
    private static int count = 0; //Declares the counter variable, and initializes it to 0.
    private static int newAccountNo = 1000001; //declares and initializes newAccountNo to 1000001
    public BankAccount(String name){ //Constructor for class, and takes in a string Name
        this.name = name; //Calls the 'this' method, which uses the class it's in.
        balance = 0.0; //sets balance to 0.0 a double
        count++; //Increases the count.
        setAccountNo(); //Calls the setting method.
    }
    /**
     * 
     * @return Getter for Account number, returns account number 
     */
    public int getAccountNumber(){
        return accountNumber;
    }
    /**
     * 
     * @return getter for the name, returns a name.
     */
    public String getName(){
        return name;
    }
    /**
     * 
     * @return getter for the balance, returns the balance
     */
    public double getBalance(){
        return balance;
    }
    /**
     * Setter for the account number.
     */
    private void setAccountNo(){
        accountNumber = newAccountNo; //sets account number to newAccountNo.
        newAccountNo += (int)(Math.random()*89)+10; //Casts an int to the math.random so it will get an number >0.0000000
    }
    /**
     * 
     * @param amt amount parameter takes a double
     * @return  returns the balance of the bankAccount
     */
    public double deposit(double amt){
        if(amt > 0) balance = balance +amt;//If amount is > 0, set balance to balance + amount
        return balance;//standard return.
    }
    /**
     * 
     * @return returns Account: NAME ACCOUNTNUMBER \n Balance: 
     */
    @Override
    public String toString(){ //toString method to show account name and number, plus balance
        return "\nAccount: " + name + ", " + accountNumber +
                "\nBalance: " + balance + "\n";
    }
    @Override
    public String report(){
        return null;
    }
}
