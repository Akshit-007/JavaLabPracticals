import java.util.Scanner;

public class Fourth {
    // Quadratic equation
    // a(x^2)+b(x)+c=0;
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a");
        int a = input.nextInt();

        System.out.println("Enter b");
        int b = input.nextInt();

        System.out.println("Enter c");
        int c = input.nextInt();

        double ans;

        if (a == 0) {
            if (b == 0) {
                System.out.println("Any value of x will satisfy this equation");
            } else {
                ans = (c / b) * (-1);
                System.out.println("The value of x is : " + ans);
            }
        } else if (b == 0) {
            if ((c / a) * (-1) < 0) {
                System.out.println("Roots are imaginary");
            } else {
                double ans2;
                ans = Math.sqrt((c / a) * (-1));
                ans2 = (-1) * ans;
                System.out.println("The roots are : " + ans + " " + ans2);

            }
        } else {

            int val = (b * b) - (4 * a * c);
            if (val < 0) {
                System.out.println("Roots are imaginary");
            } else {
                double ans2;
                ans = ((-1 * b) + (Math.sqrt(val))) / (2 * a);
                ans2 = ((-1 * b) - (Math.sqrt(val))) / (2 * a);

                System.out.println("Roots are " + ans + " " + ans2);
            }
        }

        input.close();
    }

}
