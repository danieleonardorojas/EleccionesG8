package Views;

import Clases.ClsCandidate;
import Clases.ClsElection;
import Clases.ClsMessage;
import Controllers.CtlCandidate;
import Controllers.CtlElection;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danie
 */
public class ElectionsView extends javax.swing.JFrame {
    
    // Declarar variable / Crear un objeto
    JFrame ObjMainMenu;
    
    CtlElection electionControler;
    
    CtlCandidate candidateControlerElection;
    // Manipular
    LinkedList<ClsElection> electionGetList;
    
    LinkedList<ClsCandidate> candidateGetList;
    
    

    /**
     * Creates new form ElectionsView
     */
    public ElectionsView(JFrame mainMenu) {
        initComponents();
        
        this.ObjMainMenu = mainMenu;
        
        this.electionControler = new CtlElection();
        
        this.candidateControlerElection = new CtlCandidate();
        
        this.electionGetList = new LinkedList<>();
        
        this.candidateGetList = new LinkedList<>();
        
        this.GetJTb_election();
        
        this.GetJTb_candidate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoDescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        campoFechaInicio = new com.toedter.calendar.JDateChooser();
        campoFechaFinal = new com.toedter.calendar.JDateChooser();
        campoFechaInscipcion = new com.toedter.calendar.JDateChooser();
        jButtonElectionsAdd = new javax.swing.JButton();
        jButtonElectionsUpdate = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ElectionsTable = new javax.swing.JTable();
        jButtonElectionsEdit = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        comboCandidato = new javax.swing.JComboBox<>();
        jButtonElectionsAssociate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        CandidatesTableElection = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jButtonDeleteAssociate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Gestor Elecciones G8");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Espacio para crear una elección");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Descripcion:");

        jLabel6.setText("Tipo:");

        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Presidencial", "Municipal" }));

        jLabel7.setText("Inicio:");

        jLabel8.setText("Final:");

        jLabel9.setText("Inscripción:");

        jButtonElectionsAdd.setBackground(new java.awt.Color(204, 204, 204));
        jButtonElectionsAdd.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonElectionsAdd.setForeground(new java.awt.Color(51, 51, 51));
        jButtonElectionsAdd.setText("Agregar");
        jButtonElectionsAdd.setBorderPainted(false);
        jButtonElectionsAdd.setFocusPainted(false);
        jButtonElectionsAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonElectionsAddActionPerformed(evt);
            }
        });

        jButtonElectionsUpdate.setBackground(new java.awt.Color(204, 204, 204));
        jButtonElectionsUpdate.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonElectionsUpdate.setForeground(new java.awt.Color(51, 51, 51));
        jButtonElectionsUpdate.setText("Actualizar");
        jButtonElectionsUpdate.setBorderPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(campoDescripcion)
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(campoFechaInscipcion, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonElectionsUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonElectionsAdd)
                        .addGap(29, 29, 29))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoFechaInscipcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(8, 8, 8)
                            .addComponent(campoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(8, 8, 8)
                            .addComponent(campoFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonElectionsUpdate)
                    .addComponent(jButtonElectionsAdd))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Versión 1.0");

        jButtonBack.setBackground(new java.awt.Color(255, 204, 0));
        jButtonBack.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonBack.setForeground(new java.awt.Color(102, 51, 0));
        jButtonBack.setText("Regresar");
        jButtonBack.setBorderPainted(false);
        jButtonBack.setFocusPainted(false);
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        ElectionsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificador", "Nombre", "Descripción", "Tipo", "Inicio", "Fin", "Inscripción", "Estado", "Ganador"
            }
        ));
        jScrollPane1.setViewportView(ElectionsTable);

        jButtonElectionsEdit.setBackground(new java.awt.Color(204, 204, 204));
        jButtonElectionsEdit.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonElectionsEdit.setForeground(new java.awt.Color(51, 51, 51));
        jButtonElectionsEdit.setText("Editar");
        jButtonElectionsEdit.setBorderPainted(false);
        jButtonElectionsEdit.setContentAreaFilled(false);
        jButtonElectionsEdit.setFocusPainted(false);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setText("Candidato:");

        comboCandidato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonElectionsAssociate.setBackground(new java.awt.Color(204, 204, 204));
        jButtonElectionsAssociate.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonElectionsAssociate.setForeground(new java.awt.Color(51, 51, 51));
        jButtonElectionsAssociate.setText("Asociar");
        jButtonElectionsAssociate.setBorderPainted(false);
        jButtonElectionsAssociate.setFocusPainted(false);
        jButtonElectionsAssociate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonElectionsAssociateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(comboCandidato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 86, Short.MAX_VALUE)
                        .addComponent(jButtonElectionsAssociate)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboCandidato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonElectionsAssociate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CandidatesTableElection.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Identificador", "Candidato"
            }
        ));
        jScrollPane2.setViewportView(CandidatesTableElection);

        jLabel11.setText("Candidatos:");

        jButtonDeleteAssociate.setBackground(new java.awt.Color(204, 204, 204));
        jButtonDeleteAssociate.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButtonDeleteAssociate.setForeground(new java.awt.Color(51, 51, 51));
        jButtonDeleteAssociate.setText("Eliminar");
        jButtonDeleteAssociate.setBorderPainted(false);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Eliminar");
        jButton1.setBorderPainted(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonElectionsEdit)
                            .addComponent(jButton1)
                            .addComponent(jButtonDeleteAssociate))))
                .addGap(34, 34, 34)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonElectionsEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDeleteAssociate))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButtonBack)
                        .addGap(31, 31, 31)))
                .addGap(43, 43, 43))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBack)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(236, 236, 236))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        this.ObjMainMenu.setVisible(true);
    }//GEN-LAST:event_jButtonBackActionPerformed

    private void GetJTb_candidate(){
        
        this.candidateGetList = this.candidateControlerElection.GetJTb_candidate();
        this.UpdateCombo_electionCandidate(candidateGetList);
        
    }
    
    private void UpdateCombo_electionCandidate(LinkedList<ClsCandidate> candidateList){
        
        //LinkedList<ClsCandidate> electionCandidates = this.candidateControlerElection.UpdateCombo_election();

        DefaultComboBoxModel electionModel = (DefaultComboBoxModel) this.comboCandidato.getModel();
        electionModel.removeAllElements();

        for (ClsCandidate electionCandidate : candidateList) {
            electionModel.addElement(electionCandidate.getName()+ "-" + electionCandidate.getDocumentNumber());
        }

        // setting model with new data
        this.comboCandidato.setModel(electionModel);
        
    }
    
    private void GetJTb_election(){
        
        this.electionGetList = this.electionControler.GetJTb_election();
        this.UpdateJtb_election(electionGetList);
        
    }
    
    
    // Método / Función actualizar tabla
    private void UpdateJtb_election(LinkedList<ClsElection> updateElections){
        
        // Importamos para llenar tabla
        DefaultTableModel electionModel = (DefaultTableModel) this.ElectionsTable.getModel();
        electionModel.setRowCount(0);
        
        for (ClsElection updateElection : updateElections) {
            
            Object[] electionRow = {updateElection.getId_election(), 
                updateElection.getDescription(), updateElection.getType(), 
                updateElection.getDate_start(), updateElection.getDate_end(), 
                updateElection.getDate_inscription(), updateElection.getState()};
            
            electionModel.addRow(electionRow);
            
            
        }
         
    }
    
    private void jButtonElectionsAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonElectionsAddActionPerformed
        // BUTTON: ADD
        
        String name = this.campoNombre.getText();
        String description = this.campoDescripcion.getText();
        String type = this.comboTipo.getSelectedItem().toString();
        
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        
        String date_start = format.format(this.campoFechaInicio.getDate());
        String date_end = format.format(this.campoFechaFinal.getDate());
        
        String[] arrayDate = date_start.split("-", 2);
        
        String id_election = arrayDate[0] + "-" + type;
        
        
        ClsElection electionNew = new ClsElection(id_election, description, type, date_start, date_end, description, type);
        
        ClsMessage message = this.electionControler.electionAdd(electionNew);
        
    }//GEN-LAST:event_jButtonElectionsAddActionPerformed

    private void jButtonElectionsAssociateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonElectionsAssociateActionPerformed
        // BUTTON: ELECTIONS ASSOCIATE
        int electionColumn = 0;
        int electionRow = this.ElectionsTable.getSelectedRow();
        String id_election = this.ElectionsTable.getValueAt(electionRow, electionColumn).toString();
        
        String[] divisionCombo = this.comboCandidato.getSelectedItem().toString().split("-");
         
        String id_candidate = divisionCombo[1];
        
        ClsMessage message = this.electionControler.candidateAssociate(id_candidate, id_election);

        if (message.getType().equals(ClsMessage.OK)) {

            this.candidatesGetPerElection(id_election);
        }
    }//GEN-LAST:event_jButtonElectionsAssociateActionPerformed

    private void candidatesGetPerElection(String id_election){
        
        LinkedList<ClsCandidate> electionCandidates = this.electionControler.candidatesGetPerElection(id_election);
        this.candidatesTableUpdate(electionCandidates);
        
    }
    
    private void candidatesTableUpdate(LinkedList<ClsCandidate> candidateElectionList) {
        DefaultTableModel electionModel = (DefaultTableModel) this.CandidatesTableElection.getModel();
        electionModel.setRowCount(0);

        for (ClsCandidate candidateElection : candidateElectionList) {

            Object[] electionRow = {
                candidateElection.getDocumentNumber(),
                candidateElection.getName()
            };

            electionModel.addRow(electionRow);

        }

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ElectionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElectionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElectionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElectionsView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElectionsView(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable CandidatesTableElection;
    private javax.swing.JTable ElectionsTable;
    private javax.swing.JTextField campoDescripcion;
    private com.toedter.calendar.JDateChooser campoFechaFinal;
    private com.toedter.calendar.JDateChooser campoFechaInicio;
    private com.toedter.calendar.JDateChooser campoFechaInscipcion;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JComboBox<String> comboCandidato;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JButton jButtonDeleteAssociate;
    private javax.swing.JButton jButtonElectionsAdd;
    private javax.swing.JButton jButtonElectionsAssociate;
    private javax.swing.JButton jButtonElectionsEdit;
    private javax.swing.JButton jButtonElectionsUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
