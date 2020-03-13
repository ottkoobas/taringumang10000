import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class TestMang {

    //sisestada loodud mängija nimi.viienevise() ehk
  /*  public static int [] viska(String nimi){
        ArrayList<Integer> tulemus = new ArrayList<>();
        for (int i = 0; i < nimi.viienevise().length; i++) {



        }

    }*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta mängijate arv: ");
        //tühi list kuhu mägijaid lisaada vastavalt hiljem kasutaja sisestatud arvule
        ArrayList<Mängija> kõikMängijad = new ArrayList<>();
        int mängijateArv = scan.nextInt();
        for (int i = 1; i < mängijateArv + 1; i++) {
            System.out.println("Sisesta " + i + ". mängija nimi: ");
            String nimi = scan.next();
            Mängija mängija  = new Mängija(nimi);
            kõikMängijad.add(mängija);

            kõikMängijad.get(0).setPuktideSumma(10);

        }

        System.out.println(kõikMängijad);
        System.out.println(kõikMängijad.get(0).getPuktideSumma());
        // Algtingimus
        // skoor
        // uus
        // uus rida
        //mängija viskab




        //kuni mängija Toot algtingimus ei ole true, siis kestab sisseviskemäng kuni 750 punktini
       // while (Toots.isAlgtingimus() != true) {

        }

        //kuni mängija Toot algtingimus ei ole true, siis kestab sisseviskemäng kuni 750 punktini
       // while (Teele.isAlgtingimus() != true) {

        }


