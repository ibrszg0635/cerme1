package OCA_s01_s10.s01;

public class C01_PostIncrement {
    public static void main(String[] args) {

        //kod blogundaki num 1 degeri  9 olursa output ne olur ?

        int num1=9;
        int num2= num1++;  // once ++ gelmis >> preincerement   -- sonra  ++ gelmisse postincrement

        // once atama
        if(num2<10) {
            System.out.println(num2  + "  Hello Broer");
        } else {
            System.out.println(num1 + "Hello Gek");
        }







    }
}
