package Controllers;

import Clases.ClsMessage;
import Clases.ClsVoter;
import Models.MdlVoter;
import java.util.LinkedList;

/**
 *
 * @author danie
 */
public class CtlVoter {
    
    // Crear / Declarar Objeto
    MdlVoter voterModel;

    public CtlVoter() {
        // Instanciar
        this.voterModel = new MdlVoter();
    }
    
    
    // Método agregar
    public ClsMessage voterAdd(ClsVoter voterObj){
        
        // Lógica de negocio
        //this.candidateModel.CandidateAdd(candidate);
        
       return this.voterModel.voterAdd(voterObj);
        
    }
    
    // Método obtener votantes
    public LinkedList<ClsVoter> GetJTb_voter(){
        
        // Retornar
        //this.candidateModel.GetJTb_candidate();
        
        // En variable
        LinkedList<ClsVoter> voterResponse = this.voterModel.GetJTb_voter();
        
        return voterResponse;
        
    }
    
    // Método eliminar
    public ClsMessage voterDelete(String voterId){
        
        ClsMessage message = this.voterModel.voterDelete(voterId);
        
        return message;
        
    }
    
    // Método actualizar
    public ClsMessage VoterUpdate(ClsVoter voterUpdate) {

        ClsMessage message = this.voterModel.VoterUpdate(voterUpdate);

        return message;
    }
    
    
    
}
