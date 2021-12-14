package mostenire;

import java.util.List;

public class Vw extends Masina{
    private String origine;
    private Double pret;
    private List<String>dotari;
    private String model;


    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public Double getPret() {
        return pret;
    }

    public void setPret(Double pret) {
        this.pret = pret;
    }

    public List<String> getDotari() {
        return dotari;
    }

    public void setDotari(List<String> dotari) {
        this.dotari = dotari;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Vw(String caroserie, Integer roti, Integer usi, String sasiu, Double motorizare, String transmisie
            , String combustibil, String origine, Double pret, List<String> dotari, String model) {
        super(caroserie, roti, usi, sasiu, motorizare, transmisie, combustibil);
        this.origine=origine;
        this.pret=pret;
        this.dotari=dotari;
        this.model = model;

    }

    public void configuratieMasina(){
        System.out.println("Masina Vw cu modelul" + getModel() + " are urmatoarea configuratie:");
        System.out.println(toString());

    }
    public void afiseazaOrigine(){
    System.out.println("Originea modelului"+ getModel()+ "este" + getOrigine());
}
    @Override
    public String toString() {
        return "Vw{" +
                "caroserie='" + getCaroserie()+ '\'' +
                ", roti=" + getRoti() +
                ", usi=" + getUsi() +
                ", sasiu='" + getSasiu() + '\'' +
                ", motorizare=" + getMotorizare() +
                ", transmisie='" + getTransmisie() + '\'' +
                ", combustibil='" + getCombustibil() + '\'' +
                ", origine='" + getOrigine() + '\'' +
                ", pret=" + getPret() +
                ", dotari=" + getDotari() +
                ", model='" + getModel() + '\'' +
                '}';
    }
}
