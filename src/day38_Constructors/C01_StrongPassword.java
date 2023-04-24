package day38_Constructors;

public class C01_StrongPassword {
    public static void main(String[] args) {
        String password="Ab123*";
        System.out.println("isStrongPassword(password) = " + isStrongPassword(password));
    }


    public static boolean isStrongPassword(String password) {
        //password must be at least have 8 characters long,and should not contain space

        boolean r1 = password.length() >= 8 && !password.contains(" ");
        boolean r2 = false;  // upper case
        boolean r3 = false;  // lower case
        boolean r4 = false;  // digit
        boolean r5 = false;  // special case

        char[] chars = password.toCharArray();

        for (char eachChar : chars) {
            if (Character.isUpperCase(eachChar)) {
                r2 = true;
            } else if (Character.isLowerCase(eachChar)) {
                r3 = true;
            } else if (Character.isDigit(eachChar)) {
                r4 = true;
            } else {
                r5 = true;
            }
        }
        boolean isStrongpassword=r1 && r2 && r3 && r4 && r5;
        return isStrongpassword;
    }
}
