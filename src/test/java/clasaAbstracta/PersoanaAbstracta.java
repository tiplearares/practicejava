package clasaAbstracta;

public abstract class PersoanaAbstracta {

    //clasa abstracta poate sau nu sa contina metode abstracte
    // clasa care extinde o clasa abstracta trebuie sa implementeze toate metodele abstracte
    //intr-o clasa abstracta poti declara un constructor insa nu poti face un obiect
    // putem mosteni o singura clasa
    // o clasa abstracta poate implement o interfata insa o interfata nu poate extinde o clasa abstracta
    //o interfata poate extinde o alta interfata
    //o clasa abstracta poate extinde o alta clasa abstracta

    public abstract void invata();
    public abstract void mergeLaCurs();

    public abstract void munceste();
    public abstract void primesteSalar();

    public void detaliiVarsta(Integer varsta){
        if (varsta > 18){
            System.out.println("persoana este majora");
        }
    }
}
