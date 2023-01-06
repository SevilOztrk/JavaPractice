package gun6;

import java.util.Arrays;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
       /* Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        donduren bir method olusturun.

        Soru 6- Verilen String bir array’deki en uzun ve en kisa kelimeleri yazdiran bir method
        olusturun.

                Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        eski array’e yeni degeri atayin
         */


        int [] boyut=boyutOlusturma();

        System.out.println(Arrays.toString(boyut));

    }

    private static int []  boyutOlusturma() {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen boyutunu giriniz");
        int length=scan.nextInt();

        int [] boyut=new int[length];

        for (int i = 0; i <length ; i++) {

            System.out.println("lutfen eleman giriniz");

            boyut[i]= scan.nextInt();

        }
        return boyut;
    }
}
