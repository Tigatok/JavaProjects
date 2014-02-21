/**
 * @author Tyler Marshall 300210747
 */
public class Zone {
    private String category;
    private int code;
    private String description;
    public Zone(String cat, int c, String desc) {
        category = cat;
        code = c;
        description = desc;
    }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public int getCode() { return code; }
    @Override
    public String toString() { return category + code; }
}