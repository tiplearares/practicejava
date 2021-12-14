package AbstractizareInterfata;

public class PersoanaStudentInterfata  extends PersoanaInterfata implements I_student {
    public PersoanaStudentInterfata(String nume, String prenume, Integer varsta) {
        super(nume, prenume, varsta);
    }

    @Override
    public void invata() {
        System.out.println( "Studentul " + nume+ " " + prenume  + "invata!");

    }

    @Override
    public void mergeLaCurs() {
        System.out.println( "Studentul " + nume+ " " + prenume  + "mergeLaCurs!");

    }
}
