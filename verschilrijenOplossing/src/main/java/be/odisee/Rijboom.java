package be.odisee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Stelt een verschilrijboom voor die de opeenvolging van de verschilrijen bewaard. Elke rij is de kindverschilrij van de vorige rij. */
public class Rijboom {
    private List<Rij> boom;

    public Rijboom(Rij startrij) {
        this.boom = new ArrayList<>(Arrays.asList(startrij));
    }

    /**  Req11
     * Berekent de diepte van de verschilboom, dat is het aantal gekende verschilrijen
     * @return de diepte van de rijboom
     */
    public int diepte() {
        return boom.size();
    }

    /** req 12
     *  @param index volgnr van de op te vragen rij. startij = 0, kind van startrij = 1 ,...
     *  @return verschilrij
     */
    public Rij getRij(int index) {
        return boom.get(index);
    }

    /**
     * Berekent i kinderen van de laatste rij in de boom
     * @param i aantal te berkenen kinderen
     */
    public void berekenKinderen(int i) {
        for (int j = 0; j < i; j++) {
            if(boom.getLast().isNul()) return;  // implementatie na givenBoom4444_bereken2Kinderen_ResultsInBoomDiepte2
            boom.add(boom.getLast().berekenKindRij()); //implementatie na givenBoom4042_bereken2Kinderen_ResultsIn2442And0202
        }
    }
}
