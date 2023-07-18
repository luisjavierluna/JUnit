/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EP_3;

/**
 *
 * @author javie
 */
public class PasswordValidator {
    public boolean verificarPassword(String password) {
        boolean esValida = true;
        int contadorMayusculas = 0;

        // Longitud mínima de 6
        if (password.length() < 6 ) {
            System.out.println("La contraseña debe tener por lo menos 6 caracteres");
            esValida = false;
        }
        
        // Caracteres especiales (incluir un #)
        if (!password.contains("#")) {
            System.out.println("La contraseña debe tener obligatoriamente el caracter << # >>");
            esValida = false;
        }
        
        // Letras Mayúsculas ( más de 1)
        
        for (int i = 0; i < password.length(); i++) {
            String caracter = "" + password.charAt(i);
            
            if (caracter.equals(caracter.toUpperCase())) {
                contadorMayusculas++;
            }
        }
        
        if (contadorMayusculas < 2) {
            System.out.println("La contraseña debe tener por lo menos 2 letras mayúsculas");
            esValida = false;
        }
        
        return esValida;
    }
}
