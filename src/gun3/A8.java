package gun3;

public class A8 {
    public static void main(String[] args) {

        /*
        Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
harflerle yazdirin


         */


        String isim= "basak";
        String soyisim="ozturk";


        if (isim.length()>soyisim.length()){
            System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase()
                    + soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).toLowerCase());
        } else  {
            System.out.println(isim.substring(0,1).toUpperCase() + isim.substring(1).toLowerCase()
                    + soyisim.toUpperCase());
        }


    }
}
