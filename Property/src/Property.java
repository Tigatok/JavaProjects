/**
 * @author Tyler Marshall 300210747
 */
public abstract class  Property implements AnnualCost{
    private static int idCounter = 1000001; //sets the idCounter for the houses at 1000001
    protected String propertyID; //defines propertyID protected so it can be used in other inherited classes.
    protected String address; //address is protected as well
    protected Zone pZone; //also protected so it can be used in other inherited classes.
    protected double area; //area is a proteced double.
    
    public Property(String address, Zone pZone, double area){ //constructor for the Property Class, 
        this.address = address; //uses this.X so it takes the value in the class instead of the variables value.
        this.pZone = pZone; //same thing
        this.area = area; // same thing
        this.propertyID = pZone.getCategory()+idCounter++; //Adds zone number onto the houses that need a zone 
    }
    /**
     * getter for the address
     * @return returns an address
     */
    public String getAddress(){
        return address;
    }
    /**
     * getter for Zone
     * @return returns the pZone
     */
    public Zone getZone(){
        return pZone;
    }
    /**
     * getter for Area
     * @return returns the area for the place
     */
    public Double getArea(){
        return area;
    }
    /**
     * Setting the zone method/
     * @param z sets the zone
     */
    public void setZone(Zone z){
        pZone = z;
    }
    /**
     * Returns the propertyID
     * @return 
     */
    public String getPropertyID(){
        return propertyID;
    }
    
    @Override
    public String toString(){
        return "Property " + getPropertyID() + "\n" + getAddress() +
               " (" + getArea() + "sq.ft., " + getZone() + ")";
    }
    /**
     * 
     * @return nothing because of the abstractedness.
     */
    @Override
    public abstract double annualCost();
}
