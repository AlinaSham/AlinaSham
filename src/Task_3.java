public class Task_3 {
//3. Проверить, является ли фраза палиндромом	"А роза упала на лапу Азора"	true

    public static void main(String[] args) {
        String ar = ("А роза упала на лапу Азора");
        String b = ar.toLowerCase().replaceAll(" ","");
        int c = b.length();
        int count = 0;
        for (int i = 0; i < c / 2; i++) {
            if (b.charAt(i) == b.charAt(c - 1 - i)) {
                count ++;
            }
        }
        boolean b1 = (count >= b.length() / 2) ? true : false;
        System.out.println(b1);
    }
}
