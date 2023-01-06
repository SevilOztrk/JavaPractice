package gun4;

public class Q2 {
    public static void main(String[] args) {
        /*
        Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
         */

        String str="Sevil"; //lives



        for (int i = str.length()-1; i>=0; i--) {

            System.out.print(str.charAt(i));

        }
        System.out.println("===");


        /*
        Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
kontrol edin ve sonucu yazdirin
         */


        int sayi=7;
        int sayac=0;

        for (int i = 2; i <sayi; i++) {

            if (sayi%i==0){
                sayac++;

            }


        }
        if (sayac==0){
            System.out.println("asal sayi");
        }else {
            System.out.println("asal sayi deil");
        }

    }
}
