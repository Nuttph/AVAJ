import java.util.Scanner;
public class Nuttaphon_6630202171 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of factorial : ");
        int n = input.nextInt();
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + n + " is " + factorial);

    }
}