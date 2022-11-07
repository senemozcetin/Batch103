package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        List<String> names= new ArrayList<>();
        names.add("Tom");
        names.add("Tahsin");
        names.add("Thomas");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);//[Tom, Tahsin, Thomas, Trump, Taceddin]

        List<String>cities=new ArrayList<>();
        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");

        names.removeAll(cities);//removeAll() kullandigimizda ilk list degisir parantez ici degismez
        System.out.println(names);//[Tahsin, Thomas]
        System.out.println(cities);//[Trump, Tom, Taceddin]

        List<String>myNames=new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");
        boolean sonuc1 = names.containsAll(myNames);//Bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder.
                                                    // Hepsi varsa true, en az biri yoksa false verir
        System.out.println(sonuc1);// true

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");

        // "a" listinde "Shoes" elemaninin ilk gorunumunu siliniz
        a.remove("Shoes");
        System.out.println(a);


        // "a" listinde "Shoes" elemaninin tum gorunumlerini siliniz
        List<String>silinecekler=new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);//[TV, Radio, Laptop, Book]

        // Bir tane salary(maas) listi olusturun eger salary 10000 den az ise %20
        // 10000 ve 10000 den cok ise %10 zam yapiniz

        List<Double>salary= new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(20500.00);
        salary.add(20500.00);

        for (Double w: salary){
            if (w<10000){
                salary.set(salary.indexOf(w),w*1.2);
            }else {
                salary.set(salary.indexOf(w),w*1.1);
            }
        }
        System.out.println(salary);


        // Iki ArrayList in esit olup olmadigini kontrol eden kodu yazin
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('z');
        m.add('y');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.yol:
        int counter=0;
        for (int i=0; i<m.size(); i++){
            if (m.size()!=n.size()){
                System.out.println("Listler esit degildir");
                break;
            }
            if (m.get(i)!=n.get(i)){
                counter++;
                System.out.println("Listler esit degildir");
                break;
            }
        }
        if (counter==0){
            System.out.println("Listler esittir.");
        }

























    }
}
