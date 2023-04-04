package homework;

import java.util.Arrays;
import java.util.Random;

public class ArraysTask {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) (Math.random() * 10);
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("Массив 15-ти случайных чисел от 0 до 9: " + Arrays.toString(numbers));
        System.out.println("КОличество четных чисел в массиве: " + count);

    }
}

