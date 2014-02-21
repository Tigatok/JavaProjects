/**
 * @author Tyler Marshall 300210747
 */
public class Dwelling extends Property implements AnnualCost{
    protected int bedrooms;     //Creates int bedrooms that will track how many bedrooms the Dwelling has
    protected double bathrooms; //int bathrooms tracks how many bathrooms there are
    protected double monthlyRent; //monthlyRate dertermines how much the user will pay per month.
    protected boolean rented; //Rented is a boolean value that will determine what and what has not been rented.
    
    public Dwelling(String address, Zone zone, double area, int bedrooms, double bathrooms, double monthlyRent){
        super(address, zone, area); //Calls the address, Zone, and area from its super class.
        this.rented = false; //Sets this.Rented to false, so it uses this objects definition.
        this.bedrooms = bedrooms; //sets this.bedrooms so it uses this objects definition.
        this.bathrooms = bathrooms; //sets this.bathrooms so it uses this objects definition.
        this.monthlyRent = monthlyRent; //sets this.monthlyRent so it uses this objects definition.
    }
    /**
     * 
     * @return getter for bedrooms 
     */
    public int getBedrooms(){ 
        return bedrooms;
    }
    /**
     * 
     * @return getter for bathrooms
     */
    public double getBathrooms(){ 
        return bathrooms;
    }
    /**
     * 
     * @return getter for monthlyRent
     */
    public double getMonthlyRent(){ 
        return monthlyRent;
    }
    /**
     * 
     * @param a setter (double) for monthlyRent
     */
    public void setMonthlyRent(double a){ 
        monthlyRent = a;
    }
    /**
     * 
     * @return getter for (boolean) getRented
     */
    public boolean getRented(){ 
        return rented;
    }
    /**
     * 
     * @param b setter for (boolean) setRented
     */
    public void setRented(boolean b){ 
        rented = true;
    }
    /**
     * 
     * @return returns in a toString from it's super class the textual representation.
     */
    @Override
    public String toString(){
        return super.toString() + "\n" + bedrooms + " bedrooms" + "\n" + bathrooms +
               " bathrooms"  + "\nRent: $" + monthlyRent +"/month" + "\nAnnual Cost: $" + annualCost();
    }
    @Override
    public double annualCost() {
        return 12*getMonthlyRent();
    }
}
