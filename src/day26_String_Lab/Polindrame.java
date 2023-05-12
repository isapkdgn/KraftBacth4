package day26_String_Lab;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Polindrame {

    public static void polindrom(List<String> list) {
        Set<String> resultSet = new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equalsIgnoreCase(reverse(list.get(i)))) {
                resultSet.add(list.get(i));
            }
        }

        for (String str : resultSet) {
            System.out.print(str + " ");
        }
    }

    public static String reverse(String str) {
        try {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
