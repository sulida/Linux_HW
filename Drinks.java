package homework;

import java.util.Scanner;

//Представьте, что вы находитесь перед кофейным аппаратом, у него 4 кнопки, которые соответствуют напиткам: эспрессо, американо, капучино, обычная вода.
//Напишите алгоритм, который будет предлагать клиенту выбрать напиток, нажатие кнопки (или считывания цифры, например) и в консоль будет отображаться результат приготовления (например, "Ваш <напиток> готов").
//
//Сделайте 2 метода, в одном из них будет реализован формат if-else, в другом - switch

public class Drinks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pls your drink 1, 2, 3,4: ");
        int drink = scanner.nextInt();

        String result = switch (drink) {
            case 1 -> "Your drink 1 is ready";
            case 2 -> "Your drink 2 is ready";
            case 3 -> "Your drink 3 is ready";
            case 4 -> "Your drink 2 is ready";
            default -> "You entered a wrong number of drink";
        };
        System.out.println(result);



        switch (drink) {
            case 1:
                System.out.println("Your drink 1 is ready");
                break;
            case 2:
                System.out.println("Your drink 2 is ready");
                break;
            case 3:
                System.out.println("Your drink 3 is ready");
                break;
            case 4:
                System.out.println("Your drink 4 is ready");
                break;
            default:
                System.out.println("You entered a wrong number of drink");
        }

//        String result = switch (drink) {
//            case 1 -> "Your drink 1 is ready";
//            case 2 -> "Your drink 2 is ready";
//            case 3 -> "Your drink 3 is ready";
//            case 4 -> "Your drink 2 is ready";
//            default -> "You entered a wrong number of drink";
//        };
//        System.out.println(result);

        if (drink == 1) {
            System.out.println("Your drink 1 is ready");
        } else {
            if (drink == 2) {
                System.out.println("Your drink 2 is ready");
            } else {
                if (drink == 3) {
                    System.out.println("Your drink 3 is ready");
                } else {
                    if (drink == 4) {
                        System.out.println("Your drink 4 is ready");
                    } else {
                        System.out.println("You entered a wrong number of drink");
                    }

                }
            }
        }
    }
}