package me.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in din ålder: ");
        String input = scanner.nextLine();

        try {
            int i = Integer.parseInt(input);
            System.out.println("Du är " + i + " år gammal.");
        } catch (Exception exception) {
            System.out.println("Du måste skriva in ett nummer!");
            main(args);
        }
        
        int index = scanner.nextInt();
        int value = scanner.nextInt();

        int[] numbers = new int[10];
        if (index < numbers.length && index >= 0) {
            numbers[index] = value;
        } else {
            System.out.println("Index måste vara mellan 0 och 9");
        }

        // 1. Exceptions
        // 2. Try/catch
        // 3. Validering
        // 4. Debugging
    }
}