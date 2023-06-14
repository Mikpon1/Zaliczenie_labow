import java.util.Scanner;

// -Napisz program, który sumuje liczby nie parzyste. Liczba (5) kończy wprowadzanie danych.

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int liczba;

        do {
            System.out.print("Podaj wartość liczbową: ");
            liczba = scanner.nextInt();

            if (liczba % 2 != 0) {
                suma += liczba;
            }
        } while (liczba != 5);

        System.out.println("Suma liczb nieparzystych: " + suma);
    }
}