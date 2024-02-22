public class Task_1 {
        //1. Написать код, который принимает число и выдает true, если число является степенью двойки и false - если нет
        //  2,    256,  300,   500,  1024
        // true, true, false, false, true

    public static Boolean Logic(double a) {
        return Math.log(a) / Math.log(2) % 1 == 0 ? true : false;
    }

    public static void main(String[] args) {
        double[] ar = {2, 256, 300, 500, 1024};
        for (int i = 0; i < ar.length; i++) {
            System.out.print(Logic(ar[i]) + " ");
        }
    }
}