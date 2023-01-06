import java.util.Scanner;

public class A8 {
    public static void main(String[] args) {


       // Soru 5- Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
       // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir double sayi giriniz");

        double sayi= scan.nextDouble();

        System.out.println("lutfen bir tam sayi giriniz");

        int sayi2= scan.nextInt();

        int sonuc=(int)(sayi/sayi2);

        System.out.println(sonuc);
    }
}
