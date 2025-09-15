package me.code;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    // Hej från andra terminalen!
    // ABC
    // BANAN

    public static void main(String[] args) {
        Shop[] shops = Shop.generateShops();

        double balance = 50000.0;
        // 123

        try {
            shops[0].buyProduct(null, balance, 1000);
        } catch (NoSuchElementException exception) {
            System.out.println("Produkten hittades inte!");
        } catch (ProductInsuffientStockException exception) {
            System.out.println("Produkten finns inte kvar!");
        } catch (InsufficientFundsException exception) {
            System.out.println("Du har inte tillräckligt med pengar på saldot.");
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println("Något oväntat gick snett!");
        }
    }

    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv in din ålder: ");
        String input = scanner.nextLine();

        try {
            int i = Integer.parseInt(input);
            System.out.println("Du är " + i + " år gammal.");
        } catch (Exception exception) {
            System.out.println("Du måste skriva in ett nummer!");
            main2(args);
        }

        int index;
        int value;
        try {
            index = scanner.nextInt();
            value = scanner.nextInt();
        } catch (Exception exception) {
            System.out.println("Du måste skriva in ett nummer!");
            return;
        }

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

        // 1. Förstå målet och resultatet
        //      1. Vad borde hända?
        //      2. Vad vill du ska hända?
        // 2. Förstå problemet
        //      1. Vad är det för fel?
        //      2. Vad är det för värde(n)?
        //      3. Vad är det för kod?
        // 3. Hitta problemet
        //      1. Var händer felet?
        //      2. Hur händer felet?
        // 4. Lös problemet
        //      1. Vad borde hända?
        //      2. Vad vill du ska hända?
        //      3. Vilken del ska bort?
        //      4. Vilken del ska vi lägga till?
        //      5. Behöver vi ändra något?

        // Tips:
        // 1. Sök på felet
        // 2. Fråga AI
        // 3. Använd debug prints
        // 4. Ta bort kod tills felet försvinner
        // 5. Använd stacktrace
    }
}
