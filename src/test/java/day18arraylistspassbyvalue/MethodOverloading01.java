package day18arraylistspassbyvalue;

public class MethodOverloading01 {
    /*
    Metg=hod Overloading nasil yapilir?
    1)Method isimleri ayni olmalidir
    2)Method parametreleri farkli olmalidir
      i)Parametre sayilari degistirilebilir
      ii)Parametremetrelerin data typelerini degistirebilirsiniz
      iii)Parametrelerin yerlerini degistirebilirsiniz
    3)Method Ismi + Parametreler = Method Sighature
      i)Method Signature disinda ne degistirirseniz degistirin Java
       o methodlari farkli kabul eder,önemsemez.
     */

    public static void main(String[] args) {

        add(3,5);
        add(3,5.0);
    }
        public static void add(int a, int b) {
            System.out.println(a + b);
        }

        public static void add(int a, int b, int c) {
            System.out.println(a + b + c);
        }
        public static void add(int a,double b){
            System.out.println(a+b);
        }
        public static void add(double a,int b){
            System.out.println(a+b);
        }
    }

