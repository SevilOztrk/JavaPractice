import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {

       // Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi1=scan.nextInt();

        System.out.println("lutfen bir sayi giriniz");
        int sayi2=scan.nextInt();


        int bosKova=sayi1;

        sayi1=sayi2;

        sayi2=bosKova;

        System.out.println("sayi1'in degeri:" + sayi1);
        System.out.println("s2'nin d:" + sayi2);



















            }
}
