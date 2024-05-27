package be.odisee;

/** Stelt een verschilrij voor
 */
public class Rij {
    /** Req01 */
    private final int element0;
    private final int element1;
    private final int element2;
    private final int element3; // REq03

    private final int aantalElementen; // req03
    // Of, veel beter, je maakt een array of een list van ints welke de elementen opslaagd

    Rij(int... args) {
        aantalElementen = args.length; // req03
        element0 = args[0];
        element1 = args[1];
        element2 = args[2];
        if(aantalElementen>3) element3 = args[3];// req03
        else element3 = 0;
    }

    /** Test of alle elementen 0 zijn
     * @return true als alle elementen 0 zijn
     */
    boolean isNul() {
        //return element0 == 0; //implementatie na test GivenNulRij_nulRij_ReturnsTrue
        //return element0 == 0 && element1 == 0 && element2 == 0;  //implementatie na test GivenRij001_nulRij_ReturnsFalse
        return element0 == 0 && element1 == 0 && element2 == 0 && element3==0;  //implementatie na test GivenNulRij4_isNul_ReturnsTrue


    }

    /** Stelt de getallen voor als een string
     * @return de getallen op volgorde omgeven door {} gescheiden door een komma
     */
    @Override
    public String toString() {
        String str= "{" +
                element0 + ","
                + element1 + ","
                + element2;
        if(aantalElementen>3)  str+= "," + element3;
        return str+'}';
    }


    /** Test of van 2 Rijen elk overeenkomstig element identiek is.
     * implementation bij req04 na givenVerschilRij3210_berekenKindRij_returns3111 */
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rij rij = (Rij) o;
        return aantalElementen==rij.aantalElementen && element0 == rij.element0 && element1 == rij.element1 && element2 == rij.element2 && element3 == rij.element3;
    }*/

    /** Berekent het kind van de verschilrij.
     * @link README.md
     * @returns Rij de kindrij
     */
    public Rij berekenKindRij() {
        if (aantalElementen==3) return new Rij(Math.abs(element0-element2),Math.abs(element1-element0), Math.abs(element2-element1));
        else return new Rij(Math.abs(element0-element3),Math.abs(element1-element0), Math.abs(element2-element1), Math.abs(element3-element2));
    }
}
