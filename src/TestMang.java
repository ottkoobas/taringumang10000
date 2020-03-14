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

  //väljastab visketulemuse
  public static void väljastavisketulemus(String nimi, int [] visketulemus) {
      System.out.print(nimi + ", viskasid: ");
      for (int i = 0; i < visketulemus.length ; i++) {
          System.out.print(visketulemus[i] + " ");
      }
  }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sisesta mängijate arv: ");
        //tühi list kuhu mägijaid lisaada vastavalt hiljem kasutaja sisestatud arvule
        ArrayList<Mängija> kõikMängijad = new ArrayList<>();
        //tsükkel küsib vastavalt sisestatud mängijate arvule mängijate nimesid ja vastavalt sisestatud nimedele loob mängijate isendid ja salvestab need listi
        int mängijateArv = scan.nextInt();
        for (int i = 1; i < mängijateArv + 1; i++) {
            System.out.println("Sisesta " + i + ". mängija nimi: ");
            String nimi = scan.next();
            Mängija mängija  = new Mängija(nimi);
            kõikMängijad.add(mängija);
        }
        int i = 0;
        while(i != kõikMängijad.size()){
            int punktid = 0;
            int [] visketulemus = kõikMängijad.get(i).viienevise();
            väljastavisketulemus(kõikMängijad.get(i).getNimi(),visketulemus);
            break;

           // for (int j = 0; j < visketulemus.length; j++) {
            }
        }


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





