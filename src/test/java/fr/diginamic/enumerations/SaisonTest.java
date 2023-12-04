package fr.diginamic.enumerations;

import org.junit.Test;
import static org.junit.Assert.*;

public class SaisonTest {

    @Test
    public void testValueOfLibelle() {
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
    }


}
