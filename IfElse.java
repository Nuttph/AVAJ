public class IfElse {
    public static void main(String[] args) {

        // basic
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println("a = b"); // false
        } else {
            System.out.println("a != b"); // true
        }

        if (a == b) {
            System.out.println("a = b"); // false
        } else if (a > b) {
            System.out.println("a > b"); // false
        } else if (a < b) {
            System.out.println("a < b"); // true
        } else {
            System.out.println("a != b"); // don't run
        }

        // Break and Continue
        for (int x = 1; x <= 10; x++) {
            if (x <= 5) {
                System.out.println("Continue!!");
                continue;
            } else {
                System.out.println("Break!!");
                break;
            }
        }

        // advance short condition
        String alert = a == b ? "a == b" : "a != b";
        System.out.println(alert); // a != b
    }
}
