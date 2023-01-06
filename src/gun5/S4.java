package gun5;

import java.util.Arrays;

public class S4 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
method yaziniz.
         */


        int [] arr={2,6,-3,8,-4,-5,6};

        System.out.println(Arrays.toString(arr));

    }

    public static int arrayToplam(int [] arr) {

        int toplam=0;


        for (int i = 0; i <arr.length ; i++) {

            if (arr[i]>0){

               toplam+=arr[i];
            }


        }
        return toplam;
    }
}
