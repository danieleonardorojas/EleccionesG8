package Controllers;

import Clases.ClsCandidate;
import Clases.ClsElection;
import Clases.ClsMessage;
import Models.MdlElection;
import java.util.LinkedList;

/**
 *
 * @author danie
 */
public class CtlElection {
    
    MdlElection electionModel;

    public CtlElection() {
        this.electionModel = new MdlElection();
    }
    
    // Método agregar
    public ClsMessage electionAdd(ClsElection electionNew){
        
        // Lógica de negocio
        
        //this.candidateModel.CandidateAdd(candidate);
        
       return this.electionModel.electionAdd(electionNew);
        
    }
    
    // Método agregar
    public ClsMessage candidateAssociate(String id_candidate, String id_election){
        
        // Lógica de negocio
        
        //this.candidateModel.CandidateAdd(candidate);
        
       return this.electionModel.candidateAssociate(id_candidate, id_election);
        
    }
    
    public LinkedList<ClsElection> GetJTb_election(){
        
        LinkedList<ClsElection> electionResponse = this.electionModel.GetJTb_election();
        
        return electionResponse;
        
    }
    
    public LinkedList<ClsCandidate> candidatesGetPerElection(String id_election){
        
        return this.electionModel.candidatesGetPerElection(id_election);
        
    }
    
    
    
}
