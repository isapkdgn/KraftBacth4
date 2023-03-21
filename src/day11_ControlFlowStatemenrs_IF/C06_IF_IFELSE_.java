package day11_ControlFlowStatemenrs_IF;

public class C06_IF_IFELSE_ {
    public static void main(String[] args) {
        // 2  adet a ve b  integer sayıyı karsılastırın
        // a büyüktür b den
        // b buyuktur a dan
        // a ve b esittir

       /* int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println(" A büyüktür B den");
        } else if (a == b) {
            System.out.println("A ve B esitir");
        } else if(a<b){
            System.out.println("B büyüktür A dan");
        }else if(a>b){
            System.out.println("merhaba");
        }else{
            System.out.println("pogram sona erdi");
        }


      //Bir program yazın eğer x in değeri 10 ise y ye 20 atansın,.
        //x in değeri 20 ise y ye 30 atansın,
        //x in değeri 30 ise y ye 40 atansın,.
        // değil ise y ye 0 atansın
        int x=35,y=0;
        if(x==10){
        y=20;}
        else if{
            y=0;

        }
        else if(x==20){
            y=30;

        }else if(x==30){
            y=40;
        }
        System.out.println("y ="+y);*/


       /* String str;
        int degree=19;
        if(degree>=20){
            str="butterfly flies";

        }else{
            str="";
        }
        System.out.println(str);*/


        /*int aysepara=1;
        if(aysepara<5){
            aysepara=aysepara+10;
        }
        System.out.println("aysenin parası: "+aysepara);*/



        /*
        int x=10;
        int y=10;
        if(x==y){
            System.out.println("sayı esit");
        }else{
            System.out.println("sayılar esit fegil");
        }

         */
       /* int x=20;
        int y=30;
        if(x>y){
            System.out.println(x);
        }else if(x==y){
            System.out.println("sayılar esit  ");
        }
        else{
            System.out.println(y);
        }*/


       int a,b,c;

       a=20;
       b=30;
       c=30;
       if((a+b)>c){
           //c=Math.max(a,b)-Math.min(a,b);
           //c=Math.abs((a-b));
           if ((a-b)>=0){
               c=a-b;

           }else{
               //c=-(a-b);
               c=b-a;
           }
       }
        System.out.println(c);




      //  3 adet ic  acı alsın ve bunu ücgen olup olmadığını kontrol etsin

       /* int x,y,z;
        x=60;
        y=60;
        z=60;
        if((x+y+z)==180){
            System.out.println("bu bir üçgendir");
        }else{
            System.out.println("üçgen değildir");


        }*/
        /*int x,y,z;
        x=90;
        y=45;
        z=45;
        if(x+y+z==180){
            if(x==90||y==90||z==90){
                System.out.println(" bu bir dik üçgendir");
            }else{
                System.out.println("bu bir dik ücgen değildir");
            }

        }else{
            System.out.println("bu üçgen değil");
        }*/

        //if ((x+y+z=180)&&(x==90||y==90||z==90))
    }
}
