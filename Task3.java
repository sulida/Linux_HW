package Algorutmus;

public class Task3 {
//    Написать функцию sum(n, m), вычисляющую сумму тех чисел в диапазоне от 1 до n, которые делятся на m.
//Например:
//sum(7, 2) = 2 + 4 + 6 = 12
//sum(12, 3) = 3 + 6 + 9 + 12 = 30
//Решить задачу:
//а) через цикл
//б) через рекурсию

    public static void main(String[] args) {
        int n = 7;
        int m = 2;
        int result = dosum(n, m);
        System.out.println("Sum from 1 to " + n + " / " + m + " = " + result);

        int result2 = sumWithRecursion(n, m);
        System.out.println("Sum with recursion: " + result2);
    }

    public static int dosum(int n, int m) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int sumWithRecursion(int n, int m) {
        if (n == 0) {
            return 0;
        }
        if (n % m == 0) {
            return n + sumWithRecursion(n - 1, m);
        } else {
            return sumWithRecursion(n - 1, m);
        }
    }
}
    