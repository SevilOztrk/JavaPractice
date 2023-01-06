package gun5;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {

      /*
       Soru : Kullanicidan Kullanicidan sifre
       isteyin asagidaki sartlari saglamayan
        sifrelerde hatalari yazdirip,
                kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu
        islemi tekrar edin gecerli sifre
        yazilinca “sifreniz basari ile
        kaydedildi” yazdirin
        sartlar :
        - sifrenin ilk karakteri kucuk harf
        olmali
                - sifrenin son karakteri sayi olmali

    }
}

       */


        Scanner scan=new Scanner(System.in);
        String sfre="";

        boolean sifreDogruMu=false;

        char ilkHarf;
        char sonKrk;

        while (!sifreDogruMu){

            System.out.println("lutfen  sifre giriniz");
            sfre= scan.nextLine();

             ilkHarf=sfre.charAt(0);
             sonKrk=sfre.charAt(sfre.length()-1);

            if (ilkHarf<'a' || ilkHarf>'z'){
                System.out.println("ik harf kucuk olmali");

            } else if (sonKrk<'0' || sonKrk>'9') {
                System.out.println("son krk sayi olmali");

            }else {
                System.out.println("sifreniz basari ile kaydedildi");
            }
            sifreDogruMu=true;


        }



    }
}

