import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {



        //Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //  isleminin sonucununun tamsayi kismini yazdirin.




        Scanner sc=new Scanner(System.in);

        System.out.println("lutfen double bir sayi giriniz");

        double rkm1= sc.nextDouble();

        System.out.println("lutfen double bir sayi daha giriniz");

        double rkm2= sc.nextDouble();

        int sonuc=(int)(rkm1/rkm2);

        System.out.println(sonuc);


    }
}
