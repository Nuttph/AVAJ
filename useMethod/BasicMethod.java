package useMethod;

public class BasicMethod {

    // Medthod
    public static void main(String[] args) {
        name("Nuttaphon", "Popardit");
    }

    // Overloading คือมีชื่อตัวแปลเหมือนกัน
    public static int sum(int x, int y) {
        return x + y;
    }

    public static double multi(double x, double y) {
        return x * y;
    }

    // Recursion
    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void name(String name, String surname) { // void must "print" other data type must "return"
        System.out.println(name + " " + surname); // Nuttaphon Popardit
        System.out.println(sum(5, 7)); // 12
        System.out.println(multi(25.2, 6.4)); // 161.28
        int result = sum(10);
        System.out.println(result); // 55
    }
}
