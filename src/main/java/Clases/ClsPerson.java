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
    private String address;
    private String type_document;
    

    // Constructor por defecto / Enviamos parámetros
    public ClsPerson(String documentNumber, String name, Long phone, String mail, String address, String type_document) {
        this.documentNumber = documentNumber;
        this.name = name;
        this.phone = phone;
        this.mail = mail;
        this.address = address;
        this.type_document = type_document;
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
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType_document() {
        return type_document;
    }

    public void setType_document(String type_document) {
        this.type_document = type_document;
    }
    
    
}
