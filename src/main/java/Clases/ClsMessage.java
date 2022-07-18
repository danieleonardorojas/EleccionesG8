package Clases;

/**
 *
 * @author danie
 */
public class ClsMessage {

    public static final String OK = "OK";
    public static final String ERROR = "ERROR";
    public static final String WARNING = "WARNING";

    private String type;
    private String text;

    public ClsMessage(String type, String message) {
        this.type = type;
        this.text = message;
    }

    public String getType() {
        return type;
    }

    public String getText() {
        return text;
    }

}
