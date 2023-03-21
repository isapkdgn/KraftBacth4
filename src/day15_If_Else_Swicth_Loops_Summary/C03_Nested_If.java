package day15_If_Else_Swicth_Loops_Summary;

public class C03_Nested_If {
    public static void main(String[] args) {

        // alinin cebinde 100 tl var ise ve zamını var ise sinamaya gitsin
        // 100 tlsi yoksa evde kalsın

        int aliParasi=120;
        boolean zaman=false;

        if(aliParasi>=100){
            if (zaman){
                System.out.println("sinemaya gidebilir");
            }else{
                System.out.println("parası var zamanı yok gidemez");
            }
        }else{
            System.out.println("parası yok gidemez");
        }
        System.out.println("-----------------------");
        for (int i = 0,k=1; i <5 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }












    }


}
