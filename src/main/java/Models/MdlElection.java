package Models;

import Clases.ClsCandidate;
import Clases.ClsElection;
import Clases.ClsJdbc;
import Clases.ClsMessage;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author danie
 */
public class MdlElection {
    
    // Declarar conexión
    ClsJdbc electionJdbc;

    // Constructor
    public MdlElection() {

        // Definir objeto
        this.electionJdbc = new ClsJdbc();
        // Crear conexión
        this.electionJdbc.electionConnectig();

    }
    
    public ClsMessage electionAdd(ClsElection electionNew) {

        ClsMessage message;

        try {

            String candidateSQLAdd = "INSERT INTO tb_elections VALUES (?, ?, ?, ?, ?, NOW(), 'abierta')";
            PreparedStatement electionSentence = this.electionJdbc.connectDBElectionsG8.prepareStatement(candidateSQLAdd);
            
            electionSentence.setString(1, electionNew.getId_election());
            electionSentence.setString(2, electionNew.getDescription());
            electionSentence.setString(3, electionNew.getType());
            electionSentence.setString(4, electionNew.getDate_start());
            electionSentence.setString(5, electionNew.getDate_end());
            

            int electionAddResult = electionSentence.executeUpdate();

            if (electionAddResult >= 1) {
                message = new ClsMessage(ClsMessage.OK, "Election has been created");
            } else {
                message = new ClsMessage(ClsMessage.ERROR, "Election has not been created");
            }

            return message;

        } catch (Exception e) {
            message = new ClsMessage(ClsMessage.WARNING, "Warning at Election: " + e.getMessage());
            return message;
        }

    }
    
    
    public ClsMessage candidateAssociate(String id_candidate, String id_election) {

        ClsMessage message;

        try {
            String candidateSQLAssociate = "INSERT INTO tb_election_per_candidate VALUES (?, ?, TIMESTAMP())";
            PreparedStatement candidateAssociateSentence = this.electionJdbc.connectDBElectionsG8.prepareStatement(candidateSQLAssociate);
            candidateAssociateSentence.setString(1, id_candidate);
            candidateAssociateSentence.setString(2, id_election);

            int candidateAssociateResult = candidateAssociateSentence.executeUpdate();

            if (candidateAssociateResult >= 1) {

                message = new ClsMessage(ClsMessage.OK, "Se ha asociado un candidato");
                return message;
            }

            message = new ClsMessage(ClsMessage.ERROR, "No se asoció");
            return message;

        } catch (Exception e) {

            message = new ClsMessage(ClsMessage.ERROR, "Error en ejecución: " + e.getMessage());
            return message;
        }

    }
    
    
    public LinkedList<ClsCandidate> candidatesGetPerElection(String id_election) {

        try {

            LinkedList<ClsCandidate> candidateElectionList = new LinkedList<>();

            String candidateElectionSQL = "SELECT tc.* FROM tb_election_per_candidate te,"
                    + " tb_candidates tc WHERE te.id_election = ? "
                    + "AND te.id_candidate = tc.id_candidate";
            PreparedStatement candidatesElectionSentence = this.electionJdbc.connectDBElectionsG8.prepareStatement(candidateElectionSQL);
            candidatesElectionSentence.setString(1, id_election);
            ResultSet candidatesElectionResult = candidatesElectionSentence.executeQuery();

            while (candidatesElectionResult.next()) {

                String documentNumber = candidatesElectionResult.getString("id_candidate");
                String name = candidatesElectionResult.getString("name");
                long phone = candidatesElectionResult.getLong("phone");
                String mail = candidatesElectionResult.getString("mail");
                String party = candidatesElectionResult.getString("party");
                String hometown = candidatesElectionResult.getString("hometown");
                String description = candidatesElectionResult.getString("description");
                String campaign_message = candidatesElectionResult.getString("campaign_message");
                String proposals = candidatesElectionResult.getString("proposals");

                // 9 M - Creamos objeto / 11 M - Enviar a constructor de candidato
                ClsCandidate candidateModelResult = new ClsCandidate(documentNumber, name, phone, mail, party, hometown, description, campaign_message, proposals);

                // 12 M - Creamos lista y agregamos candidato
                candidateElectionList.add(candidateModelResult);
            }

            return candidateElectionList;

        } catch (Exception e) {

            return null;
        }

    }
    
    
    // 3 M - Método / Función generar consulta a DB y devolver resultado, modelo crea conexion
    public LinkedList<ClsElection> GetJTb_election() {

        // Aplicamos Try / Catch
        try {

            // 7 M - Preparar resultado, en este caso una lista / Inicializar
            LinkedList<ClsElection> electionList = new LinkedList<>();

            // 4 M - Creamos consulta / Ejecutar consulta mediante String con SQL
            String electionQuery = "SELECT * FROM tb_elections";
            
            // 5 M - Usar método Java y preparar sentencia
            PreparedStatement electionSentence = this.electionJdbc.connectDBElectionsG8.prepareStatement(electionQuery);
            
            // 6 M - Preparar resultado de DB y ejecutar
             ResultSet electionResult = electionSentence.executeQuery();

            // 8 M - Introducir resultados de DB en lista / Usar 'for' o 'while' / while recorre las filas de la tabla
            while (electionResult.next()) {

                // 10 M - Recibir / Declarae variables
                String id_election = electionResult.getString("id_election");
                String description = electionResult.getString("description");
                String type = electionResult.getString("type");
                String date_start = electionResult.getString("date_start");
                String date_end = electionResult.getString("date_end");
                String date_inscription = electionResult.getString("date_inscription");
                String state = electionResult.getString("state");

                // 9 M - Creamos objeto / 11 M - Enviar a constructor de candidato
                ClsElection electionModelResult = new ClsElection(id_election, description, type, date_start, date_end, date_inscription, state);

                // 12 M - Creamos lista y agregamos candidato
                electionList.add(electionModelResult);

            }

            return electionList;

        } catch (Exception e) {
            return null;
        }

    }
    
    
    
}
