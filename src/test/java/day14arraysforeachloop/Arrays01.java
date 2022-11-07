package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        // Array lerin icine "primitive data type" leri ve "reference'(adres) ler konabilir

        String str[]= new String[3];

        str[0]= "Java";
        str[1]= "did";
        str[3]= "suprise you";
        System.out.println(Arrays.toString(str));

        //String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz

        String arr[]= {"Jane","Mark","Christopher", "Tom","Ali", "Rojda"};

        for (String w: arr){
            System.out.println(w+ " ");
            if (w.equals("Tom")){
                break;
            }
        }


        //String bir Array olusturunuz ve "Tom" ve "Jane" haric tum elemanlari ekrana yazdiriniz
        String brr[]= {"Jane","Mark","Christopher", "Tom","Ali", "Rojda"};

        for (String w : brr){
            if (w.equals("Jane")&& w.equals("Tom")){
                continue;
            }
            System.out.println(w+ " ");
        }



    }
}
