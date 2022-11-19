package day30collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    /*
    LinkedHashSet ler elemanlari ekleme sirasina (Insertion Order) gore yerlestirirler.
     LinkedHashSet elemanlari siralamakta zaman harcadigi icin HashSet lere gore yavas calisir.
     */
    public static void main(String[] args) {

        LinkedHashSet<String>emails= new LinkedHashSet<>();
        emails.add("abc@email.com");
        emails.add("bca@email.com");
        emails.add("asc@email.com");
        emails.add("bde@email.com");
        emails.add("axy@email.com");
        System.out.println(emails);//[abc@email.com,bca@email.com ,asc@email.com ,bde@email.com ,axy@email.com]
    }
}
