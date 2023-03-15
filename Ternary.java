import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter pls number: ");
        int a = scanner.nextInt();

        System.out.println(a / 3);
        System.out.println(a % 3);

        int tmp1 = a / 3;
        int tmp1_ = a % 3;

        int tmp2 = tmp1 / 3;
        int tmp2_ = tmp1_ % 3;

        int tmp3 = tmp2 / 3;
        int tmp3_ = tmp2_ % 3;

        System.out.println("Ternary number is " + tmp3_ + "" + tmp2_ + "" + tmp1_);


//        int s = 23;
//        int s3 = 212;
//
//        System.out.println(23 / 3);
//        System.out.println(23 % 3);  //2
//        System.out.println(7 / 3);
//        System.out.println(7 % 3);    //1
//        System.out.println(2 / 3);
//        System.out.println(2 % 3);   //2


    }
}
