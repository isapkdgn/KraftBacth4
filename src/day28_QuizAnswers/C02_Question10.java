package day28_QuizAnswers;

public class C02_Question10 {
    public static void main(String[] args)
    {
        String song = "good";
        String talk = "feel";
        String feel = "walk";
        getOutput(talk, "song", feel);
        getOutput("feel","song","walk");
    }
    public static void getOutput(String hear, String good, String song)
    {
        good = "" + song + " " + hear + " " + good;//walk feel song
        System.out.println("to " + hear + " the " + song + " is " + good);
                            //to feel the walk is walk feel song
    }


}
