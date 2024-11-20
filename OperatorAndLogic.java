public class OperatorAndLogic {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        // Operator
        int addition = a + b; // 13
        int subtraction = a - b; // 7
        int multiplication = a * b; // 30
        float division = a / b; // 3.0
        float modulus = a % b; // 1
        int increment = ++a; // 10 -> 11
        int decrement = --a; // 11 -> 10

        boolean equal = a == b; // false
        boolean not_equal = a != b; // true
        boolean greater_than = a > b; // true
        boolean less_than = a < b; // flase
        boolean greather_than_or_equal = a >= b; // true
        boolean less_than_or_equal = a <= b; // false

        boolean t = true;
        boolean f = false;
        boolean and = t && f; // false
        boolean or = t || f; // true
        boolean not = !t; // false

    }
}