public class UseArray {
    public static void main(String[] args) {
        // Array
        String[] color = { "red", "blue", "yellow", "white" };
        System.out.println(color); // [Ljava.lang.String;@5ca881b5
        System.err.println(color.length); // 4
        System.out.println(color[0]); // red
        color[0] = "No red";
        System.out.println(color[0]); // No red

        int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(number.length); // 9

        // Multidimensional Arrays
        int[][] two_d = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(two_d); // [[I@24d46ca6
        System.out.println("2D = " + two_d.length); // 2
    }
}
