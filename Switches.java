public class Switches {
    public static void p(String text) {
        System.out.println(text);
    }

    public static void main(String[] args) {
        int choice = 2;
        switch (choice) {
            case 1:
                p("This is One");
                break;
            case 2:
                p("This is Two");
                break;
            default:
                p("It Default!");
        }
    }
}
