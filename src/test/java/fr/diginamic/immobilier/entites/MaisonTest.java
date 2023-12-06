package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaisonTest {

    @Test
    public void testAjouterPiece() {

        Maison maison = new Maison();

        Chambre chambre = new Chambre(1, 20.0);
        Cuisine cuisine = new Cuisine(2, 15.0);

        maison.ajouterPiece(chambre);
        maison.ajouterPiece(cuisine);

        assertEquals(chambre, maison.getPieces()[0]);
        assertEquals(cuisine, maison.getPieces()[1]);
    }

    @Test
    public void testSuperficieTypePiece() {

        Maison maison = new Maison();

        Chambre chambre1 = new Chambre(1, 20.0);
        Chambre chambre2 = new Chambre(2, 25.0);
        Cuisine cuisine = new Cuisine(1, 15.0);

        maison.ajouterPiece(chambre1);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(cuisine);

        assertEquals(15.0, maison.superficieTypePiece("Cuisine"));
        assertEquals(0.0, maison.superficieTypePiece("Salon"));
    }

    @Test
    public void testCalculerSurface() {

        Maison maison = new Maison();
        Chambre chambre = new Chambre(1, 20.0);
        Cuisine cuisine = new Cuisine(2, 15.0);

        maison.ajouterPiece(chambre);
        maison.ajouterPiece(cuisine);

        assertEquals(35.0, maison.calculerSurface());
    }

    @Test
    public void testSuperficieEtage() {

        Maison maison = new Maison();

        Chambre chambre1 = new Chambre(1, 20.0);
        Chambre chambre2 = new Chambre(2, 25.0);
        Cuisine cuisine = new Cuisine(1, 15.0);

        maison.ajouterPiece(chambre1);
        maison.ajouterPiece(chambre2);
        maison.ajouterPiece(cuisine);

        assertEquals(25.0, maison.superficieEtage(2));
        assertEquals(0.0, maison.superficieEtage(3));
    }

    @Test
    public void testPieceNull() {

        Maison maison = new Maison();

        assertDoesNotThrow(() -> maison.ajouterPiece(null));

    }


}
