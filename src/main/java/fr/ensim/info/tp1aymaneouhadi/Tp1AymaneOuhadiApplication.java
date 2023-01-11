package fr.ensim.info.tp1aymaneouhadi;

import fr.ensim.info.tp1aymaneouhadi.exception.LimiteVisiteurException;
import fr.ensim.info.tp1aymaneouhadi.models.Animal;
import fr.ensim.info.tp1aymaneouhadi.models.TypeAnimal;
import fr.ensim.info.tp1aymaneouhadi.models.Zoo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp1AymaneOuhadiApplication {

    private Zoo zoo;

    public static void main(String[] args) {
        Zoo zoo =  new Zoo(2 );

        zoo.ajouterSecteur(TypeAnimal.chien);

        zoo.ajouterSecteur(TypeAnimal.chat);

        try {
            zoo.nouveauVisiteur();
        } catch (LimiteVisiteurException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("le nombre des visiteurs pour le moment: "+ zoo.getVisiteurs());

        Animal a1 = new Animal("lulu", TypeAnimal.chat);
        Animal a2 = new Animal("eggy", TypeAnimal.chien);

        zoo.nouvelAnimal(a1);
        zoo.nouvelAnimal(a2);

        System.out.println("le nombre des animaux " + zoo.nombreAnimaux());


//        SpringApplication.run(Tp1AymaneOuhadiApplication.class, args);
    }

}
