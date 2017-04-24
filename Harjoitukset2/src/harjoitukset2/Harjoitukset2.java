/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Harjoitukset2;

import harjoitukset2.Matriisi;
import harjoitukset2.Matriisilaskin;

/**
 *
 * @author Marika
 */
public class Harjoitukset2 {
//Luodaan matriisioliot ja kutsutaan matriisin muodostus ja tulostus toimintoja
    public static void main(String[] args) {
    Matriisi eka = new Matriisi();
    eka.createMatriisi1();
    eka.printMatriisi();
    
    Matriisi toka = new Matriisi();
    toka.createMatriisi2();
    toka.printMatriisi();
    }   
    
    }


