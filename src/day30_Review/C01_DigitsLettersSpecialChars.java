package day30_Review;

public class C01_DigitsLettersSpecialChars {
    /*Create a method that takes a String and prints 3 different String of Letters, digits and special chars
     * of that string. space is not considered as a special char */
//"ABCDExyz1234567890) (*&^%$#@!"

    public static void main(String[] args) {

        seperateCharters("ABCDE  xyz  jkl: ff;1234567890) (*&^%$#@!");

    }



    public static void seperateCharters(String str){
        String letter="";
        String digits="";
        String specialChars="";
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);  //each char of str
            if (ch>='A'&&ch<='Z'){  // checks if is A-Z
                letter+=ch;
            } else if (ch>='a'&&ch<='z') {
                letter+=ch;
            } else if (ch>='0'&&ch<='9') {
                digits+=ch;
            }
            else{
                if (ch!=' '){
                    specialChars+=ch;
                }
            }

        }
        System.out.println("letter = " + letter);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }

}
