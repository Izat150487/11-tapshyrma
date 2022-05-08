package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("uch burchtuktun biyiktigin jana shirinasyn beriniz:");

        Triangle triangle = new Triangle();
        triangle.height = scanner.nextDouble();
        triangle.width = scanner.nextDouble();
        triangle.c = scanner.nextDouble();
        triangle.getarea();


        


    }
}
