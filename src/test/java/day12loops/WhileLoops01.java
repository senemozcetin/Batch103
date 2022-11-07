package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
//        //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz
//        // 1.yol:
//        for (int i = 3; i < 11; i++) {
//            System.out.print(i + " ");
//        }
//        //2.yol:
//
//        int i = 3;
//        while (i < 11) {
//
//            System.out.print(i + " ");
//
//            i++;
//        }
//        System.out.println();
//
//        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
//
//        int k = 17;
//        while (k > 3) {
//
//            if (k%2==0){
//                System.out.print(k + " ");
//            }
//            k--;
//
//        }
//
//
//        //Example 3 : 12 den 14 ye kadar sayilarin tpolamini veren kodu yaziniz...
//
//        int sum = 0;
//
//        int m = 12;
//        while (m<15){
//            sum = sum + m;
//
//            m++;
//        }
//        System.out.println(sum);
//
//
//        //Example 4: Size verilen bir tamsayini rakamlari toplamini ekrana yazdiran kodu yaziniz
//        int sonuc = 0;
//        int sayi = 543;
//
//        while(sayi>0) {
//            sonuc = sonuc + sayi%10;
//            sonuc =sayi/10;
//        }
//        System.out.println(sonuc);
//
//        //Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
//        Scanner input =new Scanner(System.in);
//        System.out.println(" Lutfen bir sayi giriniz..");
//        int s = input.nextInt();
//        int n=1;
//
//        while (n <11){
//            System.out.println(s+ "*"+n + "="+ s*n);
//            n++;

        Scanner scan= new Scanner(System.in);
        System.out.println("Uc basamakli bir sayi giriniz");
        int num= scan.nextInt();
        int sonuc= 0;
        for (int i=num; i>0 ; i=i/10){
            sonuc= sonuc+ i%10;
        }
        System.out.println(sonuc);

    }
}


















