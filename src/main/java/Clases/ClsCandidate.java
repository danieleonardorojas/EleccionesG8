package Clases;

/**
 *
 * @author danie
 */
public class ClsCandidate extends ClsPerson {

    // Constructor - Referencias
    public ClsCandidate(String documentNumber, String name, Long phone, String mail, String party, String hometown, String description, String campaign_message, String proposals) {
        // Usa constructor padre
        super(documentNumber, name, phone, mail, party, hometown, description, campaign_message, proposals);
    }
    
    
    
}
