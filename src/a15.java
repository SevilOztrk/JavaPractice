import java.util.Scanner;

public class a15 {
    public static void main(String[] args) {

       /* Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65
        yas ve uzeri emekli olabilir. Cinsiyet ve yasini dikkate alarak “Emekli
        olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.




    }
}

        */


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen cinsiyetinizi giriniz");
        char cns=scan.next().charAt(0);


        System.out.println("lutfen yasinizi giriniz");

        int yas= scan.nextInt();


        if (cns=='k' && yas>=60){
            System.out.println("emekli olabilirsn");
        } else if (cns=='k' && yas<=60) {
            System.out.println("emekli olmak için yasini doldurman lazim");

        } else if (cns=='e' && yas>=65) {
            System.out.println("emekli olabilirsn");

        } else if (cns=='e' && yas<=65) {
            System.out.println("emekli olmak icin yasini doldurman lazim");

        }else {
            System.out.println("yanlis veri girdnz");
        }

    }
}
