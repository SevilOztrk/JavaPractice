package gun6;

public class A2 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
kullanildigini yazdiran bir method olusturun.
         */


        int [] arr={9,6,4,4,4,7,6,3};

        istenenElemanBulma(arr);




    }
    public static int [] istenenElemanBulma(int []arr){

        int sayac=0;
        int istenenEleman=4;

        for (int i = 0; i <arr.length ; i++) {

            if (istenenEleman==arr[i]){
               sayac++;
            }

        }
        if (sayac==0){
            System.out.println("istenen eleman yok");
        }else {
            System.out.println("istenen eleman" + sayac + " tane ");
        }
        return arr;

    }
}
