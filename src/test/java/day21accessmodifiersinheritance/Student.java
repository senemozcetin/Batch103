package day21accessmodifiersinheritance;

public class Student {
    /*
        Access Modifier
        1)public
        2)protected
        3)default (Access modifier i default yapmak icin access modifier yazmayiz
        4)private

        Note: Access Modifier lari genisten dara dogru sayiniz
        public > protected > default > primitive
        Note: Access modifier lari birer birer aciklayiniz
             public ler her class ta kullanilabilir
             protected olanlar baska package den kullanilamazlar ancak baska package de child class icinden kullanilabilir
             default olanlar baska package den kullanilabilir. Default a package primitive de denir.
             Primitive olanlar sadece olusturulduklari class icinde kullanilabilirler
        Note: protected ile default farkini yaziniz
             protected olanlar baska package den kullanilamazlar ancak baska package de child class icinden kullanilabilir
             default olanlar baska package den kullanilabilir
        Note: Class lar icin hangi Access Modifier lar kullanilabilir
              public,default kullanilir ama protected ve primitive kullanilamaz

     */

    //public her class ten ulasilabilir
    public  String stdName = "TomHanks";

    //protected olanlar baska package den kullanilamazlar ancak baska package de child class icinden kullanilabilir
    protected String address= "Miami";

    //default olanlar baska package den kullanilabilir
    String email= "th@gmail.com";

    //Primitive olanlar sadece olusturulduklari class icinde kullanilabilirler
    private  String stdId= "20206517004";

}
