import org.junit.Test;

public class variabile_metode {

    // Clasa, Variabila, Metoda, Constructor, Obiect
    //1.Clasa= un sablon ce contine variabile,metode ,constructor, obiect.
    //2.Variabila= atributul unei clase.
    //3.Metoda= actiunile unei clase
    //1.Structura clasa=access control class nume clasa{}
    //1.un fisier java poate sa contina mai multe clase
    //1.Numele clasei trebuie sa fie unic
    //2.Tipuri variabile= global si local
    //2.Variabila globala= este vivibila peste tot in clasa declarata
    //2.Structura variabila globala= access control tip variabila nume variabila;
    //2.O variabila poate sau nu sa primeasca o valoare
    //2.Structura variabila locala=tip variabila nume variabila
    // Exemplu: declaram variabile in interiorul clasei
    //3.Tipuri de metode= void, eturn
    //3.In java exista doar metode (declarate in interiorul unei clase) nu si functii
    //3.Metodele pot avea sau nu paramaetrii
    //3.Structura metoda void= acces control void nume metoda(){}
    public String nume;
    public String prenume;
    public Integer varsta;
    public Double inaltime;
    public String adresa;
    public Boolean esteAngajat;
    public Double greutate;



    @Test
    public void atribuiValori() {
        nume = "tiplea";
        prenume = "rares";
        varsta = 41;
        inaltime = 1.80;
        adresa = "Gheorghe Dima NR 12";
        esteAngajat = false;


        System.out.print(nume + " ");
        System.out.print(prenume);
        System.out.println(esteAngajat);

        System.out.println(varsta + " " + inaltime + " " + adresa);

        System.out.println(nume);
        System.out.print(nume + "\r\n" + prenume);

        //Afisati pe tastatura mesajul:Cursant <nume> <prenume> a trimis proectul la manual.
        System.out.print("Cursantul " + nume + " " + prenume + "a trimis proectul la manual.");
        System.out.print(String.format("%.2f", greutate));
        System.out.println (getSalarAngajat());

    }
        //returnam salarul unui angajat'
        // structura metoda return;public tipul de returnare nume(){return}



    public double getSalarAngajat(){
        Double salar= 10000.0;
        Double bonus=25000.0;
        Double calcul= salar * bonus;
        return calcul;


    }



}
