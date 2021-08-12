import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of a rectangle ");
        int length = input.nextInt();
        System.out.println("Enter the width of a rectangle ");
        int width = input.nextInt();

        int area = length * width;

        int perimeter = 2 * (length + width);
        double diagonal = Math.sqrt((length * length) + (width * width));
        System.out.println("The sum of rectangle is " + area);
        System.out.println("The perimeter of rectangle is " + perimeter);
        System.out.println("The length of diagonal of rectangle is " + diagonal);
        input.close();
    }
}