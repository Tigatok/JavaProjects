/**
 * @author Tyler Marshall 300210747
 */
public class House extends Dwelling{
    private double yardArea; //yardArea is a double that is strictly for House
    private String houseType; //HouseType is strict to House
    
    public House(String address, Zone zone, double area,
                 int bedrooms, double bathrooms, 
                 double monthlyRent, double yardArea, 
                 String houseType){

        super(address, zone, area, bedrooms, bathrooms, monthlyRent); //Takes it supers definitions
        propertyID+= "-H"; //Concatenates -H to the suffix of the propertyID
        this.yardArea = yardArea; //Initializes a variable yardArea so it uses this objects definition.
        this.houseType = houseType; //Initializes house type so it uses this objects definition.
    }
    /**
     * 
     * @return getter for yard area
     */
    public double getYardArea(){ 
        return yardArea;
    }
    /**
     * 
     * @return getter for houseType
     */
    public String getHouseType(){
        return houseType;
    }
    /**
     * 
     * @return returns a textual representation of it's super class.
     */
    @Override
    public String toString(){
        return super.toString() + "\n" + getYardArea() + "\n" + getHouseType();
    }
}
