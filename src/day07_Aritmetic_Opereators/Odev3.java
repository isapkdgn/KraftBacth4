package day07_Aritmetic_Opereators;

import java.util.Scanner;

public class Odev3 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("sirasayisi: ");
        int sirasayisi= scan.nextInt();
        System.out.print("koltukSayisi: ");
        int koltukSayisi= scan.nextInt();
        System.out.print("katilanKisi: ");
        int katilanKisi= scan.nextInt();

        int kapasite=sirasayisi*koltukSayisi;
        System.out.println("kapasite = " + kapasite);

        int bosKoltuk=kapasite-katilanKisi;
        System.out.println("bosKoltuk = " + bosKoltuk);

        int kacsiradaoturulmakta=katilanKisi/sirasayisi+1;
        System.out.println("kacsiradaoturulmakta = " + kacsiradaoturulmakta);

        int bossirasayisi=sirasayisi-kacsiradaoturulmakta;
        System.out.println("bossirasayisi = " + bossirasayisi);

        int oturulansiradaBosKoltukAdedi=koltukSayisi-(katilanKisi%koltukSayisi);
        System.out.println("oturulansiradaBosKoltukAdedi = " + oturulansiradaBosKoltukAdedi);


    }
}
