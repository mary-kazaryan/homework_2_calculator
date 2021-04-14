package com.company;

public class Calculator {

    public static void main(String[] args) {
        // Составьте программу, выводящую на экран квадраты чисел от 10 до 20 включительно.

        int number = 10;
        while (number <=20) {
            int sum = number * number;
            System.out.println(sum);
            number++;
        }
    }
}
