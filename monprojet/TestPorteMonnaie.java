package junit.monprojet;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class TestPorteMonnaie {

    @Test
    public void testAjouteSomme() {
        PorteMonnaie porteMonnaie1 = new PorteMonnaie();
        porteMonnaie1.ajouteSomme(new SommeArgent(5, "EUR"));
        porteMonnaie1.ajouteSomme(new SommeArgent(5, "EUR"));

        PorteMonnaie porteMonnaie2 = new PorteMonnaie();
        porteMonnaie2.ajouteSomme(new SommeArgent(10, "EUR"));

        assertNotEquals(porteMonnaie1, porteMonnaie2);
    }
}//
