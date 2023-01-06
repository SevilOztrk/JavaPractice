import java.util.Scanner;

public class A17 {
    public static void main(String[] args) {


        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        //karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
        //     %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        //alirsa %15, yoksa %10 indirim yapin


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen urun adedi girinz");
        int adet = scan.nextInt();

        System.out.println("lutfen fiyat girnz");

        double fiyat = scan.nextDouble();

        boolean kartVarmi = true;



        if (adet<10){
            System.out.println(fiyat*adet);

        }else if (kartVarmi && adet>10){
            System.out.println((fiyat*adet)*0.8);
        } else if (kartVarmi=!true) {
            System.out.println((fiyat*adet)*0.85);

        } else if (!kartVarmi && adet>10) {
            System.out.println((fiyat*adet)* 0.85);

        } else if (!kartVarmi) {
            System.out.println((fiyat*adet)*0.9);

        }else {
            System.out.println("yanlis veri girdnz");
        }

    }
}
