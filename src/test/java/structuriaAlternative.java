import org.junit.Test;

public class structuriaAlternative {

    //cele mai des intalnite structuri sunt cele alternative
    //Structura alternativa : If(conditie) then
    //                                      else


    @Test
    public  void  testAutomat(){
      verificanumere();
      verificanume();
      VerificamParImpar(21);
      VerificamParImpar(15);
      VerificamParImpar(10);
      afisamZiuaInCurs("Luni");
    }

    //Verificam daca 5>3
    public void  verificanumere(){
        if (5<3){
            System.out.println("Primul numar este mai mare decat al doilea");
        }
        else {
            System.out.println("Primul numar nu este mai mare decat al doilea");
        }
    }

    //Verificam daca Alexandru contine Alex
    public void verificanume(){
        String nume="Alexandru";
        String continut="Rares";
        if (nume.contains(continut)){
            System.out.println("continutul se regaseste in nume");
        }
        else{
            System.out.println("continutul nu se regaseste in nume");

        }
    }



    //Verficam daca un numar este par sau impar
    public void VerificamParImpar(Integer numar){
        if (numar%2==0){
            System.out.println("numarul"+numar+" este par");
        }
        if (numar%2==1){
            System.out.println("Numarul"+numar+" leste impar");
        }
        if (numar>0){
            System.out.println("numar este"+numar+" pozitiv");
        }
        if (numar<0){
            System.out.println("Numarul este "+numar+" negativ");
        }
        else {
            System.out.println("salut!!!");
        }
    }

    //Afisam pe consola ziua in curs
    public void afisamZiuaInCurs( String ziua) {
      switch (ziua) {
          case "Duminica":
              System.out.println("Astazi este Duminica");
              break;
          case "Luni":
              System.out.println("Astazi este Luni");
              break;
          case "Marti":
              System.out.println("Astazi este Marti");



      }
    }

}
