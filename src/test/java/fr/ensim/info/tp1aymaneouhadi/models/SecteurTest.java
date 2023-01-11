package fr.ensim.info.tp1aymaneouhadi.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecteurTest {

    @Test
    void ajouterAnimal() {

        Zoo zoo = new Zoo(10);
        Secteur secteur = new Secteur(TypeAnimal.chien);

        Chien felix = new Chien("felix", TypeAnimal.chien);

        secteur.ajouterAnimal(felix);

        assertTrue(secteur.getAnimauxDansSecteur().contains(felix));
    }
}