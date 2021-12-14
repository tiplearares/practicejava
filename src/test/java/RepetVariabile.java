import org.junit.Test;

public class RepetVariabile {

    //Clasa,Variabila,Metoda,Constructor,Obiect
    //1.Clasa= un sablon ce contine variabile,metode,constructor,obiect.
    //2.Variabila=atributul unei clase.
    //3.Metoda=actiunile unei clase.
    //1.Structura clasa=acces control class nume clasa{}
    //1.Numele clasei trebuie sa fie unit
    //2.Tipuri Variabile=global si local
    //2.Variabila globala= este vizibila peste ton in clasa declarata
    //2.Structura variabila globala= acces controltip variabila nume variabila;
    //2.0Variabila poate sau nu sa primeasca o valoare
    //2.Structura variabila locala=tip variabila numa variabila
    //exemplu: declaram variabile in interiorul clasei
    //3.Tipuri de metode= void, eturn
    //in java exista doar metode(declarate in interiorul unei clase) nu si functii
    //3.Metodele pot avea sau nu parametrii
    //3.Structura metode void= aces control void nume metoda(){}
    public String nume;
    public String prenume;
    public Integer varsta;
    public  Double inaltime;
    public String adresa;
    public Boolean esteAngajat;
    public Double greutate;




    @Test
    public void atribuiValori(){
        nume="tiplea";
        prenume="rares";
        varsta=41;
        inaltime=1.80;
        adresa="Gheorghe Dima nr 12";
        esteAngajat=false;


        System.out.print(nume+" ");
        System.out.print(prenume);
        System.out.print(esteAngajat);

        System.out.println(varsta+" " + inaltime+" " + adresa);

        System.out.println(nume);
        System.out.print(nume+"\r\n" +prenume);

        //Afisatipe tastatura mesajul : Cursant <nume> <prenume> a trimis proectul la manual.
        System.out.print("Cursantul "+nume+" "+prenume+" a trimis proectul la manual.");
        System.out.print(String.format("%.2f", greutate));
    }
}
