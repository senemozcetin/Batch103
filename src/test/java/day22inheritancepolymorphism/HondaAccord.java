package day22inheritancepolymorphism;

public class HondaAccord extends Honda{

        /*
        1)Siz Class olusturdugunuzda Java otomatik olarak size gorunmez bir constructor verir
        cunku Java Class in bir kalip oldugunu ve object olusturmak icin yaratildigini ve object olusturmak icin
        constructor in sart oldugunu bilir
        2)Java nin otomatik olarak olusturdugu bu gorunmez constructor a "default constructor" denir
        3) Siz kendiniz herhangi bir constructor olusturdugunuzda Java "Default constructor" i siler
        4)Bir Class da birden fazla constructor olabilir
        5)"this" keyword "Bu Class" anlamindadir. this.price demek bu Class taki price isimli variable demektir
           "this.price" syntax i constructor larin icinde kullanilir.
        6)Constructor kullanarak variable lar uzerinde yaptiginiz degisimler sadece Object uzerindeki
        variable larin degerlerini degistirir. Class daki variable degerlerini degistiremez
         */
    public int price;
    public int year;
    public String make;
    public String model;


        public HondaAccord(){
            
        }
        public HondaAccord(int price){
            this.price=price;

        }
        public HondaAccord(int price,int year){

            this.price=price;
            this.year=year;
            System.out.println("Honda Accord Constructor");

        }
        public HondaAccord(int price,int year,String make, String model){
            this.price=price;
            this.year=year;
            this.make=make;
            this.model=model;

        }
    }


