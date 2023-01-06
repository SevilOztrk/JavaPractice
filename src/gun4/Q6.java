package gun4;

public class Q6 {
    public static void main(String[] args) {

        /*
        Soru 1- Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
bir method olusturun.
- kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
mesaji verin
- kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
yazdirin
         */


        String input="Java cok guzel";
        int basIndex=5;
        int btiIndex=8;

        baslangicMethod("Java", basIndex,btiIndex);
        baslangicMethod("Java", 4,1);



    }





    public static void baslangicMethod(String input, int basIndex, int bitIndex){


        if (basIndex>bitIndex){
            System.out.println("hata");

        } else if (bitIndex>=input.length()) {
            System.out.println("hata2");

        }else {

            for (int i = basIndex; i <bitIndex ; i++) {

                System.out.print(input.charAt(i));

            }
            System.out.println("");




        }



    }
}
