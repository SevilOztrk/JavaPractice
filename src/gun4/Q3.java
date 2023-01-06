package gun4;

public class Q3 {
    public static void main(String[] args) {
        /*
        Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
kaydedin
         */

        String str="Sevil"; //lives

        String ters="";

        for (int i =str.length()-1 ; i >=0 ; i++) {

            ters+=str.substring(i,i+1);

        }
    }
}
