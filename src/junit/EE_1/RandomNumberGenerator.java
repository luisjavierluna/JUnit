/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit.EE_1;

/**
 *
 * @author javie
 */
public class RandomNumberGenerator {
    
    
    public int generarNumero(int min, int max) {
        int randomNum = (int) (Math.random() * (max - min + 1)) + min;

        return randomNum;
    }
}
