package fr.ensim.info.tp1aymaneouhadi.models;

import fr.ensim.info.tp1aymaneouhadi.exception.LimiteVisiteurException;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    public void testErrorThrow() {
        Zoo zoo = new Zoo(20);


        LimiteVisiteurException thrown = Assertions.assertThrows(LimiteVisiteurException.class, () -> {
            zoo.nouveauVisiteur();
        });

        assertEquals("nombre de visiteurs a exceder la capacite max", thrown.getMessage());
    }

}