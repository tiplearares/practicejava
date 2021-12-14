package Obiect;

import java.util.List;

public class Cursant {

    //Obiect=reprezinta instanta unei clase
    //dintr-o clasa putem declara n obiecte
    //ca sa initializam un obiec folosim cuvantul cheie new
    //structura obiect=nume clasa ,+ nume obiect=new+nume clasa(se va apela constructorul clasei)+(se vor da valori pt variabile daca exista)
    //ex: Cursant Rares=new Cursant()
    //Constructor= are ca rol sa initializeze  atributele une clase
    // intr-o clasa putem defini n constructori diferentiati prin parametri sau nr de parametri
    // contructorii dintr-o clasa trebuie sa fie publici
    //structra constructor= public nume clasa(definim parametrii daca avem nevoie){}
    // in cazul in care nu declaram un costructor rezulta  => este 1 by default(constructor implicit)
    //this=pointeaza catre variabila din interiorul unei clase(se aplica doar daca avem doua variabile cu acelasi nume)

    public String nume;
    public String prenume;
    public Integer varsta;
    public Boolean esteAngajat;
    public Double taxa;
    public List<String> cursuri;
    public String curs;

    public Cursant(String nume, String prenume, Integer varsta, Boolean esteAngajat, Double taxa, List<String> cursuri){
       this.nume=nume;
       this.prenume=prenume;
       this.varsta=varsta;
       this.esteAngajat=esteAngajat;
       this.taxa=taxa;
       this.cursuri=cursuri;


    }
    public Cursant(String nume, String prenume, Integer varsta, Boolean esteAngajat, Double taxa, String curs){
        this.nume=nume;
        this.prenume=prenume;
        this.varsta=varsta;
        this.esteAngajat=esteAngajat;
        this.taxa=taxa;
        this.curs=curs;


    }
    public Cursant(String nume, String prenume, Integer varsta, Boolean esteAngajat , List<String> cursuri) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.esteAngajat = esteAngajat;
        this.cursuri = cursuri;
    }

    public void datecursantCursuri(){
        System.out.println("numele cursantului este" +nume );
        System.out.println(" prenumele cursantului este" + prenume);
        System.out.println(" este cursantul angajat" + esteAngajat);
        System.out.println(" varsta cursantului este" + varsta);
        System.out.println(" Taxa de plate" + taxa);
        System.out.println(" cursurile la care doreste sa participe sunt:");
        for (String curs: cursuri) {
            System.out.println(curs);
        }
    }
    public void datecursantCurs(){
        System.out.println("numele cursantului este" +nume );
        System.out.println(" prenumele cursantului este" + prenume);
        System.out.println(" este cursantul angajat" + esteAngajat);
        System.out.println(" varsta cursantului este" + varsta);
        System.out.println(" Taxa de plate" + taxa);
        System.out.println(" cursul la care doreste sa participe sunt:");


    }
    public void verificavarstaCursant(){
        if (varsta>=18){
            System.out.println("Cursantul este major");
        }
        else if (varsta>18){
            System.out.println("CursantulNuEsteMajor");
        }
        else {
            System.out.println("Cursantul nu este major");
        }

    }

}
