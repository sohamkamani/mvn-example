package com.sohamkamani;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.printf("Hello World! %d", Calculator.add(4, 5));
    }

    public static int add(int n1, int n2) {
        return n1 + n2;
    }
}
