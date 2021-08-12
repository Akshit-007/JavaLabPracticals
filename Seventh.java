import java.util.*;

public class Seventh {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length of rectangle : ");
        int a = input.nextInt();
        System.out.println("Enter width of rectangle : ");
        int b = input.nextInt();

        Area a1 = new Area(a, b);

        int ans = a1.returnArea();

        System.out.println("Area of rectangle is : " + ans);

        input.close();
    }
}

class Area {
    int length;
    int width;

    public Area(int a, int b) {
        length = a;
        width = b;
    }

    public int returnArea() {
        return length * width;
    }
}
