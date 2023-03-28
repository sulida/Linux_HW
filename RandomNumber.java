package homework;

import java.util.Random;
//Создать программу, выводящую на экран случайно сгенерированное трёхзначное целое число и его наибольшую цифру

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int rn1 = random.nextInt(100, 1000);
        System.out.println("The random three-digit number is " + rn1);
        String str = Integer.toString(rn1);
        int r1 = Integer.parseInt(String.valueOf(str.charAt(0)));
        int r2 = Integer.parseInt(String.valueOf(str.charAt(1)));
        int r3 = Integer.parseInt(String.valueOf(str.charAt(2)));

        System.out.println();


        if (r1 >= r2 && r1 >= r3) {
            System.out.println("The largest digit in this number is " + r1);
        }
        else if (r2 >= r1 && r2 >= r3) {
            System.out.println("The largest digit in this number is " + r2);
        }
        else System.out.println("The largest digit in this number is " + r3);
        }
    }
