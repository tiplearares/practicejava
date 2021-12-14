package Obiect;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class CursantTest {

    @Test
    public void testAutomat(){
        //declaram un obiect de tipul unui cursant
        System.out.println("---obiectul Rares---");
           Cursant Rares= new Cursant("Tiplea", "Rares",41,false,5.000,Arrays.asList("tasting",
                "Automation Tasting","Java"));
           Rares.datecursantCursuri();
           Rares.prenume="Didu";
           Rares.datecursantCursuri();
           Rares.verificavarstaCursant();
           Rares.varsta=17;
           Rares.datecursantCursuri();
           Rares.verificavarstaCursant();
        System.out.println("---obiectul Gabriela---");
        Cursant Gabriela=new Cursant("Slajan", "Gabriela",18,false,4.000,Arrays.asList("DataBase",
                "Automation Tasting"));

        Gabriela.datecursantCursuri();
        Gabriela.verificavarstaCursant();

        System.out.println("---Obiectul Vlad---");
        Cursant Vlad=new Cursant( "Domide","Vlad",35,true,5000.0, "Devops");
        Vlad.datecursantCurs();
        Vlad.verificavarstaCursant();

        System.out.println("--- Obiectul Paul---");
        Cursant Paul=new Cursant( "Popescu","Paul",23,true, Arrays.asList("DataBase",
                "Automation Tasting"));


        Paul.datecursantCurs();
        //Paul.EsteMajor


    }
}
