package JAVA_1_forloop;

public class ForLoop {
    public static void main(String[] args) {
        // 1 den 100 e dek, 100 dahil tamsayilar toplami

        int toplam=0;
        for (int i = 1; i <=100 ; i++) {
            toplam+=i;

        }
        System.out.println(toplam);
        // verilen 2 sayinin ilkinden baslayip  2. dek
        // 3 er  3 er yazdir. (2. sayi saru saglamiyorsa yazdirmayabilir)

        int baslang=20;
        int bitis=61;
        for (int i = baslang; i <=bitis ; i+=3) {
        }

            for (int i = baslang; i <=bitis;  i+=9){
            System.out.println(i+ " ");


        }
        System.out.println("");

            //verilen sayidan geriye dogru ve 3 ile bolunebilen
        // sayilar yazdirn

        int input=100;
        for (int i = 100; i>=1 ; i--) {
            if(i%3==0) {
                System.out.println(i +  " ");
            }

        }
       // for (int i = 0; i > -10; i++) {
         //   System.out.println(i);      sonsuz kez calisacaktir , ki onceden uyarir

        }

            }

