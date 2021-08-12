import java.util.Scanner;

public class Third {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter side 1");
        int a = input.nextInt();

        System.out.println("Enter side 2");
        int b = input.nextInt();

        System.out.println("Enter side 3");
        int c = input.nextInt();

        double s = (a + b + c) / 2;

        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("The area of triangle is :" + area);

        input.close();
    }
}
