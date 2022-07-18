package Clases;

/**
 *
 * @author danie
 */
public class ClsPerson {
    
    // Declarar
    private String documentNumber;
    private String name;
    private Long phone;
    private String mail;
    private String party;
    private String hometown;
    private String description;
    private String campaign_message;
    private String proposals;

    // Constructor por defecto / Enviamos parámetros
    public ClsPerson(String documentNumber, String name, Long phone, String mail, String party, String hometown, String description, String campaign_message, String proposals) {
        this.documentNumber = documentNumber;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.party = party;
        this.hometown = hometown;
        this.description = description;
        this.campaign_message = campaign_message;
        this.proposals = proposals;
    }
    
    // Getters and Setters
    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
    
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
