/**
 *
 * @author Tyler Marshall 300210747
 * Title - String
 * Pages - int
 * Value (monetary) - double
 * 
 * Methods
 * ________
 * getters
 *  -getTitle()
 *  -getPages()
 * 
 * setters
 *  -setValue(double v)
 * 
 * toString()
 *  
 */
public class Book {
    /**
     * @param args the command line arguments
     */
    private String title;
    private int pages;
    private double value;
    
    public Book(String t, int p, double v){
        title = t;
        pages = p;
        value = v;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public double getValue(){
        return value;
    }
    
    public void setValue(double v){
        value = v;
    }
    
    public String toString(){
        String s = "Title: " + title +
                   "\nPages: " +pages+
                   "\nValue: " +value;
        return s;
    }
}
//Many languages have mechanisms that allow you to model an "IS_A" relationship between classes.
//we use the keyword extends to specify that a class is derived from another class.
//dictionary class is derived from the Book class.