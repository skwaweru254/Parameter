package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(args[0]);

        Scanner ready = new Scanner(System.in);

        int a = ready.nextInt();
        String name = ready.nextLine();

        System.out.println(a + name);

    }
}