/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ohjelmointi;
import java.util.Scanner;

/**
 * Java skanneri ohjelma made by Marika
 */
public class Ohjelmointi
{

  public static void main (String[] args)
  {
    // tehdään skanneri
    Scanner scanner = new Scanner(System.in);

    System.out.print("Mikä on nimesi: ");

    // tallennetaan syöte string-muuttujaan
    String username = scanner.next();

    System.out.print("Anna ikäsi: "); 

    // tallennetaan syöte int-muuttujaan
    int age = scanner.nextInt();

    // tulostetaan teksti
    System.out.println(String.format("Tervetuloa %s, olet %d-vuotias", username, age));

  }

}