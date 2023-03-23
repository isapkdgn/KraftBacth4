package day16_Branching_Starements;

import java.util.Scanner;

public class BankaMenusu {
    public static void main(String[] args) {

        //   Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış  (money=2000)
        //  while işleme devam etmek için 1 e basın bir üst menü için 2 basın kart iade 3


        Scanner scan = new Scanner(System.in);


        double money = 2000;
        anaMenü:while (true) {
            System.out.println("Bankaıza Hoş Geldiniz\n1 para ekle 2 hesabımı gör 3 para çek 4 çıkış");

            int tercih = scan.nextInt();

            switch (tercih) {
                case 1:
                while (true) {
                    System.out.println("eklenecek para miktarı");
                    double para = scan.nextDouble();
                   // System.out.println("toplam para :" + (para + money));
                    money+=para;
                    System.out.println("işleme devam etmek için 1 e basın bir üst menü için 2 ye kart iade için 3 e basın");
                    int tercih1 = scan.nextInt();
                    if (tercih1 == 1) {
                        continue ;
                    } else if (tercih1 == 2) {
                        continue anaMenü;

                    } else if (tercih1 == 3) {
                        break anaMenü;

                    }
                }
                case 2:
                    System.out.print("bakiyeniz : "+money);
                    break;

                case 3:
                    while(true){
                        System.out.print("Çekmek  isteğiniz tutarı girin: ");
                        double para= scan.nextDouble();
                        if(para>money){
                            System.out.println("hesabınızda yeterli bakiye yoktur");
                            continue anaMenü;
                        }
                        money-=para;
                        System.out.println("işleme devam etmek için 1 e basın bir üst menü için 2 ye kart iade için 3 e basın");
                        int tercih1 = scan.nextInt();
                        if (tercih1 == 1) {
                            continue ;
                        } else if (tercih1 == 2) {
                            continue anaMenü;

                        } else if (tercih1 == 3) {
                            break anaMenü;

                        }
                    }
                case 4:
                    break anaMenü;


            }







        }
    }
}
