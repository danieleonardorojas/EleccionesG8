package Clases;

/**
 *
 * @author danie
 */
public class ClsCandidate extends ClsPerson {
    
    private String party;
    private String hometown;
    private String description;
    private String campaign_message;
    private String proposals;

    // Constructor - Referencias

    public ClsCandidate(String documentNumber, String name, Long phone, String mail, String party, String hometown, String description, String campaign_message, String proposals) {
        super(documentNumber, name, phone, mail, party, hometown);
        this.party = party;
        this.hometown = hometown;
        this.description = description;
        this.campaign_message = campaign_message;
        this.proposals = proposals;
    }

    public String getParty() {
        return party;
    }

    public void setParty(String party) {
        this.party = party;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCampaign_message() {
        return campaign_message;
    }

    public void setCampaign_message(String campaign_message) {
        this.campaign_message = campaign_message;
    }

    public String getProposals() {
        return proposals;
    }

    public void setProposals(String proposals) {
        this.proposals = proposals;
    }

    
    
    
    
    
}
