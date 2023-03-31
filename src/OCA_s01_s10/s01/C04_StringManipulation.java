package OCA_s01_s10.s01;


 // 8 ve 9. satirlardaki kodlara 10. satira hangi kod eklenirde ``Equal`` yazdirilir?

public class C04_StringManipulation {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
        // ?
       // str1.toLowerCase(); // str1 e atama yok. Dus strl kalici degismez
        if (str2.equals((str1.toLowerCase()))) {

           // if (str1 == str2) // Stringde == kulanmamayi tercih edilir
            // bunun yerine equals methodu kullanilir
            // == hem icerik ve hem de referansa bakar.



                System.out.println("Equal");
            } else {
                System.out.println("Not Equal");
            }


        }
    }

