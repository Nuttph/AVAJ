public class UseLoop {
    public static void main(String[] args) {
        // For loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello " + i);
        }
        // Nested loops
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i + " : " + j);
            }
            System.out.println("");
        }

        // For Each Loop
        String[] car = { "BMW", "Ford", "Mazda" };
        for (String i : car) {
            System.out.println(i);
        }

        // While Loop
        int w = 0;
        while (true) {
            System.out.println("Hello While! " + w);
            if (w >= 10) {
                break;
            }
            w++;
        }

        // Do While Loop
        int d = 0;
        do {
            System.out.println(d);
            d++;
        } while (d <= 10);

    }
}
