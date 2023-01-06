import java.util.Scanner;

public class A6 {
    public static void main(String[] args) {

        /*

        Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod
yazin







         */


        int sayi1=5;
        int sayi2=6;
        int sayi3=7;

        double ortalama=(sayi1+sayi2+sayi3)/3;

        System.out.println(ortalama);

        System.out.println("======");



        // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        char girilenKrk='b';

        System.out.println(""+(char)(girilenKrk+1) + (char)(girilenKrk+2) + (char)(girilenKrk+3));

        //Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        // ile 127 arasindaki bir sayiya donusturup yazdirin.


      Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir sayi giriniz");
        int b= scan.nextInt();

        byte a2=(byte)b;

        System.out.println(a2);

        System.out.println("=====");
















    }
}
