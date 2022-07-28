package Models;

import Clases.ClsJdbc;
import Clases.ClsMessage;
import Clases.ClsVoter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author danie
 */
public class MdlVoter {
    
    // Declarar conexión
    ClsJdbc voterJdbc;

    public MdlVoter() {
        
        // Definir objeto
        this.voterJdbc = new ClsJdbc();
        // Crear conexión
        this.voterJdbc.electionConnectig();
        
    }
    
    
    public ClsMessage voterAdd(ClsVoter voterObj) {

        ClsMessage message;

        try {

            String voterSQLAdd = "INSERT INTO tb_voters VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement voterSentence = this.voterJdbc.connectDBElectionsG8.prepareStatement(voterSQLAdd);
            
            voterSentence.setString(1, voterObj.getDocumentNumber());
            voterSentence.setString(2, voterObj.getName());
            voterSentence.setLong(3, voterObj.getPhone());
            voterSentence.setString(4, voterObj.getMail());
            voterSentence.setString(5, voterObj.getAddress());
            voterSentence.setString(6, voterObj.getType_document());

            int voterAddResult = voterSentence.executeUpdate();

            if (voterAddResult >= 1) {
                message = new ClsMessage(ClsMessage.OK, "Voter profile has been created");
            } else {
                message = new ClsMessage(ClsMessage.ERROR, "Voter profile has not been created");
            }

            return message;

        } catch (Exception e) {
            message = new ClsMessage(ClsMessage.WARNING, "Warning at voter: " + e.getMessage());
            return message;
        }

    }
    
    
    // 3 M - Método / Función generar consulta a DB y devolver resultado, modelo crea conexion
    public LinkedList<ClsVoter> GetJTb_voter() {

        // Aplicamos Try / Catch
        try {

            // 7 M - Preparar resultado, en este caso una lista / Inicializar
            LinkedList<ClsVoter> voterList = new LinkedList<>();

            // 4 M - Creamos consulta / Ejecutar consulta mediante String con SQL
            String voterQuery = "SELECT * FROM tb_voters";
            
            // 5 M - Usar método Java y preparar sentencia
            PreparedStatement voterSentence = this.voterJdbc.connectDBElectionsG8.prepareStatement(voterQuery);
            
            // 6 M - Preparar resultado de DB y ejecutar
            ResultSet voterResult = voterSentence.executeQuery();

            // 8 M - Introducir resultados de DB en lista / Usar 'for' o 'while' / while recorre las filas de la tabla
            while (voterResult.next()) {

                // 10 M - Recibir / Declarae variables
                String documentNumber = voterResult.getString("id_voter");
                String name = voterResult.getString("name");
                long phone = voterResult.getLong("phone");
                String mail = voterResult.getString("mail");
                String address = voterResult.getString("address");
                String type_document = voterResult.getString("type_document");

                // 9 M - Creamos objeto / 11 M - Enviar a constructor de votante
                ClsVoter voterModelResult = new ClsVoter(documentNumber, name, phone, mail, address, type_document);

                // 12 M - Creamos lista y agregamos votante
                voterList.add(voterModelResult);

            }

            return voterList;

        } catch (Exception e) {
            return null;
        }

    }
    
    // Eliminar
    public ClsMessage voterDelete(String voterId){
        
        ClsMessage message;

        try {

            String voterSQLDelete = "DELETE FROM tb_voters WHERE id_voter = ?";
            PreparedStatement voterSentence = this.voterJdbc.connectDBElectionsG8.prepareStatement(voterSQLDelete);
            voterSentence.setString(1, voterId);

            int voterDeleteResult = voterSentence.executeUpdate();

            if (voterDeleteResult >= 1) {
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
    
    
    public ClsMessage VoterUpdate(ClsVoter voterUpdate){
        
        ClsMessage message;
        
        try {
            String voterSQLUpdate = "UPDATE tb_voters SET name = ?," +
                    " phone = ?, mail = ?, address = ?, type_document = ?" +
                    " WHERE id_voter = ?";
            PreparedStatement voterSentenceUpdate = this.voterJdbc.connectDBElectionsG8.prepareStatement(voterSQLUpdate);
            
            voterSentenceUpdate.setString(1, voterUpdate.getName());
            voterSentenceUpdate.setLong(2, voterUpdate.getPhone());
            voterSentenceUpdate.setString(3, voterUpdate.getMail());
            voterSentenceUpdate.setString(4, voterUpdate.getAddress());
            voterSentenceUpdate.setString(5, voterUpdate.getType_document());
            voterSentenceUpdate.setString(6, voterUpdate.getDocumentNumber());
            
            
           
            int voterUpResult = voterSentenceUpdate.executeUpdate();

            if (voterUpResult >= 1) {

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
