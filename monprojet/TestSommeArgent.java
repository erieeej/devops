package junit.monprojet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

public class TestSommeArgent {

    private SommeArgent sommeArgent1;
    private SommeArgent sommeArgent2;

    @Test
    public void testAddition() throws UniteDistincteException {
        SommeArgent somme1 = new SommeArgent(10, "USD");
        SommeArgent somme2 = new SommeArgent(20, "USD");
        SommeArgent sommeAttendue = new SommeArgent(30, "USD");

        SommeArgent resultat = somme1.add(somme2);
        assertEquals(sommeAttendue, resultat);
    }

    @Test
    public void testEquals() {
        SommeArgent m12CHF = new SommeArgent(12, "CHF");
        SommeArgent m14CHF = new SommeArgent(14, "CHF");
        SommeArgent m14USD = new SommeArgent(14, "USD");

        // Vérifie que l'égalité avec null renvoie false
        Assert.assertTrue(!m12CHF.equals(null)); 

        // Vérifie l'égalité avec soi-même
        Assert.assertEquals(m12CHF, m12CHF); 

        // Vérifie l'égalité avec une autre somme d'argent ayant la même quantité et la même unité
        Assert.assertEquals(m12CHF, new SommeArgent(12, "CHF"));

        // Vérifie que deux sommes d'argent différentes ne sont pas égales
        Assert.assertTrue(!m12CHF.equals(m14CHF)); 

        // Vérifie que deux sommes d'argent avec des unités différentes ne sont pas égales
        Assert.assertTrue(!m14USD.equals(m14CHF));
    }

    @Before
    public void setUp() {
        sommeArgent1 = new SommeArgent(20, "USD");
        sommeArgent2 = new SommeArgent(30, "USD");
    }
    
    @After
    public void tearDown() {
        System.out.println("APRES exécution d'une méthode de test");
    }

    
    @Test(expected = UniteDistincteException.class)
    public void testAddWithDifferentUnits() throws UniteDistincteException {
        SommeArgent somme1 = new SommeArgent(10, "EUR");
        SommeArgent somme2 = new SommeArgent(20, "USD");
        somme1.add(somme2);
    }
    

}
