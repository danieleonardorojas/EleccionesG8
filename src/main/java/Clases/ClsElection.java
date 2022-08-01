package Clases;

/**
 *
 * @author danie
 */
public class ClsElection {
    
    private String id_election;
    private String description;
    private String type;
    private String date_start;
    private String date_end;
    private String date_inscription;
    private String state;

    public ClsElection(String id_election, String description, String type, String date_start, String date_end, String date_inscription, String state) {
        this.id_election = id_election;
        this.description = description;
        this.type = type;
        this.date_start = date_start;
        this.date_end = date_end;
        this.date_inscription = date_inscription;
        this.state = state;
    }

    public String getDate_inscription() {
        return date_inscription;
    }

    public void setDate_inscription(String date_inscription) {
        this.date_inscription = date_inscription;
    }

    public String getId_election() {
        return id_election;
    }

    public void setId_election(String id_election) {
        this.id_election = id_election;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    
    
}
