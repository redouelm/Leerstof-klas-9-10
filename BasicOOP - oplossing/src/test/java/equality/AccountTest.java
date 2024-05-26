package equality;

import equality.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    /** De operator== kan testen of 2 objecten hetzelfde object zijn  */
    @Test
    void operatorGelijkheid_zelfdeObjecten_areEqual() {
        //Arrange
        Account a = new Account(35,"Dragon");
        Account b = a;
        //Act
        boolean result = a==b;
        //Assert
        assertTrue(result,"de operator== faalt!");
    }

    @Test void equals_identical_returnsTrue() {
        //Arrange
        Account a1=new Account(3,"Goblin");
        Account a2=new Account(3,"Goblin");
        //Act
        boolean result=a1.equals(a2);
        //Assert
        assertTrue(result);
    }
    @Test void equals_notIdenticalNummer_returnsFalse() {
        Account a1=new Account(3,"Goblin");
        Account a2=new Account(4,"Goblin");
        assertFalse(a1.equals(a2));
    }
    @Test void equals_notIdenticalNaam_returnsFalse() {
        Account a1=new Account(3,"Goblin");
        Account a2=new Account(3,"Roc");
        assertFalse(a1.equals(a2));
    }

}