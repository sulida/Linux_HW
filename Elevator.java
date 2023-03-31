package homework;

import java.util.Scanner;
//Лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж. Лифт сломан, работает некорректно. Каждый раз он поднимается на N этажей и спускается на M этажей. Если на последнем подъёме лифт превысил количество этажей, то считается что лифт поднялся на самый верх. Найдите количество подъёмов, которые понадобятся лифту.
//
//Параметры H, M, N можно получить через Scanner. Лучше всего сформировать отдельный метод для расчётов, куда будут отправляться параметры. Добейтесь универсальности Вашего алгоритма через наиболее подходящий цикл и другие известные вам конструкции

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pls number of floors in the building: ");
        int h = scanner.nextInt();
        System.out.println("Enter pls number of floors the elevator goes up: ");
        int n = scanner.nextInt();
        System.out.println("Enter pls number of floors the elevator goes down: ");
        int m = scanner.nextInt();
        int count = 0;
        int floor = 1;

        if (h > 0 && n >= 0 && n <= h && m >= 0 && m <= h) {

            while (floor < h) {
                int a = floor + n;
                floor = a - m;
                count++;
            }
            System.out.println(count);
        }
        else {
            System.out.println("You entered a wrong data");
        }
    }
}

