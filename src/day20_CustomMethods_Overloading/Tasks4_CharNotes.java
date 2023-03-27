package day20_CustomMethods_Overloading;

public class Tasks4_CharNotes {
    public static void main(String[] args) {
        System.out.println(lessonNote(55));
    }
    public static char lessonNote(int num){
        char lessonNote=0;
        if (num>=76&&num<=100){
            lessonNote='A';
        } else if (num>=51&&num<=75) {
            lessonNote='B';
        } else if (num>=0&&num<=50)
            lessonNote='C';

        return lessonNote;
    }
}
