import org.junit.Test;

public class repetStructuriRepetitive {

    //cele mai intalnite structuri repetitive sunt for si while


    @Test
    public void testautomat(){
        afisamNumereFor(50);
        afisamNumereFor( 100);
        afisamNumereWhile(100);
    }



    //Afisam primele 50 de numere
    public void afisamNumereFor(Integer limit){
        for (Integer index=8;index<limit+1; index++){
            System.out.print (index+"   ");
        }
    }
    //Afisam primele50 de numere -while
    public void afisamNumereWhile(Integer limit){
        Integer index=0;
        while (index<limit+1);{
            System.out.println(index+"  ");
            index++;
        }

    }

}
