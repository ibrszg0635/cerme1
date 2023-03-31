package OCA_s01_s10.s01;

public class C03_switchCase {
    public static void main(String[] args) {

        // switchCase = yer degistirme  -  char grade = karakter derecesi

       final char a= 'A', d= 'D';  // final keyword varable in son degerini belirler

        char grade = 'B';
        switch (grade) {
            case  a:
            case 'B':
                System.out.print("great");
            case  'C':
                System.out.print("good"); break;

            case d :
            case 'F': System.out.println("not good");
        }


    }
}
