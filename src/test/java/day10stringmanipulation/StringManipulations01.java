package day10stringmanipulation;

public class StringManipulations01 {

    public static void main(String[] args) {
        String a = "Java kolaydir.";

        // startsWith("kola"' 5) kodu ilk 5 karakterden sonraki string e bakar ve o string in "kola" ile
        // baslayip baslamadigini kontrol eder. "kola" ile basliyorsa true baslamiyorsa false return eder
        // index olmadigi icin 0dan baslamicaz saymaya 1den baslicaz
       boolean b= a.startsWith("va",2);// 2.karakterden sonra neyle basliyor
        System.out.println(b);

        // .replaceFirst("a","*") kod stringdeki ilk a yi * e cevirir
       String c= a.replaceFirst("a","*");
        System.out.println(c);// Java kolaydir.


        //concat methodu iki tane string i birbirine yapistirmaya yarar, sadece sola ekler.
        // concatenation islemi 2 turlu yapilabilir. 1.+ ile 1. concat ile
        // java bir islem icin method urettiyse o methodu kullanmak best practice dir
        String d= a.concat("Anladin mi?");
        System.out.println(d);//Java kolaydir. Anladin mi?


       String e="   Tom Hanks    ";
        System.out.println(e);//"   Tom Hanks    "

        //trim() methodu bir stringin bas ve sonundaki space karakterlerini siler
        // aradaki space karakterlerine dokunmaz
        String f = e.trim();
        System.out.println(f);//"Tom Hanks"

        String h = "Java";
        String i = "Java";
        //h.compareTo(i) kod iki tane string i alfabetik olarak karsilastirir.
        //Buyuk harf kucuk harfe duyarlidir
        //Buyuk harf kucuk harfe duyarli olmasini istemezseniz compareToIGnoreCase kullanabilirsiniz
        // h. compareTo(i); kodda h nin alphabetik sirasindan i nin alfabetik sirasi cikarilir.
        int k = h.compareTo(i);
        System.out.println(k);


        // a.repeat(5) kodu "a" stringini yanyana 5 kere yapistirir
        // windows kullananlar kodun ne return ettigini anlamak icin ctrl ye basili tutun
       String n=  a.repeat(5);
       System.out.println(n);








    }
}
