/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitukset2;

/**
 *
 * @author Marika
 */
public class Matriisilaskin {
boolean tarkistus = true;
    public int[][] tarkistaMatriisit(int[][] ekamatriisi, int[][] tokamatriisi) {
        if (ekamatriisi.length != tokamatriisi.length) {
            System.out.println("Matriisit ovat erikokoiset! Laskua ei voi suorittaa");
            tarkistus = false;
        } else {
            tarkistus = true;
        }
    }
}
