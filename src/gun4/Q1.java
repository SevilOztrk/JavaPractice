package gun4;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        /*
        Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
tamsayilari yazdirin, sira
- 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
- 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
- hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
yazdiri
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi girinz");

        int sayi= scan.nextInt();

        for (int i = 1; i <sayi ; i++) {

            if (i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            } else if (i%3==0) {
                System.out.println("fizz");

            } else if (i%5==0) {
                System.out.println("5 ile bolenebilen:" + "buzz");

            }else {
                System.out.println("yanlis veri girdinz");
            }

        }
    }
}
