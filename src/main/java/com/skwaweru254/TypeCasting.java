package com.skwaweru254;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {
        //Condition 1, compatibility
        //Condition 2, from smaller datatype to bigger datatype

        Scanner input = new Scanner(System.in);

        float you = input.nextInt();

        System.out.println(you);

        //type casting from int to float

        int me = (int)(12.23f);

        System.out.println(me);

        //auto type promotion in the expression

        int d = 258;

        byte e = (byte)(d); // value of a % 254 = 2

        System.out.println(e);

        int g = 'n';

        System.out.println(g);

    }
}
