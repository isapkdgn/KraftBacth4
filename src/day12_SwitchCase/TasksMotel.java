package day12_SwitchCase;

import java.util.Scanner;

public class TasksMotel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen motelimizi tanımak için 1-2-3 bir kat numrası girin ve oda seçin ");
        int katNo= scan.nextInt();
        switch (katNo) {
            case 1:
                System.out.println("1.Kat:\n(1)Resepsion\n(2)Güvenlik\n(3)Oda Hizmetleri");
                int kat1= scan.nextInt();

                switch (kat1){
                    case 1:
                        System.out.println("Resepsion : Tüm işlemler için bekleriz");
                        break;
                    case 2:
                        System.out.println("Güvenlik : Profosyonel Bir Hizmettir");
                        break;
                    case 3:
                        System.out.println("Oda Hizmetleri : Temizlik ve Taşoma Hizmetleri " +
                                "için 101 dahili Hattan Ulaşabilirsiniz");
                        break;
                }
                break;


            case 2:
                System.out.println("2. Kat:\n(1)Yemekhane\n(2)Dinlenme salonu\n(3)Room1-Room2");
                int kat2= scan.nextInt();

                switch (kat2){
                    case 1:
                        System.out.println("yemekhane :Kahvahtı 08-11\nÖğle yemeği 12-25\nAkşam yemeği 18-21");
                        break;
                    case 2:
                        System.out.println("Dinlenme Salonu : 24 saat çay servisi ile hizmetinizdedir");
                        break;
                    case 3:
                        System.out.println("Room1 Room2 : ekonomik oda");
                        break;
                }
                break;
            case 3:
                System.out.println("3.kat:\n(1)Room3-Room4\n(2)Room5-Room6");
                int kat3= scan.nextInt();
                switch (kat3){
                    case 1:
                        System.out.println("Room3-Room4 : Standart oda");
                        break;
                    case 2:
                        System.out.println("Room5-Room6 : Özel oda");
                        break;
                }
                break;
        }


        }
}
