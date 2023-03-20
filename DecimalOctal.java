package com.auto;

public class DecimalOctal {
    public static void main(String[] args) {

        int a = 1144;

        System.out.println(1*Math.pow(10,3) + 1*Math.pow(10,2) + 4*Math.pow(10,1) + 4*Math.pow(10,0));

        int b = 1144;
        int b8 = 02170;
        System.out.println(b8);
        System.out.println(2*Math.pow(8,3) + 1*Math.pow(8,2) + 7*Math.pow(8,1) + 0*Math.pow(8,0));



        System.out.println(1144 / 8);
        System.out.println(1144 % 8);    //0

        System.out.println(143 /8);
        System.out.println(143 % 8);     //7

        System.out.println(17 / 8);
        System.out.println(17 % 8);      //1

        System.out.println(2 / 8);
        System.out.println(2 % 8);        //2

        System.out.println();

        int c = 978;
        int c8 = 1722;
        System.out.println(c8);
        System.out.println(1*Math.pow(8,3) + 7*Math.pow(8,2) + 2*Math.pow(8,1) + 2*Math.pow(8,0));

        System.out.println(978 / 8);
        System.out.println(978 % 8);     //2

        System.out.println(122 / 8);
        System.out.println(122 % 8);      //2

        System.out.println(15 /8);
        System.out.println(15 % 8);       //7

        System.out.println(1 / 8);
        System.out.println(1 % 8);        //1

        System.out.println();
        int d = 12;
        int d8 = 014;
        System.out.println(d8);
        System.out.println(1*Math.pow(8,1) + 4*Math.pow(8,0));


        System.out.println(12 / 8);
        System.out.println(12 % 8);    //4

        System.out.println(1 / 8);
        System.out.println(1 % 8);      //1

    }
}
