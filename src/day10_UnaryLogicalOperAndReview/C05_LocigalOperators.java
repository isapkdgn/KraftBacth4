package day10_UnaryLogicalOperAndReview;

public class C05_LocigalOperators {
    public static void main(String[] args) {
        String name="Ayse";
        int age=34;
        String citizen="Turkey";


        //18+ turkish

        boolean iaEligibleVote = age>=18 && citizen=="Turkey";//Stringlerin esitliğini == operatoru ile kontrol etmeyiz
                          //       34>=18 && "turkey"=="turkey"
                          //         true &&  true
        System.out.println(name+" is eligiblevote: "+iaEligibleVote);

        System.out.println("-----------------------------");

        String name2 = "Umit";
        int findexScore=800;
        int age2=43;
        int income=40000;
        boolean isEligibleForLoan= findexScore>=1500 && age2>= 18  &&   income>=30000;



        System.out.println(name2+" is eligible for loan  "+isEligibleForLoan);
        System.out.println("-----------------------------");

        String isim="isa";
        int yas=38;
        int krediNotu=500;
        boolean krediyeUygunMU=yas>=18 & krediNotu>=1000;
        System.out.println("krediyeUygunMU = " + krediyeUygunMU);

        System.out.println("-----------------------------");
        String name3= "Hatice";
        int age3=21;
        char gender='F';        // Female Male

        boolean isEligible =age3>=18 &&(gender=='M' || gender=='F');
               //            true        (false  ||  true)
                //           true     &&    true
                //              true
        System.out.println(name3+" is eligable to selected as MP:"+isEligible);

        System.out.println("-----------------------------");

        String student ="ali";
        double gpa=2.5;
        int familyİncome=15000;

        boolean isEligibleForScholarship =gpa>=3.5  || familyİncome<=20000;
        //                                  2,5>03,5 || 15000<=20000
        //                                      fslse || true
        //                                            true
        System.out.println(student+" isEligable for scholarship :"+isEligibleForScholarship);

        System.out.println("-----------------------------");

        boolean result =true;
        System.out.println("result = " + result);

        boolean result1=!result;
        System.out.println("result1 = " + result1);
        System.out.println("-----------------------------");

        int score=55;
        boolean passed =score>=60;
        boolean failed =!passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }
}
