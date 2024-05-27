package be.odisee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RijboomTest {

    @Test // Req11
    void givenBoomMet1Rij_diepte_Returns1() {
        //Assert Een boom met 1 rij
        Rijboom b=new Rijboom(new Rij(1,2,3));
        // Act
        int res = b.diepte();
        //Assert diepte is 1
        assertEquals(1,res);
    }

    @Test //Req12
    void givenBoomMet1Rij_getRij1_returns1steRij() {
        //Assert Een boom met 1 rij
        Rij r=new Rij(1,2,3);
        Rijboom b=new Rijboom(r);
        // Act
        Rij res = b.getRij(0);
        //Assert
        assertEquals(r.toString(),res.toString(),"Niet dezelfde rij");
    }

    @Test // Req13
    void givenBoom402_bereken2Kinderen_ResultsIn242And022() {
        //Assert Een boom met 1 rij
        Rijboom b=new Rijboom(new Rij(4,0,2));
        // Act
        b.berekenKinderen(2);
        //Assert
        assertEquals(3,b.diepte());
        assertEquals("{2,4,2}",b.getRij(1).toString());
        assertEquals("{0,2,2}",b.getRij(2).toString());
    }

    @Test // Req11
    void givenBoomMet3Rijen_diepte_Returns3() {
        //Assert Een boom met 3 rijen
        Rijboom b=new Rijboom(new Rij(1,2,3));
        b.berekenKinderen(2);
        // Act
        int res = b.diepte();
        //Assert diepte is 3
        assertEquals(3,res);
    }

    @Test //Req 14
    void givenBoom4444_bereken2Kinderen_ResultsInBoomDiepte2() {
        Rijboom b=new Rijboom(new Rij(4,4,4,4));
        b.berekenKinderen(2);
        int res = b.diepte();
        assertEquals(2,res);
        assertEquals("{0,0,0,0}",b.getRij(1).toString());
    }


}