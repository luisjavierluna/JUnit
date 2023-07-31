/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EE_2;

/**
 *
 * @author javie
 */
public class PalindromeChecker {
    public boolean revisarPalindromo(String palindromo) {
        String palindromoInverso = 
                new StringBuilder(palindromo.toLowerCase())
                .reverse().toString().toLowerCase();
        
        return palindromo.equals(palindromoInverso);
    }
}
