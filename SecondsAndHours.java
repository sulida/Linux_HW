package homework;

import java.util.Random;

//Вывод случайного числа от 0 до 28800 (секунд) в секундах и в полных часах

public class SecondsAndHours {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(0, 28801);

            System.out.println(n + " seconds left");
        if (n >= 7200)
            System.out.println(n / 3600 + " hours left");

        if (n >= 3600 && n < 7200)
            System.out.println("One hour left");
        if (n < 3600)
            System.out.println("Less than an hour left");

        }



}
