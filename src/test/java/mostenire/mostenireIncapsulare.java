package mostenire;

import org.junit.Test;

import java.util.Arrays;

public class mostenireIncapsulare {

    @Test
    public void testAutomat(){
        Audi  Q5 = new Audi( "Hatchback", 5,5,"MQB", 2.0,"manuala", "benzina",
                "Q5", Arrays.asList("radio" , "panoramic" , "servo"), 5000.0);
        Q5.configuratieMasina();


        Audi Q7 = new Audi( "Hatchback", 5,5,"MQB", 2.0,"manuala", "motorina",
                "Q7", Arrays.asList("incalzireScaune" , "panoramic" , "servo"), 50000.0);
        Q7.configuratieMasina();



        Vw golf4 = new Vw("Hatchback", 5,5,"MQB",1.6,"automata","benzina","Germania",
                45.000,Arrays.asList("radio","gps"),"Golf 4");
        golf4.configuratieMasina();
        golf4.afiseazaOrigine();
        golf4.setModel("golf5");
        golf4.configuratieMasina();

    }



}
