package day10stringmanipulation;

public class ForLoop01 {
    public static void main(String[] args) {

        //Loop dongu demek. Bir seyi tekrar tekrar yapmak.Kisir dongu

        //Example 1: Ekrana 5 kere "Hi" yazdir
//        System.out.println("Hi");
//        System.out.println("Hi");
//        System.out.println("Hi");
//        System.out.println("Hi");
//        System.out.println("Hi");
//        Kod yazarken bu sekilde tekrar tekrar yazmak bir kabaliktir hos karsilanmaz:)

        // Tekrarli isler icin "loop" kullaniriz
        //4 cesit loop vardir; i)for-loop ii)while-loop iii)do-while-loop iv)for-each-loop

        //for-loop
        //Example 1: Ekrana 5 kere "Hi" yazdir
        // Baslangic degeri loop hangi sart altinda calisacak Increment(artirma) veya decrement(azaltma)

        for (  int i = 1       ;        i<6                      ;    i = i+1                         ){

            System.out.println("Hi");
        }

        //Example 3: 4 den 7 e kadar tum tamsayilari ekrana yazdiran kodu yaziniz
        for ( int s = 4;  s<8 ; s++ ){
            System.out.print(s+ " ");
        }
        System.out.println();

        // Example 4: 14den 5 e kadar tum sayilari yanyana ekrana yazdiran kodu yazin
        for (int i = 14; i>4; i--){
            System.out.println(i+ " ");// neden " " bosluk yaptik? sayilar arasinda bosluk olmasi icin
        }


        //Example 5: 14den 5e kadar tum cift sayilari ekrana yazdiran kodu yaziniz
        //Cift sayilar : 14,12,10,8,6
        for (int i =14; i>4; i-=2){
            System.out.print(i+ " ");//14 12 10 8 6
        }
        System.out.println();
        //2.yol:
        for (int i=14; i>4 ;i--){
            if (i%2==0){
                System.out.print(i+ " ");
            }
        }

        System.out.println();

        //Example 6: 28 den 157 e kadar tum tek tamsayilari ekrana yazdiran kodu yazin
        for (int i = 28; i<158 ; i++){
            if (i%2!=0){
                System.out.print(i+ " ");
            }
        }
        System.out.println();
        //Example 7: "Java" stringini "J*a*v*a*" string ine ceviren kodu yaziniz

        String str= "Java";
        for (int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ "*");
        }

        //Example 8: Size verilen String'de tekrarsiz karakterleri ekrana yazdiriniz
        //           "Hellooo Ali" ==> He Ai
        String s = "Hellooo Ali";
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);//He Ai
            }
        }



















    }



}
