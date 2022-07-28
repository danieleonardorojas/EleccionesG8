package com.mycompany.eleccionesg8;

import Clases.ClsJdbc;
import Views.MainView;

/**
 *
 * @author danie
 */
public class EleccionesG8 {

    public static void main(String[] args) {
        
        /**
         * Establecemos conexión con la clase JDBC
         * A continuación, crear objeto y llamar método que conecta con DB
         */
                
        // Creamos objeto
        ClsJdbc jdbc = new ClsJdbc();
        
        // Llamamos método
        jdbc.electionConnectig();
        
        MainView menuLocation = new MainView();
        menuLocation.setLocationRelativeTo(null);
        menuLocation.setVisible(true);
    }
}
