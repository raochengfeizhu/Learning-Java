package com.oop.demo1;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        outPut();
    }

    private static void outPut() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int maxAndMin[] = {10, 20};
        System.out.println(maxAndMin[0]);
    }
}
