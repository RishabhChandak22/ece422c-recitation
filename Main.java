import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Java Project");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your favorite number: ");
        int number = scanner.nextInt();

        System.out.println("Hello, " + name + "!");
        System.out.println("Your favorite number doubled is " + (number * 2) + ".");

        scanner.close();
    }
}
