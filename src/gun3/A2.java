package gun3;

public class A2 {
    public static void main(String[] args) {

       // SORU : kullanicidan bir mail alin
       // - mail @ icermiyorsa "gecersiz mail"
        //        - mail @gmail.com icermiyorsa, "mail gmail olmali"
       //         - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
       // yazdirin
        
        
        String mail="hdjskksh";
        
        if (!mail.contains("@")){

            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail")) {
            System.out.println("mail gmail olmali");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");

        }else {
            System.out.println("gecersiz mail");
        }

    }
    }
