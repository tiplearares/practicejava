package mostenire;

public class studentCF extends student {



    public studentCF(String nume, String prenume, String adresa) {
        super(nume, prenume, adresa);
    }

    public void mediastudentului( Integer notaUnu, Integer notaDoi){
        Integer medie=(notaUnu+notaDoi)/2;
        System.out.println( " Media studentului CF este:"  + medie);
    }
    @Override
    public void afiseazaInfoStudent(){
        System.out.println(" detaliile despre student sunt:"+ getAdresa()+ "  " + getNume()+"  " +getPrenume());

    }
    public void afiseazaInfoInitial(){
        super.afiseazaInfoStudent();
    }
}
