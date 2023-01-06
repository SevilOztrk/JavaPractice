import java.util.Scanner;

public class A19 {
    public static void main(String[] args) {

       /* Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
“Sayi 5’in tam kati” yazdirin.

                Soru 3- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
        harf olarak yazdirin, yoksa girilen harfi yazdirin
        Soru 4- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        kucukse “Maalesef kaldin” yazdirin.
                Soru 5- Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
        Soru 6- Kullanicidan bir sayi alin ve mutlak degerini yazdirin

    }
}

        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi girinz");

        int sayi= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3= scan.nextInt();

        System.out.println((sayi % 5 == 0 ? "sayi 5'in tam kati" : "sayi 5'in tam kati degil"));



       // Soru 2- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
//“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.


        System.out.println(sayi==sayi2 && sayi2==sayi3 ? "eskenar ucgen" : "eskenar ucgen degil");
    }
}
