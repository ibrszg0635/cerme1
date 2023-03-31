package OCA_s01_s10.s01;

public class C06_dataCasting {
   // Asagidaki kodda yapilacak hangi degisiklikle kod calisir. Uyan tum siklar sec
    long x=10;
    //int y = 2 * x;

    //long x = 10;
    //long y = 2 *  x;


        /*
        A. Degisiklige gerek yok; oldugu gibi calisir.       >>  Yanlis
        B. 9.satirdaki x'i int'a cast etmek.                 >>  dogru
        C. Change the data type of x on line 8 to short.     >> dogru
        D. Cast 2 * x on line 9 to int.                      >> dogru
        E. Change the data type of y on line 9 to short.     >> yanlis
        F. Change the data type of y on line 9 to long.      >>  dogru
         */
    // data castin >> primitive  ve sayisal data turleri verilerini  birbirine cevirir
    // byte    short  int  long  flaat    double
    //  8       16     32
    // kucuk veri , buyuk dataya sigacaktir

    byte       sayi1 =15;
    short      sayi2=sayi1;
 //  variable < > deger
//    kab     < >  malzeme


    long sayi3= 1500;
    double sayi4 = sayi3;

    int sayi5=65;
   //  short sayi6=sayi5 ;  altini cize sorumluluk alirsan devam eder. sorumlulk asagidaki gibi
    short sayi6=(short) sayi5;



}
