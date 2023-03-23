package day19_CustomMethods_Return;

public class Tasks1_Days {
    public static void main(String[] args) {
        System.out.println(nameOfDays(5));
    }
    public static String nameOfDays(int number){
        String name="";

        switch (number){
            case 1:
                name+="Monday";
                break;
            case 2:
                name+="Tuesday";
                break;
            case 3:
                name+="Wednesday";
                break;
            case 4:
                name+="Thursday";
                break;
            case 5:
                name+="Friday";
                break;
            case 6:
                name+="Saturday";
                break;
            case 7:
                name+="Sunday";
                break;
            default:
                name="Invalid";
        }
        return name;

    }
}
