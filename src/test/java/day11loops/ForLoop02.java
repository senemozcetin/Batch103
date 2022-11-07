package day11loops;

public class ForLoop02 {
    public static void main(String[] args) {

        // bir string deki 'm' karakteri haric tum karakterleri yazdiriniz
        // Andromeda==> Androeda
        String str = "Andromeda";


        //1.YOL:
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c!='m' && c!='M'){
                System.out.print(c);
            }
        }


        //2.YOL:
        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if (c == 'm') {
                continue;//bosveeeeeeerr
            }
            System.out.println(c);
        }

        System.out.println();


            //Example 2: 1'den 100 kadar 6 ile bolunenler haric tum tamsayilari ekrana yazdiriniz

            for (int i = 1; i<101; i++){
                if (i%6==0){
                    continue;
                }
                System.out.println(i+ " ");
            }

        System.out.println();

            //Example 3: Size verilen bir string deki 'm' den onceki karakterleri yazdiriniz

        String s="Luxemburg";


        for(int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'm') {
                break;
            }
            System.out.print(c);
        }
















        }
}