import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {


      //  Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
//“Eskenar ucgen” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen 3 sayi giriniz");
        int sayi= scan.nextInt();
        int sayi2= scan.nextInt();
        int sayi3=scan.nextInt();

        if (sayi==sayi2 && sayi2==sayi3){
            System.out.println("eskenar ucgen");
        }else {
            System.out.println("eskenar uıcgen degil");
        }

    }
}
