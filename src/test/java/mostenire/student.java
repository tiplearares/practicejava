package mostenire;

public class student {
    //polimorfism=de doua feluri:
    // dinamic/overRiding-static/overLouded
    // intro ierarhie de clase obtinute prin mostenire o metoda poate avea implementati diferite
    //static= conceptul prin care putem avea mai multe metode cu acelasi nume
    // si diferentierea se face prin  nr de parametrii sau tipul parametrilor

    private String nume;
    private String prenume;
    private String adresa;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public student(String nume, String prenume, String adresa) {
        this.nume = nume;
        this.prenume = prenume;
        this.adresa = adresa;

    }
    public void afiseazaInfoStudent(){
        System.out.println(" detaliile despre student sunt:" + getAdresa()+ "  "+ getNume()+"  " +getPrenume());
    }
}
