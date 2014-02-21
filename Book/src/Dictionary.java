/**
 * @author Tyler Marshall 300210747
 * 
 * Title
 * pages
 * value
 * definitions - int (# of defns)
 * 
 * Methods
 * -------
 * getters
 * setter for value
 * 
 * toString()
 */
public class Dictionary extends Book { //extending the Book class, so it takes all the things.
    private int definitions; //declaring a new variable.
    /**
     * 
     * @param t inherited from the Book class(Title)
     * @param p (pages)
     * @param v(value in monetary form)
     * @param d (definitions, which is the new one, not inherited.)
     */
    public Dictionary(String t, int p, double v, int d){ //uses the same variable names as the Book class.
        super(t, p, v); //allows for us to be able to use t, p v.
        definitions = d; //Creates a new variable, definition that is specific to us.
    }
    /**
     * 
     * @return definitions, will return us the number of definitions of the string. 
     */
    public int getDefinitions(){ //returns the definitions
        return definitions; //returning definitions to the caller
    }
    /**
     * 
     * @return s returns to us the string.
     */
    public String toString(){ //gives us a textual representation of the code.
        return super.toString() + 
                "\nDefinitions: " + definitions; //builds a string which matches the parent one.
    }
}
