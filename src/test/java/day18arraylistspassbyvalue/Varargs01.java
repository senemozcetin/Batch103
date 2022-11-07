package day18arraylistspassbyvalue;

public class Varargs01 {
    public static void main(String[] args) {

        /*
        1)Farkli sayilardaki parametrelerle calisabilen bir method olusturmak isterseniz
        varargs kullanmalisiniz
        2)"Varargs" arka taraflarta array kullanir. Bu yuzden varargs larla calisirken array lerle
        calisiyormussunuz gibi davranabilirsiniz
        3)"Varargs" olusturmak icin "<data type>...  <varargs ismi>" veya "<data type>  ...<varargs ismi>"
        4)Bir methodda varargs in yaninda baska bir parametre kullanilabilir mi?
        "Varargs" en sonda olmak sartiyla kullanilabilir.
        5)Bir methodda birden fazla varargs kullanilabilir mi?
         "Varargs" en sonda olmak zorunda oldugundan birden fazla kullanirsaniz en az
         biri en sonda olmayacaktir. BU da 4.kural ile celisir.

         */

        int r1= add(2,3);
        System.out.println(r1);//5

        int r2= add(2,3,4);
        System.out.println(r2);//9

        int r3= add(2,3,4,5,6,7,8,9);
        System.out.println(r3);//44



    }
    //Iki sayinin toplamini return eden bir method olusturun

//    public static int toplamaYap(int a, int b) {
//        return a + b;
//    }

    //Uc sayinin toplamini veren methodu yazalim
//    public static int toplamaYap(int a, int b, int c) {
//        return a + b + c;
//    }

    //Dort sayinin toplamini veren methodu yazalim
//    public static int toplamaYap(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }
//    //Istedigimiz kadar sayiyi toplayabilecegimiz bir method olusturalim
    public static int add(int...a){
        int sum=0;
        for (int w:a){
            sum=sum+w;
        }
        return sum;
    }
}
