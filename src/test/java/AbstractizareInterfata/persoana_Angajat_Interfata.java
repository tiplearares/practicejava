package AbstractizareInterfata;

public class persoana_Angajat_Interfata extends PersoanaInterfata implements I_Angajat
{

    public persoana_Angajat_Interfata(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {
        System.out.println( "Angajatul " + nume+ " " + prenume  + "munceste!");
    }

    @Override
    public void primesteSalar() {
        System.out.println( "Angajatul " + nume+ " " + prenume  + "primesteSalar!");
    }
}
