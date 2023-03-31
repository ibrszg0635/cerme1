package OCA_s01_s10.s01;

public class C02_Ternary {
    public static void main(String[] args) {
        // BU KOD BLOGU CALISINCA  OUTPUT NE ?

        int x=5;
        System.out.println(x>2 ? x <4 ? 10:8 :7 );
        // veri sayi tek yada cift oldugunu yazdiran kod

        int sayi= 20;
        if (sayi%2==0){
            System.out.println("sayi cift sayidir");
        } else {
                System.out.println("sayi tek sayidir");
            }
        System.out.println(sayi%2==0 ? "sayi cift sayidir" : "Sayi tek sayidir");
        // if ya da else kullanmadan tek satirda yapilabilir

        // java her daim soldan saga ve yukardan asagiya calisir
    }
}





