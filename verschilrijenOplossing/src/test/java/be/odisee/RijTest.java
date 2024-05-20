package be.odisee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RijTest {
    //Geen test nodig voor req01


    @Test    // Req02
    void givenNulRij_isNul_ReturnsTrue(){
        // Arrange given a Rij that is a nulrij
        Rij rij = new Rij(0, 0, 0);
        //ACT isNul
        boolean res=rij.isNul();
        //Assert returns true
        assertTrue(res,"Dit is wel een nulrij");
    }
    @Test    // Req02
    void givenRij001_isNul_ReturnsFalse(){
        // Arrange given a Rij that is a nulrij
        Rij rij = new Rij(0, 0, 1);
        //ACT isNul
        boolean res=rij.isNul();
        //Assert returns False
        assertFalse(res,"Dit is geen nulrij");
    }
    @Test    // Req03
    void givenNulRij4_isNul_ReturnsTrue(){
        // Arrange given a 4 element Rij that is a nulrij
        Rij rij = new Rij(0, 0, 0,0);
        //ACT isNul
        boolean res=rij.isNul();
        //Assert returns true
        assertTrue(res,"Dit is geen nulrij");
    }
    @Test    // Req02
    void givenRij0001_isNul_ReturnsFalse(){
        // Arrange given a Rij that is a nulrij
        Rij rij = new Rij(0, 0,0, 1);
        //ACT isNul
        boolean res=rij.isNul();
        //Assert returns False
        assertFalse(res,"Dit is geen nulrij");
    }

    @Test   //Req04
    void givenVerschilRij3210_toString_returns3210() {
        // Arrange given a 4 element Rij
        Rij rij = new Rij(3,2,1,0);
        //ACT toString
        String res=rij.toString();
        //Assert returns true
        assertEquals("{3,2,1,0}",res);
    }

    @Test //  req05
    void givenVerschilRij_berekenKindRij_returnsKindrij() {
        //Arrange maak verschilrij 3210
        Rij rij = new Rij(5,3,7);
        Rij rij2 = new Rij(2,7,8,1);
        //Act Bereken kindrijen
        Rij kind=rij.berekenKindRij();
        Rij kind2=rij2.berekenKindRij();
        //Assert correcte kindrij?
        assertEquals("{2,2,4}",kind.toString() );
        assertEquals("{1,5,1,7}",kind2.toString());
        //ook mogelijk: getters maken welke 1 element teruggeeft en 4 testen, vb  assertEquals(3,kind.getElement(0),"element 0 is niet correct!")
        //nog beter: implementeer boolean Rij.equals(Rij) -> assertTrue(kind.equals(new Rij(5,3,7)));
    }

    

}