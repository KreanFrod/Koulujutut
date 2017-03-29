/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohjelmointi;

import java.time.*;

/**
 *
 * @author Marika
 */
public class Tervehdys {

    public static void main(String[] args) {
        // Kerrotaan että mitä kello on nyt (time) ja koska aamupäivä taittuu iltapäiväksi (noon)
        LocalTime time = LocalTime.now();
        LocalTime noon = LocalTime.parse("12:00:00");
        
        // If-lause kertoo, että miten tervehditään aamupäivällä ja muuten sitten iltapäivällä. 
        if (time.isBefore(noon)) {
            System.out.print("Hyvää aamupäivää!");
        } else {
            System.out.print("Hyvää iltapäivää!");
        }
    }
};
