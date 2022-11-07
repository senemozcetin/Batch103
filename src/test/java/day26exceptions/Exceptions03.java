package day26exceptions;

public class Exceptions03 {
    public static void main(String[] args) {

        double d= divideStringByTheNumOfTheChar("124");
        System.out.println(d);

        divideStringByTheNumOfTheChar(null);

    }

    // String deki karakter sayisini bulunuz, String i Integer a ceviriniz , Integer i karakter sayisina bolunuz
    //1.yol
    public static double divideStringByTheNumOfTheChar(String str){

         int lenght=0;
         int i= 0;
         double sonuc= 0;

         try {
             lenght = str.length(); // NullPointerException: "null" String ile "lenght()" kullanildiginda alinir

             i = Integer.valueOf(str);// NumnerFormatException:Icinde rakamdan farkli karakter olan String ler valueOf() ile kullanildiginda

             sonuc= i/lenght;//ArithmeticException: Bolen sayi sifir oldugunda

         }catch (NullPointerException e){
             System.out.println(e.getMessage());
         } catch (NumberFormatException e){
             System.out.println(e.getMessage());

         }catch (ArithmeticException e) {
             System.out.println(e.getMessage());
         }
         return sonuc;
         }
         //2.yol
    public static double divideStringByTheNumOfTheCharacter(String str){

        int lenght=0;
        int i= 0;
        double sonuc= 0;

        try {
            lenght = str.length(); // NullPointerException: "null" String ile "lenght()" kullanildiginda alinir

            i = Integer.valueOf(str);// NumnerFormatException:Icinde rakamdan farkli karakter olan String ler valueOf() ile kullanildiginda

            sonuc= i/lenght;//ArithmeticException: Bolen sayi sifir oldugunda

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return sonuc;
    }


    //3.yol
    public static double divideStringByTheNumOfTheCharacters(String str){
        int lenght=0;
        int i= 0;
        double sonuc= 0;
        try {
            lenght = str.length(); // NullPointerException: "null" String ile "lenght()" kullanildiginda alinir

            i = Integer.valueOf(str);// NumnerFormatException:Icinde rakamdan farkli karakter olan String ler valueOf() ile kullanildiginda

            sonuc = i / lenght;//ArithmeticException: Bolen sayi sifir oldugunda

        }catch (NullPointerException e){
            System.out.println("NullPointer a ozel...");
        }catch (Exception e){
            System.out.println("Diger tum Exception lar icin...");
        }
        return sonuc;
    }
    /*
       Note 1: Aralarinda "parent-child" relationship olan Exception Class lari multiple catch lerde kullanmak isterseniz
               "child" olan once kullanilmalidir, aksi takdirde hata verir.
            2: Aralarinda "parent-child" relationship olmayan Exception Class lari multiple catch lerde kullanmak isterseniz
            siralamanin bir onemi yoktur
     */
}
