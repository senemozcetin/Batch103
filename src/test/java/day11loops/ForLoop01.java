package day11loops;

public class ForLoop01 {
    public static void main(String[] args) {

        //Example 1: 3 den 6 ya kadar tamsayilarin toplamini bulan kodu yaziniz

        int toplam= 0;
        for (int i= 3; i<=6; i++){
            toplam=toplam+i;
        }
        System.out.println("toplam: "+ toplam);




        //Example 2: 6dan 3 e kadar tamsayilarin carpimini bulan kodu yaziniz

        int carpim=1;

        for (int i = 6; i>=3 ; i--){
            carpim= carpim*i;
        }
        System.out.println("Carpim :"+ carpim );


        // Example 3: Size verilen basamakli bir tamsayinin rakamlari toplamini bulunuz

        int num= 385;

        num= Math.abs(num);

        int sonuc= 0;

         for (int i=385; i>0 ; i=i/10){
            sonuc= sonuc+ i%10;
         }
        System.out.println(sonuc);


         //Size verilen bir string i ters ceviren kodu yaziniz
        String s="Kaba";

         for (int i = s.length()-1; i>=0; i-- ){
             System.out.print(s.charAt(i));
         }









    }
}
