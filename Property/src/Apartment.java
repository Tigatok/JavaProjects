/**
 * @author Tyler Marshall 300210747
 */
public class Apartment extends Dwelling{
    private int unitNo; //Creates a int unitNo that is only seen by Apartment
    private boolean elevator; //Creates a boolean elevator variable that determines whether or not it has elevator access
    
    public Apartment(String address, Zone zone, double area, int bedrooms,
                     double bathrooms, double monthlyRent, int unitNo, boolean elevator){
        
        super(unitNo + "-" + address, zone, area, bedrooms, bathrooms, monthlyRent); //Uses the super class to add onto
        this.unitNo = unitNo; //uses this.unitNo inside the object
        this.elevator = elevator; //uses this.Elevator inside the object
        propertyID+= "-A"; //adds -A to the suffix of the propertyID
    }
    /**
     * 
     * @return getter for unitNo
     */
    public int getUnitNo(){
        return unitNo;
    }
    /**
     * 
     * @return getter for elevator (boolean) 
     */
    public boolean getElevator(){
        return elevator;
    }
    /**
     * 
     * @return Uses super.toString + textual representation of the Apartments class
     */
    @Override
    public String toString(){
        return super.toString() + String.format(elevator ? "\nElevator Access" : "");
    }
}
