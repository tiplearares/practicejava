import com.beust.jcommander.StringKey;
import org.checkerframework.common.value.qual.EnsuresMinLenIf;
import org.junit.Test;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class mutimi {

    @Test
    public void testautomat(){
        System.out.println("1.ArrayNumere");
        printezaArrayNumere();
        System.out.println("2.ArrayNumere");
        printezaArrayNumere();
        System.out.println("3.ListaValori");
        PrinteazaListaValori();
        System.out.println("4. HashMapValori");
        printeazaHashMapValori();
        System.out.println("5.AfiseazaOraseleCareApartinDeAnumiteTari");
        printeazalistaorares();
    }

    public void printezaArrayNumere(){
        Integer [] ArrayNumere=new Integer[4];
        ArrayNumere[0]=4;
        ArrayNumere[1]=5;
        ArrayNumere[2]=6;
        ArrayNumere[3]=7;
        for (Integer index=0; index<ArrayNumere.length; index++){
            System.out.println("Numarul curent este"+ArrayNumere[index]);
        }
        System.out.println("Ultimul element din Array este " +ArrayNumere[ArrayNumere.length-1]);
    }

    public void printeazaArrayValori(){
        String[] ArrayValori=new String[4];
        ArrayValori[0]="Rares";
        ArrayValori[1]="Madalina";
        ArrayValori[2]="Alex";
        for  (int index=0; index<ArrayValori.length-1; index++){
           System.out.println("Numele curent este"+ArrayValori[index]);
        }
    }

    public void PrinteazaListaValori(){
        List<String> ListaValori=new ArrayList<>();
        ListaValori.add("Rares");
        ListaValori.add("Madalina");
        ListaValori.add("Alex");
        for  (int index=0; index<ListaValori.size(); index++) {
            System.out.println("Numele curent este" + ListaValori.get(index));
        }
    }

    public void printeazaHashMapValori(){
        // Hash Map functioneaza dupa logica de key=value
        HashMap<String,String> MapValori=new HashMap<>();
        MapValori.put("nume","Tiplea");
        MapValori.put("prenume1","Madalina");
        MapValori.put("prenume2","Georgeta");
        for (String key: MapValori.keySet()){
            System.out.println("Cheia este" +key );
            System.out.println("Valoare este" +MapValori.get(key));
        }
    }
    public void printeazalistaorares(){
        List<String> ListaoraseRomania=new ArrayList<>();
        ListaoraseRomania.add("cluj Napoca");
        ListaoraseRomania.add("Timisoare");
        ListaoraseRomania.add("Bucuresti");
        ListaoraseRomania.add("SatuMare");
        List<String> ListaOraseSpania=new ArrayList<>();
        ListaOraseSpania.add("Madrid");
        ListaOraseSpania.add("Barcelona");
        ListaOraseSpania.add("Valencia");
        List<String> ListaOraseItalia=new ArrayList<>();
        ListaOraseItalia.add("Roma");
        ListaOraseItalia.add("Sicilia");
        HashMap<String,List<String>> MapTari=new HashMap<>();
        MapTari.put("Romania",ListaoraseRomania);
        MapTari.put("Spania", ListaOraseSpania);
        MapTari.put("Italia", ListaOraseItalia);
        for ( String key: MapTari.keySet()){
            System.out.println("Orasele care apartin de tara "+key+" sunt Urmatoarele:");
            List<String> Orase=MapTari.get(key);
            for (Integer index=0; index<Orase.size(); index++){
                System.out.println(Orase.get(index));
            }
        }

    }
}
