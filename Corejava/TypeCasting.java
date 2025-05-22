import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number (double): ");
        double doubleValue = scanner.nextDouble();
        int intValue = (int) doubleValue;
        System.out.println("Double value: " + doubleValue);
        System.out.println("After casting to int: " + intValue);

        System.out.print("Enter an integer: ");
        int anotherInt = scanner.nextInt();
        double castedDouble = (double) anotherInt;
        System.out.println("Integer value: " + anotherInt);
        System.out.println("After casting to double: " + castedDouble);

        scanner.close();
    }
}
