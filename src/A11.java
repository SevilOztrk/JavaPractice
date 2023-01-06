import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {

        /* Soru 1- Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
“Sayi 5’in tam kati” yazdirin.




    }
}

         */



        int sayi=12;


        if (sayi%5==0){

            System.out.println("5in tam kati");
        }else{
            System.out.println("5in tam kati degil");
        }

        System.out.println("====");

       // Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
       // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);


        if (harf=='o' || harf=='O'){
            System.out.println("ocak");
        } else if (harf=='s' || harf=='S') {

        }else {
            System.out.println("yanlis harf girdiniz");
        }


    }
}
