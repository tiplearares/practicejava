package AbstractizareInterfata;



public class PersoanaInterfata {

    // Abstractizare =conceptul prin care definim comportamentul unei clase
    // se poate realiza cu interfete sau clase abstractre
    // se foloseste cuvantul cheie =Interface
    // o clasa implementeaza o interfata
    // o clasa poate implementa mai multe interfete
    // o interfata contine doar metode abstracte
    // nu avem constructor in interfata=>nu putem creea obiecte
    // clasa care implementeaza interfata , implementeaza toate metodele din interfata



           public String nume;
           public String prenume;
           public Integer varsta;

    public PersoanaInterfata(String nume, String prenume, Integer varsta) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }
}

}
