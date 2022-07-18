package com.mycompany.eleccionesg8;

import Clases.ClsJdbc;

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
        jdbc.candidateConnectig();
        
    }
}
