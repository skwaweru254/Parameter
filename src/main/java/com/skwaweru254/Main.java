package com.skwaweru254;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Primitive obj = new Primitive();

        System.out.println(obj);

        int a = 8_000_000;

        System.out.println("Underscore are ignored, a="+a);

        //user input
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        System.out.println("Input from the previous line :" +name);

        String b = input.next();

        System.out.println("Input the previous first word :" +b);






    }
}