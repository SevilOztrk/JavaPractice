package gun3;

public class A13 {

    public static void main(String[] args) {

        /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
hesaplayin.
         */


        int sayi=6;
        int faktoriyel=1;

        for (int i = sayi; i >0 ; i--) {

            faktoriyel=faktoriyel*i;

        }
        System.out.println(faktoriyel);


    }
}
