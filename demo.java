import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + c);
        input.close();
    }
}