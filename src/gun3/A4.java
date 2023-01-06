package gun3;

public class A4 {
    public static void main(String[] args) {

        /*Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
                - String aranan metni icermiyor
                - Aranan metin String’de sadece 1 kere kullanilmis
        - Aranan metin String’de sadece 1’den fazla kullanilmi
    }
},

         */



        String str="Java cok guzeldir";

        String arananKelime="cok";

        int ilkIndex=str.indexOf(arananKelime);
        int sonIndex=str.lastIndexOf(arananKelime);

        
        if (!str.contains(arananKelime)){

            System.out.println("string aranan metni icwermiyor");

        } else if (ilkIndex==sonIndex) {

            System.out.println("cumle metni bir kere icerir");
            
        }else {
            System.out.println("cumle metni birden fazla iceriyor");
        }


    }
}
