package gun3;

public class A15 {
    public static void main(String[] args) {

       // Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.


        int sayi=4231;

        int birlerB=0;
        int rakamlarT=0;

        for (int i = 0; i <= sayi+1; i++) {

            birlerB=sayi%10;
            rakamlarT=birlerB+rakamlarT;
            sayi=sayi/10;

        }
        System.out.println(rakamlarT);
    }
}
