package centrale;
import java.util.ArrayList;
import java.util.List;

/** Stelt een verkeerlichtencentrale voor van de simulatie */
public class VerkeerslichtenCentrale {

    //Corrigeer de code denkende aan static, final, access modifiers (public, private, ...), information hiding en SRP
    // Er is ook 1 lijn overbodige code (met verkeerde resultaten tot gevolg)
    // en 1 logische fout

    //** Bepaald of de centrale actief is.*/
    private boolean isActive = false;
    final private int aantalLichten = 3;
    /**
     * Welke verkeerslichten zijn aan? De lichten zijn strikt oplopend genummerd.
     */
    private final List<Boolean> verkeerslichtenActief = new ArrayList<Boolean>(aantalLichten);

    // De code van deze class voldoet aan de centralestandaard versie 1.2a
    static final private String versie = "1.2a";

    /** aan welke centralestandaard deze class voldoet
     * @return versienummer
     */
    static public String getCentraleVersie() {
        return versie;
    }

    public VerkeerslichtenCentrale() {
        initialize();
        isActive = true;
    }

    /**
     * Maakt de verkeerslichten aan
     */
    private void initialize() {
        for (int i = aantalLichten; i > 0; i--) {
            verkeerslichtenActief.add(true);
        }
    }

    /**
     * Schakel een verkeerslicht uit
     * @param lichtnr volgnr van het uit te schakelen licht
     */
    public void schakelLichtUit(final int lichtnr) {
        int lichtnrUitTeSchakelen = lichtnr - 1;
        if (lichtnrUitTeSchakelen >= verkeerslichtenActief.size()) lichtnrUitTeSchakelen = verkeerslichtenActief.size()-1; //logische fout
        if (isActive) verkeerslichtenActief.set(lichtnrUitTeSchakelen, Boolean.FALSE);
    }

    /**
     * Is dit licht actief?
     * @param lichtNr te controleren licht
     * @return actief of niet
     */
    public boolean isVerkeerslichtActief(final int lichtNr) {
        return verkeerslichtenActief.get(lichtNr>=aantalLichten?aantalLichten-1:lichtNr-1);
    }

    /** Het aantal lichten beheert door de centrale
     * @return aantal
     */
    public int getAantalLichten() {
        return aantalLichten;
    }
}

