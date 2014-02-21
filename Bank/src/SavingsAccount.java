/**
 * @author Tyler Marshall 300210747
 */
public class SavingsAccount extends BankAccount {//Makes this inherit BankAccount class
    private static double interestRate = 0.04; //sets an interest rate that only Savings has
    public SavingsAccount(String name){
        super(name);
    }
    @Override
    public String toString(){
        return super.toString() + "Type: Savings\n";
    }
    @Override
    public String report(){
        return "S" + accountNumber + ": $" + balance;
    }
}
