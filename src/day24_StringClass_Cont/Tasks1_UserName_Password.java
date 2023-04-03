package day24_StringClass_Cont;

import java.util.Scanner;

public class Tasks1_UserName_Password {
    public static void main(String[] args) {

        for (int i = 0; i <3 ; i++) {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a UserName");
            String userName = scan.nextLine();
            System.out.println("Enter a Password");
            String password = scan.nextLine();


            if (userName_PasswordControl(userName,password)){
                System.out.println("giriş sayfası,,");
                break;
            }else {
                if (i==2){
                    System.out.println("hakkınız doldu sistem den cıkıs yapılıyor");
                    return;
                }
                System.out.println("hatalı işlem nedeniyle lütfen tekrar deneyin");
            }

        }
        System.out.println("hoş geldiniz sayfımıza");



    }
   /* Kullanıcıdan userName ve password isteyen bir method
    yazın. Method aşağıdaki şartları kontrol etsin.
    Password ve username alanı boş olamaz.
    Password alanı boş olamaz
    Password 8 karakterden az olamaz.
            Username 3 karakterden az olamaz. (ödev)

    */


    public static boolean userName_PasswordControl(String userName, String password) {
      if (userName.isEmpty()||password.isEmpty()){
          System.out.println( "username ve password bos olamaz");
          return false;
      } else if (password.length()<8||userName.length()<3) {
          if (password.length()<8&&userName.length()>=3){
              System.out.println("password 8 karakterden  kucuk olamaz");
              return false;
          } else if (password.length()>=8&&userName.length()<3) {
              System.out.println( "username 3 karakterden  kucuk olamaz");
              return false;
          }else {
              System.out.println( "ikisi hatalı");
              return false;
          }
      }
      else {
          System.out.println("islem basalı");
          return true;
      }

    }


}

