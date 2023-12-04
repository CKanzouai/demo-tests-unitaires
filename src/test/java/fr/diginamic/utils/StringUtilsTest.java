package fr.diginamic.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void levenshteinDistance() {

        assertEquals(1, StringUtils.levenshteinDistance("chat", "chats"));
        assertEquals(1, StringUtils.levenshteinDistance("machins", "machine"));
        assertEquals(1, StringUtils.levenshteinDistance("aviron", "avion"));
        assertEquals(2, StringUtils.levenshteinDistance("distance", "instance"));
        assertEquals(2, StringUtils.levenshteinDistance("Chien", "Chine"));


    }
    @Test
    public void testLevenshteinDistanceNullParameters() {
        // Test avec des paramètres null
        assertEquals(0, StringUtils.levenshteinDistance(null, null));
        assertEquals(5, StringUtils.levenshteinDistance(null, "hello"));
        assertEquals(5, StringUtils.levenshteinDistance("hello", null));
    }

}