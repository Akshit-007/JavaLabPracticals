import java.util.*;

public class Sixth {

    public static int Longest_element(int[] arr) {
        HashSet<Integer> S = new HashSet<Integer>();

        for (int i = 0; i < arr.length; ++i)
            S.add(arr[i]);

        int ele = 1;
        for (int i = 0; i < arr.length; ++i) {
            if (S.contains(arr[i])) {
                int present = 1;
                if (!S.contains(arr[i] - 1)) {
                    int j = arr[i] + 1;
                    while (S.contains(j)) {
                        present++;
                        j++;
                    }
                    ele = Math.max(ele, present);
                }
            }
        }
        return ele;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of an array :");
        int n = input.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int ans = Longest_element(arr);

        System.out.println(ans);

        input.close();
    }
}
