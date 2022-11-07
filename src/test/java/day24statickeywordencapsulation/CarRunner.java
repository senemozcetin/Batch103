package day24statickeywordencapsulation;

public class CarRunner {
    /*
     Static Class Nedir?
     Değişiklik yaptığınızda tüm objeler etkileniyorsa ona static denir.
     Değişiklik sadece bazılarını etkiliyorsa buna non-static denir.
     Static olmayanlar objeye bağlı,static olan Class a bağlıdır.
     Static keyword Class a bağlanmış Class elemanlarıdır.Static keyword ve method variable'lara bağlı.
     Tüm objelerin ortak elemanıdır.Static Class elemanları her objenin ortak elemanıdır.
     Static lder üzerinde yapılan değişiklikler,
     tüm objelrden görülür.Static class elemanlarına class üzerinde ulaşılır,
     objeler üzerinde ulaşılması tavsiye edilmez.Static ler Override edilemez çünkü tüm objeler bundan etkilenir.

     */
//
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();

        //static variable'lara objeleri kullanarak ulasmak mumkun ama tavsiye edilmez.
        System.out.println(car1.counter);
        //statc variable'lara class isim kullanarak ulasilmalidir
        System.out.println(Car.counter);
        System.out.println(car1.price);

        System.out.println(car2.counter);
        System.out.println(car2.price);

        System.out.println(car3.counter);
        System.out.println(car3.price);

        System.out.println(car4.counter);
        System.out.println(car4.price);
    }
}