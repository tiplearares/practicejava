import org.junit.Test;

public class repetStructuriAlternative {

    //cele mai intalnite structuri sunt cele alternative
    //structura alternativa: If(conditie)  then
    //                                     else


    @Test
    public void  testAutomat(){
        verificamnumere();
        verificanume();
        verificamParImpar(21);
        verificamParImpar(15);
        verificamParImpar(10);
        afisamZiuaInCurs("Marti");

    }


    //Verificam daca 5>3
    public void  verificamnumere(){
        if (5<3){
            System.out.println( "Primul numar este mai mare decat al doilea");
        }
        else {
            System.out.println("Primul numar nu ete mai mare decat al doilea");
        }
    }


    //Verificam daca Alexandru contine Alex
    public void verificanume(){
        String nume= "Alexandru";
        String continut="Rares";
        if (nume.contains(continut)){
            System.out.println("continutul se regaseste in nume");
        }
        else {
            System.out.println("continutul nu se regaseste in nume");
        }
    }



    //Verificam daca un numar este par sau impar
    public void verificamParImpar(Integer numar){
        if (numar%2==0){
            System.out.println("numarul"+numar+"este par");
        }
        if (numar%2==1){
            System.out.println("numarul"+numar+"este impar");
        }
        if (numar>0){
            System.out.println("numarul"+numar+"este pozitiv");
        }
        if (numar<0){
            System.out.println("numarul"+numar+"este negativ");
        }
        else {
            System.out.println("salut!!!");
        }
    }
    //Afisam pe consola ziua in curs
    public void afisamZiuaInCurs(String ziua){
        switch (ziua){
            case "Duminica":
                System.out.println("Astazi este duminica");
                break;
            case "Luni":
                System.out.println("Astazi este luni");
                break;
            case "Marti":
                System.out.println("Astazi este marti");
        }
    }
}
