package Models;

import Clases.ClsCandidate;
import Clases.ClsJdbc;
import Clases.ClsMessage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author danie
 */
public class MdlCandidate {

    // Declarar conexión
    ClsJdbc candidateJdbc;

    // Constructor
    public MdlCandidate() {

        // Definir objeto
        this.candidateJdbc = new ClsJdbc();
        // Crear conexión
        this.candidateJdbc.candidateConnectig();

    }

    // 3 M - Método / Función generar consulta a DB y devolver resultado, modelo crea conexion
    public LinkedList<ClsCandidate> GetJTb_candidate() {

        // Aplicamos Try / Catch
        try {

            // 7 M - Preparar resultado, en este caso una lista / Inicializar
            LinkedList<ClsCandidate> candidateList = new LinkedList<>();

            // 4 M - Creamos consulta / Ejecutar consulta mediante String con SQL
            String candidateQuery = "SELECT * FROM tb_candidates";
            
            // 5 M - Usar método Java y preparar sentencia
            PreparedStatement candidateSentence = this.candidateJdbc.connectDBElectionsG8.prepareStatement(candidateQuery);
            
            // 6 M - Preparar resultado de DB y ejecutar
            ResultSet candidateResult = candidateSentence.executeQuery();

            // 8 M - Introducir resultados de DB en lista / Usar 'for' o 'while' / while recorre las filas de la tabla
            while (candidateResult.next()) {

                // 10 M - Recibir / Declarae variables
                String documentNumber = candidateResult.getString("id_candidate");
                String name = candidateResult.getString("name");
                long phone = candidateResult.getLong("phone");
                String mail = candidateResult.getString("mail");
                String party = candidateResult.getString("party");
                String hometown = candidateResult.getString("hometown");
                String description = candidateResult.getString("description");
                String campaign_message = candidateResult.getString("campaign_message");
                String proposals = candidateResult.getString("proposals");

                // 9 M - Creamos objeto / 11 M - Enviar a constructor de candidato
                ClsCandidate candidateModelResult = new ClsCandidate(documentNumber, name, phone, mail, party, hometown, description, campaign_message, proposals);

                // 12 M - Creamos lista y agregamos candidato
                candidateList.add(candidateModelResult);

            }

            return candidateList;

        } catch (Exception e) {
            return null;
        }

    }

    public ClsMessage candidateAdd(ClsCandidate candidateObj) {

        ClsMessage message;

        try {

            String candidateSQLAdd = "INSERT INTO tb_candidates VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement candidateSentence = this.candidateJdbc.connectDBElectionsG8.prepareStatement(candidateSQLAdd);
            candidateSentence.setString(1, candidateObj.getDocumentNumber());
            candidateSentence.setString(2, candidateObj.getName());
            candidateSentence.setLong(3, candidateObj.getPhone());
            candidateSentence.setString(4, candidateObj.getMail());
            candidateSentence.setString(5, candidateObj.getParty());
            candidateSentence.setString(6, candidateObj.getHometown());
            candidateSentence.setString(7, candidateObj.getDescription());
            candidateSentence.setString(8, candidateObj.getCampaign_message());
            candidateSentence.setString(9, candidateObj.getProposals());

            int candidateAddResult = candidateSentence.executeUpdate();

            if (candidateAddResult >= 1) {
                message = new ClsMessage(ClsMessage.OK, "Profile has been created");
            } else {
                message = new ClsMessage(ClsMessage.ERROR, "Profile has not been created");
            }

            return message;

        } catch (Exception e) {
            message = new ClsMessage(ClsMessage.WARNING, "Warning: " + e.getMessage());
            return message;
        }

    }
    
    
    public ClsMessage candidateDelete(String candidateId){
        
        ClsMessage message;

        try {

            String candidateSQLDelete = "DELETE FROM tb_candidates WHERE id_candidate = ?";
            PreparedStatement candidateSentence = this.candidateJdbc.connectDBElectionsG8.prepareStatement(candidateSQLDelete);
            candidateSentence.setString(1, candidateId);

            int candidateDeleteResult = candidateSentence.executeUpdate();

            if (candidateDeleteResult >= 1) {
                message = new ClsMessage(ClsMessage.OK, "Profile has been deleted");
            } else {
                message = new ClsMessage(ClsMessage.ERROR, "Profile has not been deleted");
            }

            return message;

        } catch (Exception e) {
            message = new ClsMessage(ClsMessage.WARNING, "Warning: " + e.getMessage());
            return message;
        }
        
    }
    
    public ClsMessage CandidateUpdate(ClsCandidate candidateUpdate){
        
        ClsMessage message;
        
        try {
            String candidateSQLUpdate = "UPDATE tb_candidates SET name = ?," +
                    " phone = ?, mail = ?, party = ?, hometown = ?," +
                    " description = ?, campaign_message = ?," +
                    " proposals = ? WHERE id_candidate = ?";
            PreparedStatement candidateSentenceUpdate = this.candidateJdbc.connectDBElectionsG8.prepareStatement(candidateSQLUpdate);
            
            candidateSentenceUpdate.setString(1, candidateUpdate.getName());
            candidateSentenceUpdate.setLong(2, candidateUpdate.getPhone());
            candidateSentenceUpdate.setString(3, candidateUpdate.getMail());
            candidateSentenceUpdate.setString(4, candidateUpdate.getParty());
            candidateSentenceUpdate.setString(5, candidateUpdate.getHometown());
            candidateSentenceUpdate.setString(6, candidateUpdate.getDescription());
            candidateSentenceUpdate.setString(7, candidateUpdate.getCampaign_message());
            candidateSentenceUpdate.setString(8, candidateUpdate.getProposals());
            candidateSentenceUpdate.setString(9, candidateUpdate.getDocumentNumber());
            
            
           
            int candidateUpResult = candidateSentenceUpdate.executeUpdate();

            if (candidateUpResult >= 1) {

                message = new ClsMessage(ClsMessage.OK, "Profile has been updated");
                return message;
            }

            message = new ClsMessage(ClsMessage.ERROR, "Profile has not been updated");
            return message;

        } catch (Exception e) {

            message = new ClsMessage(ClsMessage.ERROR, "Warning: " + e.getMessage());
            return message;
        }

        
        
    }

}
