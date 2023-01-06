import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {


        // Soru 5- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
       //  kucukse “Maalesef kaldin” yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen notunuzu giriniz");
        int not= scan.nextInt();

        if (not>=50){
            System.out.println("sinifi gectin");
        }else {
            System.out.println("sinifta kaldin");
        }
    }
}
