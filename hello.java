package com.company;

import java.util.Scanner;

public class hello {

    public static void main(String[] args) {
        System.out.println("Загадайте число от 0 до 2^31 - 1");
        Scanner in = new Scanner(System.in);
        double left_boarder = 0, right_boarder = Math.pow(2, 31);
        while (true) {
            double middle = Math.floor((left_boarder + right_boarder) / 2);
            System.out.printf("Данное значение %.0f меньше ли вашего задуманного числа (0) или больше (1) или же равно (2)? \n", middle);
            double input = in.nextDouble();
            if (input == 0) {
                left_boarder = middle - 1;
            }
            else if (input == 1){
                right_boarder = middle + 1;
            }
            else if (input == 2) {
                System.out.println("Ваше загаданное число - " + middle);
                break;
            }
        }
    }
}