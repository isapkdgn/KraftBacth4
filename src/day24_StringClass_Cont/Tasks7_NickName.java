package day24_StringClass_Cont;

public class Tasks7_NickName {
    public static void main(String[] args) {

        System.out.println(nickName("isa", "pekdoğan"));

    }

    public static String nickName(String name,String surname){
       String name1= name.substring(0,3);
       String surname1=surname.substring(surname.length()-3,surname.length());
       String nick=name1.concat(surname1);
       return nick;
    }


}
