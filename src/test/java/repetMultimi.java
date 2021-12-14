import org.junit.Test;

import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class repetMultimi {



    @Test
    public void testautomat() {
        System.out.println("1.ArrayNumere");
        printeazaArrayNumere();
        System.out.println("2.ArrayNumere");
        printeazaArrayNumere();
        System.out.println("3.ListaValori");
        PrinteazaListaValori();
        System.out.println("4.HashMapValori");
        PrinteazaHashMapValori();
        System.out.println("5.AfiseazaOraseleCareApartinDeAnumiteTari");
        PrinteazaListaOrase();
    }







    public void printeazaArrayNumere(){
        Integer[] ArrayNumere= new Integer[4];
        ArrayNumere[0]=4;
        ArrayNumere[1]=5;
        ArrayNumere[2]=6;
        ArrayNumere[3]=7;
        for (Integer index=0; index<ArrayNumere.length; index++){
            System.out.println("Numarul curent este "+ ArrayNumere[index]);
        }
        System.out.println("Ultimul element din Array este"+ArrayNumere[ ArrayNumere.length-1]);
    }
    public void PrinteazaArrayValori(){
        String[] ArrayValori= new String[4];
        ArrayValori[0]="Rares";
        ArrayValori[1]="Madalina";
        ArrayValori[2]="Alex";
        for (int index=0; index<ArrayValori.length-1; index++){
            System.out.println("Numele curent este"+ ArrayValori[index]);
        }

    }
    public void PrinteazaListaValori(){
        List<String> ListaValori= new ArrayList<>();
        ListaValori.add("Rares");
        ListaValori.add("Madalina");
        ListaValori.add("Alex");
        for (int index=0; index<ListaValori.size(); index++) {
            System.out.println("Numele curent este" + ListaValori.get(index));
        }
    }

    public void PrinteazaHashMapValori(){
        //Hash Map functioneaza dupa logica de key=value
        HashMap<String,String> MapValori=new HashMap<>();
        MapValori.put("nume","Tiplea");
        MapValori.put("prenume", "Rares");
        MapValori.put("prenume2","Georgeta");
        for (String key: MapValori.keySet()){
            System.out.println("Cheia este" +key);
            System.out.println("Valoarea este" +MapValori.get(key));
        }

    }
    public void PrinteazaListaOrase(){
        List<String> ListaOraseRoamania=new ArrayList<>();
        ListaOraseRoamania.add("Cluj-Napoca");
        ListaOraseRoamania.add("Bucuresti");
        ListaOraseRoamania.add("Timisoara");
        ListaOraseRoamania.add("Satu-Mare");
        List<String>ListaOraseSpania=new ArrayList<>();
        ListaOraseSpania.add("Barcelona");
        ListaOraseSpania.add("Madrid");
        ListaOraseSpania.add("Valencia");
        List<String>ListaOraeItalia=new ArrayList<>();
        ListaOraeItalia.add("Roma");
        ListaOraeItalia.add("Milan");
        HashMap<String,List<String>> MapTari=new HashMap<>();
        MapTari.put("Romania",ListaOraseRoamania);
        MapTari.put("Spania", ListaOraseSpania);
        MapTari.put("Italia",ListaOraeItalia);
        for (String key: MapTari.keySet()){
            System.out.println("Orase care apartin de tara "+key+"sunt urmatoarele:");
            List<String>Orase=MapTari.get(key);
            for (Integer index=0; index<Orase.size(); index++){
                System.out.println(Orase.get(index));
            }

        }

    }
}
