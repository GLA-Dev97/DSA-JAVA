import java.util.Scanner;
import java.util.Arrays;

public class binary_search {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {12, 15, 20, 29, 34, 39, 4, 6, 35};

        Arrays.sort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
        // System.out.println(arr);

        System.out.println("Enter key value to search:");
        int key = sc.nextInt();

        int starting_index = 0;
        int last_index = arr.length - 1;
        int count = 0;

        while (starting_index <= last_index) {

            int mid_index = starting_index + (last_index - starting_index) / 2;
            count++;

            if (arr[mid_index] == key) {
                System.out.println("Key value found at index: " + mid_index);
                System.out.println("Number of comparisons: " + count);
                sc.close();
                return;
            }
            else if (arr[mid_index] < key) {
                starting_index = mid_index + 1;
            }
            else {
                last_index = mid_index - 1;
            }
        }

        System.out.println("Key value not found in the array.");
        System.out.println("Number of comparisons: " + count);

        sc.close();
    }
}
