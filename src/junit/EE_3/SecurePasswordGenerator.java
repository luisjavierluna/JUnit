/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EE_3;

/**
 *
 * @author javie
 */
public class SecurePasswordGenerator {
    public String generarPassword() {
        String alphaNumericStr = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz0123456789";
        String password = "";
        int index;
        char caracter;
        
        do {
            index = (int) (Math.random() * alphaNumericStr.length());
            caracter = alphaNumericStr.charAt(index);
            
            password += caracter;
        } while (password.length() < 10);
        
        System.out.println(password);
        System.out.println("");
        
        index = (int) (Math.random() * password.length());
        
        password = password.substring(0, index) + '$' + password.substring(index + 1);
        
        System.out.println(password);
        System.out.println("");
     
        return password;
    }
}
