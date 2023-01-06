import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
       // Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir.


        Scanner scan=new Scanner(System.in);

        System.out.println("bir isim giriniz");

        String isim=scan.nextLine();

        System.out.println("lutfen soyad giriniz");

        String soyad=scan.nextLine();


        System.out.println("lutfen yas giriniz");
        int yas= scan.nextInt();




        System.out.println("isminiz:" + isim+"\n"+
                "soyisminiz:" + soyad+"\n" + "yas:" + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");



    }
}
