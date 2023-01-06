import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip, dikdortgenin alanini
                //yazdirin



        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen dikdortgenin bir kenar uzunlugu giriniz");
        int kenar1= scan.nextInt();
        System.out.println("lutfen dikdortgenin bir kenar uzunlugu giriniz");
        int kenar2=scan.nextInt();

        System.out.println((kenar1*kenar2));
    }
}
