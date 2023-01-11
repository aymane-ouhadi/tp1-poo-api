package fr.ensim.info.tp1aymaneouhadi.models;

import java.util.ArrayList;
import java.util.List;

public class Secteur {
	
	private TypeAnimal typeAnimauxDansSecteur;

	public List<Animal> getAnimauxDansSecteur() {
		return animauxDansSecteur;
	}

	private List<Animal> animauxDansSecteur ;
	
	
	
	
	public Secteur(TypeAnimal typeAnimauxDansSecteur) {
		super();
		this.typeAnimauxDansSecteur = typeAnimauxDansSecteur;
		this.animauxDansSecteur = new ArrayList<>() ;
	}


	public void ajouterAnimal(Animal animal) {
		
		
		//TODO: throw error 
		animauxDansSecteur.add(animal);
	}

	
	public int getNombreAnimaux() {
		return animauxDansSecteur.size();
	}
	
	
	public TypeAnimal obtenirType() {
		return typeAnimauxDansSecteur;
	}
}
