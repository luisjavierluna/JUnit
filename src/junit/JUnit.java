/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import junit.EE_3.SecurePasswordGenerator;

/**
 *
 * @author javie
 */
public class JUnit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SecurePasswordGenerator generador = new SecurePasswordGenerator();
        
        generador.generarPassword();
        
//        for (int i = 0; i < 10; i++) {
//            generador.generarPassword();
//        }
    }
    
}
