/**
 * @author Tyler Marshall 300210747
 */
public class BusinessProperty extends Property implements AnnualCost{
    private int unitNo; //Declares the new variables that are NOT inherited.
    private String businessType; //Sets businessType to a string. 
    private double leaseRate; //sets leaseRate to double
    
    public BusinessProperty(String address, Zone zone, double area, int unitNo, String businessType){ //address, zone, area, unitnumber, businesstype
        super(address, zone, area); //takes address, zone, and area from the class before it.
        this.unitNo = unitNo; //Declares this.unitNo as the unitNo in this class
        this.businessType = "\nType: " + businessType; //Declares this.businessType as the businessType in this class
        leaseRate = 0.0; //sets leaseRate to 0.0
        propertyID+= "-B"; //adds the suffix -B for businessProperty
    }
    /**
     * 
     * @return returns unitNo
     */
    public int getUnitNo(){
        return unitNo;
    }
    /**
     * 
     * @return returns businessType
     */
    public String getBusinessType(){
        return businessType;
    }
    /**
     * 
     * @param s sets businessType to whatever it's caller wants
     */
    public void setBusinessType(String s){
        businessType = s;
    }
    /**
     * 
     * @return returns leaseRate
     */
    public double getLeaseRate(){
        return leaseRate;
    }
    /**
     * 
     * @param d sets leaseRate to whatever it's caller wants
     */
    public void setLeaseRate(double d){
        leaseRate = d;
    }
    /**
     * 
     * @return Returns a super.toString() so that it can use the inherited version of the toString method.
     */
    @Override
    public String toString(){
        return super.toString() + businessType + "\nAnnual Cost: $" + annualCost(); //+ "\n" + area;
    }
    @Override
    public double annualCost() {
        return getLeaseRate() * getArea();
    }
}
