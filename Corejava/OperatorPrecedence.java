public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + result1);
        System.out.println("Explanation: Multiplication (*) has higher precedence than addition (+), so 5 * 2 is evaluated first (10), then added to 10, resulting in 20.\n");

        
        int result2 = 100 / 5 + 3 * 4 - 2;
        System.out.println("100 / 5 + 3 * 4 - 2 = " + result2);
        System.out.println("Explanation: Division and multiplication have the same precedence and are evaluated left to right:\n" +
                           "100 / 5 = 20\n" +
                           "3 * 4 = 12\n" +
                           "Then addition and subtraction left to right: 20 + 12 = 32, 32 - 2 = 30.");
    }
}
