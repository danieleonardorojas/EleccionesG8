package Controllers;

import Clases.ClsCandidate;
import Clases.ClsMessage;
import Models.MdlCandidate;
import java.util.LinkedList;

/**
 *
 * @author danie
 */
public class CtlCandidate {
    
    // Crear / Declarar Objeto
    MdlCandidate candidateModel;

    // Crear constructor por defecto
    public CtlCandidate() {
        // Instanciar
        this.candidateModel = new MdlCandidate();
    }
    
    
    // 2 M - Método / Función tipo lista. Llama al modelo (PARA DESCARGUE DE DATOS DESDE BD)
    public LinkedList<ClsCandidate> GetJTb_candidate(){
        
        // Retornar
        //this.candidateModel.GetJTb_candidate();
        
        // En variable
        //candidateResponse = this.candidateModel.GetJTb_candidate();
        LinkedList<ClsCandidate> candidateResponse = this.candidateModel.GetJTb_candidate();
        
        return candidateResponse;
        
    }
    
    // Mensaje en forma de entrada
    //public ClsMessage candidateUpload(ClsCandidate candidateObj) {

        //return this.candidateModel.candidateUpload(candidateObj);
    //}
    
    // Método agregar
    public ClsMessage candidateAdd(ClsCandidate candidateObj){
        
        // Lógica de negocio
        //this.candidateModel.CandidateAdd(candidate);
        
       return this.candidateModel.candidateAdd(candidateObj);
        
    }
    
    // Método eliminar
    public ClsMessage candidateDelete(String candidateId){
        
        ClsMessage message = this.candidateModel.candidateDelete(candidateId);
        
        return message;
        
    }
    
    // Método actualizar
    public ClsMessage CandidateUpdate(ClsCandidate candidateUpdate) {

        ClsMessage message = this.candidateModel.CandidateUpdate(candidateUpdate);

        return message;
    }
    
    
}
