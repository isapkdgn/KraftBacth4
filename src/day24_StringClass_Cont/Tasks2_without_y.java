package day24_StringClass_Cont;

public class Tasks2_without_y {
    public static void main(String[] args) {

        String str="javayı Seviyor muyum?";

        int length=str.length();
        System.out.println("length = " + length);
        int lengthFinal= str.replace("y","").length();
        System.out.println(str+" icerisinde y "+(length-lengthFinal)+" adettir");


        System.out.println(str.charAt(1) + "," + str.charAt(8) + "," + str.charAt(10));


    }
}
