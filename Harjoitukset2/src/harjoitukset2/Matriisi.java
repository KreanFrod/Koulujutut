package harjoitukset2;

/**
 *
 * @author Marika
 */
public class Matriisi {

    private int[][] matriisi;
    private int r, s; // rivien ja sarakkeiden lukumäärä  
    // --konstruktori--

    public Matriisi() {
        //Rakentaa r x s kokoisen matriisin, jonka arvot on nyt ennalta annettu. 
        //Nää vois jatkos kysyä käyttäjältäkin käyttämällä setRivi() ja setSarake()
        r = 5;
        s = 5;
        matriisi = new int[r][s];
    }

    // --aksessorit--
    // setterit
    public void setMatriisi(int[][] matriisi1) {
        this.matriisi = matriisi1;
    }
    public void setRivi(int r) {
        this.r = r;
    }
    public void setSarake(int s) {
        this.s = s;
    }

    // --aksessorit--
    // getterit
    //Luodaan yksikkömatriisi
    public void createMatriisi1() {
        for (int rivi = 0; rivi < matriisi.length; ++rivi) {
            for (int sarake = 0; sarake < matriisi[rivi].length; ++sarake) {
                if (rivi == sarake) {
                    matriisi[rivi][sarake] = 1;
                } else {
                    matriisi[rivi][sarake] = 0;
                }
            }
        }
    }
    //Luodaan summamatriisi
    public void createMatriisi2() {
        //apuriin kerätään kertyvä summa
        int apuri = 1;
        for (int rivi=0; rivi<matriisi.length; ++rivi) {
            for (int sarake=0; sarake<matriisi[rivi].length; ++sarake) {
                if ((rivi == 0) && (sarake == 0)) {
                    matriisi[rivi][sarake] = 1;   
                } 
                else {
                    matriisi[rivi][sarake] = apuri;
                    apuri = apuri + matriisi[rivi][sarake];
                }
            }
        }
    }
    // Tämä getteri tulostaa halutun matriisin
    public void printMatriisi() {

        System.out.println("\nMatriisi:");

        for (int rivi = 0; rivi < r; rivi++) {

            for (int sarake = 0; sarake < s; sarake++) {

                System.out.print("\t" + matriisi[rivi][sarake]);
            }
            System.out.println();
        }
    }
    //näillä saisi halutessaan ulos rivien ja sarakkeiden määrän.
    public int getRivi() {
        return r;
    }
    public int getSarake() {
        return s;
    }
}