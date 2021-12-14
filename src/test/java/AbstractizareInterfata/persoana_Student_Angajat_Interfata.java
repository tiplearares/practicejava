package AbstractizareInterfata;

public class persoana_Student_Angajat_Interfata extends PersoanaInterfata implements I_Angajat, I_student {

    public persoana_Student_Angajat_Interfata(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void munceste() {

    }

    @Override
    public void primesteSalar() {

    }

    @Override
    public void invata() {

    }

    @Override
    public void mergeLaCurs() {

    }
}
