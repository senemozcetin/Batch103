package day30collections;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet01 {
    /*
    TreeSet tekrarsiz elemanlari "alfabetik" veya "kucukten buyuge"(Naturel Order) dizer.

    Tree cokkk yavas calisir.

    Note: Tekrarsiz elemanalari naturel order da depolamak icin TreeSet kullanmak mantiklidir ama TreeSet ler cook yavas
          calistigi icin biz   elemanlari once HashSet depolariz sonra HashSet'i TreeSet e cevirerek
           TreeSet in yavas olma problemini asmis oluruz.(Interview sorusu!!!)
     */
    public static void main(String[] args) {

        //Example 1: 8 tane String 8 tane unique String elemani alfabetik sirada depolayiniz
        //1.yol:
        Long start1 = LocalTime.now().toNanoOfDay();
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("y@gmail.com");
        emails.add("c@gmail.com");
        emails.add("m@gmail.com");
        emails.add("b@gmail.com");
        emails.add("z@gmail.com");
        emails.add("k@gmail.com");
        emails.add("d@gmail.com");
        System.out.println(emails);//[a@gmail.com, b@gmail.com, c@gmail.com, d@gmail.com, k@gmail.com, m@gmail.com, y@gmail.com, z@gmail.com]
        Long end1 = LocalTime.now().toNanoOfDay();
        System.out.println(end1-start1);//9994800

        //2.yol:
        HashSet<String> myEmails = new HashSet<>();
        myEmails.add("a@gmail.com");
        myEmails.add("y@gmail.com");
        myEmails.add("c@gmail.com");
        myEmails.add("m@gmail.com");
        myEmails.add("b@gmail.com");
        myEmails.add("z@gmail.com");
        myEmails.add("k@gmail.com");
        myEmails.add("d@gmail.com");
        TreeSet myEmailsSorted = new TreeSet<>();// HashSet'i TreeSet'e çevirmek için bu kodu yazdık.cunku hashsetin
                                                  //hizindan faydalandim sonra treeset ile siraladim boylece kod hizli calisti
        System.out.println(myEmailsSorted);
        System.out.println(myEmails);
        Long end2 = LocalTime.now().toNanoOfDay();
        System.out.println(end2- end1);//2995900





    }
}
