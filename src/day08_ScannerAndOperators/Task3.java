package day08_ScannerAndOperators;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("yaricapdeger");

        double yaricap= scan.nextDouble();
        double cevre=2*Math.PI*yaricap;
        double alan=Math.PI*yaricap*yaricap;
        System.out.println(yaricap+" cm yarıcaplı dairenin cevresi; "
                + cevre+" cm dir "+" alanı ise "+alan+" cm² dır");


    }
}
