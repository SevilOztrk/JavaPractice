import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {


        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
       // obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen kilo yazinz");
        int kilo= scan.nextInt();

        System.out.println("lutfen boy giriniz");

        double boy= scan.nextDouble();

        double Vke=(kilo*10000)/(boy*boy);

        if (Vke>=30){
            System.out.println("obez");
        } else if (Vke<30 && Vke>25) {
            System.out.println("kilolu");


        } else if (Vke<25 && Vke>20) {
            System.out.println("normal");

        } else if (Vke<20) {
            System.out.println("zayif");

        }else {
            System.out.println("yanlis veri girdnz");
        }
    }
}
