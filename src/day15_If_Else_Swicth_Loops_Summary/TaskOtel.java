package day15_If_Else_Swicth_Loops_Summary;

import java.util.Scanner;

public class TaskOtel {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen motelimizi tanımak için 1-2-3 bir kat numarası girin");
        int tercih1= scan.nextInt();
        switch (tercih1){
            case 1:
                System.out.println("1.Kat:(1)Resepsiyon-(2)Güvenlik-(3)Oda hizmetleri");
                int tercih2= scan.nextInt();
                switch (tercih2){
                    case 1:
                        System.out.println("Resepsiyon: tüm işlemler için bekleriz");
                        break;
                    case 2:
                        System.out.println("Güvenlik: profosyenel bir hizmettir");
                    break;
                    case 3:
                        System.out.println("temizlik ve taşıma işlemleri için 101 dahili hattan ulaşabilirsiniz");
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;
            case 2:
                System.out.println("2.Kat:(1)Yemekhane (2) Dinlenme salonu (3) Room1 - Room2");
                int tercih3= scan.nextInt();
                switch (tercih3){
                    case 1:
                        System.out.println("Yemekhane :kahvaltı 08-11\nöğle yemeği 12-25\nakşam yemeği 18-21");
                        break;
                    case 2:
                        System.out.println("Dinlenme salonu : 24 saat cay servisi ile hizmetinizdedir");
                        break;
                    case 3:
                        System.out.println("Room1,Room2 : ekonomi oda");
                        break;
                    default:
                        System.out.println("hatalı giriş");
                }
                break;
            case 3:
                System.out.println("3.Kat: (1)Room3-Room4-(2)Room5-Room6");
                int tercih4= scan.nextInt();
                switch (tercih4){
                    case 1:
                        System.out.println("Room3,Room4 : standart oda");
                        break;
                    case 2:
                        System.out.println("Room5,Room6 :özel oda");
                        break;
                    default:
                        System.out.println("hatalı giriş");


                }
            default:





        }












    }
}
