package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите координаты");
        String s = scan.nextLine();
        System.out.println("Ваши координаты:" + " " + s);
        scan.close();
    }
}
