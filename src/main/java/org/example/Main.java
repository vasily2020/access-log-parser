package org.example;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Vvedite chislo:");
        int first_number = new Scanner(System.in).nextInt();
        System.out.println("Vvedite chislo:");
        int second_number = new Scanner(System.in).nextInt();
        int summa = first_number + second_number ;
        int raznost = first_number - second_number ;
        int proizvedenie = first_number * second_number ;
        int chastnoe = 0;
        System.out.println("summa dvuh chisel ravna " + summa);
        System.out.println("raznost dvuh chisel ravna " + raznost);
        System.out.println("proizvedenie dvuh chisel ravna " + proizvedenie);

        }
    }