public class Task_2 {
    //2. Даны 4 числа, надо найти наибольшее. if использовать нельзя, код должен быть не больше 10 строк 2, 4, 5, 3	5

    public static void main(String[] args) {
        int[] arr = {10,2,8,19,5};
        int a = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            while (a < arr[i]) {
                a = arr[i];
            }
        }
        System.out.println(a);
    }
}
