package day24_StringClass_Cont;

public class Tasks4_lastOf3Letter {
    public static void main(String[] args) {
        String name="pekdoğan";
        //           01234567

        String name1=name.substring(name.length()-3);

        for (int i=1;i<=3;i++){
            System.out.println(name1);
        }
        System.out.println("-------------------------");
        String reversed="";
        for (int i=name.length()-1;0<=i;i--){
            reversed+=name.charAt(i);

        }
        System.out.println(reversed);

    }
}
