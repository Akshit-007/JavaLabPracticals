import java.util.*;

public class Fifth {

    public static int removeDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();

        // adding elements to LinkedHashSet
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);

        return set.size();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of an array :");
        int n = input.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int ans = removeDuplicate(arr);

        System.out.println(ans);

        input.close();
    }
}
