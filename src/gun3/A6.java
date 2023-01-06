package gun3;

public class A6 {
    public static void main(String[] args) {

        /*
        Soru 3 : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
input : java1 ogRe2@nMek3 #ne +Gu=zel
output : Java ogrenmek ne guzel.
         */


        String metin="ali5atabak2^£";

        metin=metin.replaceAll("\\d", " ");
        System.out.println(metin);

        metin=metin.replaceAll("\\W", " ");
        System.out.println(metin);


















    }
}
