package gun3;

public class A12 {
    public static void main(String[] args) {

       // Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
       // dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        //baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin




        int toplam=0;

        int basDegeri=1;
        int bitDegeri=10;

        for (int i = 1; i <10 ; i++) {

                toplam+=i;
                System.out.print(toplam + " ");
            }

        if (bitDegeri>basDegeri) {
            System.out.println("uyari");

        }
    }
}
