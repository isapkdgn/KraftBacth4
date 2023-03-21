package day16_Branching_Starements;

import java.util.Scanner;

public class BankaMenusu {
    public static void main(String[] args) {

        //   Banka menüsü oluşturun 1 para ekle 2 hesabımı gör 3 para çek 4 çıkış  (money=2000)
        //  while işleme devam etmek için 1 e basın bir üst menü için 2 basın kart iade 3


        Scanner scan = new Scanner(System.in);



        anaMenü:while (true) {
            System.out.println("Bankaıza Hoş Geldiniz\n1 para ekle 2 hesabımı gör 3 para çek 4 çıkış");
            int money = 2000;
            int tercih = scan.nextInt();

            if (tercih == 1) {
                paraekle:while (true) {
                    System.out.println("eklenecek para miktarı");
                    int para = scan.nextInt();
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
            } if (tercih == 2) {
                bakiye:while (true) {
                    System.out.println("bakiye :"+money);
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
            }




            if (tercih == 3) {

               paracekme: while (true) {
                    System.out.println("cekmek istediğiniz miktarı girin");
                    int miktar= scan.nextInt();
                  // System.out.println("kalan money:"+(money-miktar));
                   money-=miktar;
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

            }
            if (tercih==4){
                break;
            }
        }
    }
}
