import java.util.Scanner;

public class Second {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the purchase price");
        int purchase_price = input.nextInt();

        System.out.println("Enter the purchase year");
        int years_of_service = input.nextInt();

        double deprication = (purchase_price / years_of_service);

        System.out.println("The deprication is :" + deprication);

        input.close();
    }
}
