package com.infiniteskills.maven;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter none number \n");

        if (isNumeric(scanner.nextLine())) {
            System.out.println("The provided number is not valid !");
        } else {
            System.out.println("The provided String is valid !");
        }
        scanner.close();
    }

    private static boolean isNumeric(String s) {
        return StringUtils.isNumeric(s);
    }
}
