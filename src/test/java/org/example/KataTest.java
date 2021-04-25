package org.example;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit test for simple App.
 */
public class KataTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void createGameTest() {
        Kata game = new Kata();
        assertNotNull(game);
    }
}
