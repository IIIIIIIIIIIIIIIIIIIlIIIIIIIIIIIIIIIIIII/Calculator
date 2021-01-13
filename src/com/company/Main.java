package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите номер операции:");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");

        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();

        System.out.println("Введите первое число:");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите второе число:");
        int secondNumber = scanner.nextInt();

        int result;
        if (operation == 1)
            result = firstNumber + secondNumber;
        else if (operation == 2)
            result = firstNumber - secondNumber;
        else if (operation == 3)
            result = firstNumber * secondNumber;
        else
            result = firstNumber / secondNumber;

        scanner.close();

        System.out.println("Ответ: " + result);


    }
}
