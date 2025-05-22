import java.util.Scanner;

public class MethodOverloading {

    public static int add(int a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();
        System.out.println("Sum of two integers: " + add(int1, int2));

        System.out.print("Enter two double values: ");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();
        System.out.println("Sum of two doubles: " + add(double1, double2));

        System.out.print("Enter three integers: ");
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();
        int int5 = scanner.nextInt();
        System.out.println("Sum of three integers: " + add(int3, int4, int5));

        scanner.close();
    }
}
