/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harjoitukset2;

import harjoitukset2.Matriisi;
/**
 *
 * @author Marika
 */
public class Matriisilaskin {

    
// Tässä tarkistetaan, että annetut matriisit ovat saman suuruisia
//public boolean tarkistaMatriisit(int[][] eka, int[][] toka) {
//        if (eka.length != toka.length) {
//            System.out.println("Matriisit ovat erikokoiset! Laskua ei voi suorittaa");
//            tarkistus = false;
//        } else {
//            tarkistus = true;
//        }
//        return tarkistus;
//    }
// Tässä lasketaan kaksi matriisia yhteen

    public int[][] summaMatriisi(int[][] eka, int[][] toka) {
        if (eka.length != toka.length) {
            System.out.println("Matriisit ovat erikokoiset! Laskua ei voi suorittaa");
            } else {
            int a = eka.length;
            int b = toka.length;
            Matriisi tulos = new int[a][b];
            for (int x = 0; x < a; ++x) {
                for (int y = 0; y < tulos[x].length; ++y) {
                    tulos[x][y] = eka[x][y] + toka[x][y];
                }
            }
        }
    return tulos;
    }
}
