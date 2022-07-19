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
    

    // Constructor por defecto / Enviamos parámetros
    public ClsPerson(String documentNumber, String name, Long phone, String mail) {
        this.documentNumber = documentNumber;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
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
    
    
}
