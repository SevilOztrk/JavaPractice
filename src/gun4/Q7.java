package gun4;

public class Q7 {
    public static void main(String[] args) {

        /*
        Kullanicidan main method icinde ayri ayri isim ve soyismini alin
Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
isim bosluk soyisim seklinde bize donduren bir method olusturun
input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz
         */


        String isim="ALİ";
        String soyIsim="YILMAZ";


        yeniIsimSoyisim(isim, soyIsim);
        yeniIsimSoyisim("ayse","fatma");

    }

    public static void yeniIsimSoyisim(String isim, String soyIsim) {

        System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase()
        +"\n" + soyIsim.substring(0,1).toUpperCase() + soyIsim.substring(1).toLowerCase());


    }


}
