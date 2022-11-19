package day30collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {
    /*
    Ilk giren elemani ilk kullanmak(First in First Out ==>FIFO) gerektiginde  Queue en iyi secimdir.
    Queue da elemanlar "insertion order" a gore dizilirler
    Queue da peek(), element(), remove(), gibi ilk elemani ilgilendiren bircok  method vardir
    offer() methodu kapasite kontrolu yapildiktan sonra eleman ekleme durumlarinda kullanilir. boolean verir. 3 tip exception atar
     */
    public static void main(String[] args) {

        Queue<String> wareHouse = new LinkedList<>();
        wareHouse.add("Milk");
        wareHouse.add("Meet");
        wareHouse.add("Bread");
        wareHouse.add("Honey");
        wareHouse.add("Tomatoes");

        System.out.println(wareHouse);//[Milk, Meet, Bread, Honey, Tomatoes]

        wareHouse.offer("Patatoes");
        System.out.println(wareHouse);//[Milk, Meet, Bread, Honey, Tomatoes, Patatoes]

    }
}
