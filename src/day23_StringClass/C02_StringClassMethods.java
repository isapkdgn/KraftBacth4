package day23_StringClass;

public class C02_StringClassMethods {
    public static void main(String[] args) {
        // length
        String programmingLanguage = "java"; // String pool içerisinde bir obje olusturdu
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());
        System.out.println("---------------------------------------");
        programmingLanguage= "python";          //String immutable java yı isaret ediyordu,String poolda yeni bir oble
                                                // o objenin  icine pyhton yazdi
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());
        System.out.println("---------------------------------------");
        //TOUPPERCASE(), tolowercase()
        System.out.println("programmingLanguage.toUpperCase() = " + programmingLanguage.toUpperCase());
        System.out.println("programmingLanguage = " + programmingLanguage);

        programmingLanguage=programmingLanguage.toUpperCase();
        System.out.println("programmingLanguage = " + programmingLanguage);

        System.out.println("programmingLanguage.toLowerCase() = " + programmingLanguage.toLowerCase());
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("---------------------------------------");

        //CharAt()

        System.out.println("programmingLanguage.charAt(0) = " + programmingLanguage.charAt(0));
        System.out.println("programmingLanguage.charAt(5) = " + programmingLanguage.charAt(5));
        System.out.println("programmingLanguage.length() = " + programmingLanguage.length());
        System.out.println("---------------------------------------");
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-1) = "
                + programmingLanguage.charAt(programmingLanguage.length() - 1));
       // System.out.println("programmingLanguage.charAt(programmingLanguage.length()) = "
             //   + programmingLanguage.charAt(programmingLanguage.length()));
        System.out.println("programmingLanguage.charAt(2) = " + programmingLanguage.charAt(2));
        System.out.println("programmingLanguage.charAt(programmingLanguage.length()-4) = "
                + programmingLanguage.charAt(programmingLanguage.length() - 4));
        System.out.println("---------------------------------------");
       // System.out.println("programmingLanguage.charAt(programmingLanguage.length()-7) = "
        //        + programmingLanguage.charAt(programmingLanguage.length() - 7));


        //concat()
        System.out.println("---------------------------------------");
        System.out.println("programmingLanguage = " + programmingLanguage);
        System.out.println("programmingLanguage.concat(\"Programlama Dili Java'dan Daha kolaydır\") = "
                + programmingLanguage.concat(" Programlama Dili Java'dan Daha kolaydır"));
        programmingLanguage=programmingLanguage.concat(" Programlama Dili Java'dan Daha kolaydır");

        System.out.println("---------------------------------------");

        // contains()

        System.out.println(programmingLanguage);
        System.out.println("programmingLanguage.contains(\"Dili\") = " + programmingLanguage.contains("Dili"));
        System.out.println("programmingLanguage.contains(\" Dili \") = " + programmingLanguage.contains(" Dili "));
        System.out.println("programmingLanguage.contains(\" Dili J\") = " + programmingLanguage.contains(" Dili J"));
        System.out.println("programmingLanguage.contains(\"python\") = " + programmingLanguage.contains("python"));
        System.out.println("programmingLanguage.contains(\"P\") = " + programmingLanguage.contains("P"));
        System.out.println("programmingLanguage.contains(\"w\") = " + programmingLanguage.contains("w"));

        System.out.println("---------------------------------------");

        //trim()
        String s="   Hello    World     ";
        System.out.println("s = " + s);
        System.out.println("s.trim() = " + s.trim());
        System.out.println(s);
        String trimS=s.trim();
        System.out.println(trimS);

        System.out.println("---------------------------------------");

        // replace()
        System.out.println("s.replace(\"Hello\",\"Big Big\") = " + s.replace("Hello", "Big Big"));
        System.out.println("trimS.replace(\"Hello\",\"Developer\") = " + trimS.replace("Hello", "Developer"));
        System.out.println("trimS.replace(\"Hel\",\"\") = " + trimS.replace("Hel", ""));

        System.out.println("---------------------------------------");

        //indeksOf()
        System.out.println(trimS);
        System.out.println("trimS.indexOf(\"H\") = " + trimS.indexOf("H"));
        System.out.println("trimS.indexOf(\"Hell\") = " + trimS.indexOf("Hell"));
        System.out.println("trimS.indexOf(\"World\") = " + trimS.indexOf("World"));


    }
}
