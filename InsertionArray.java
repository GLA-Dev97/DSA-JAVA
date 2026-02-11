// perform insertion operation of an array 
// enter the elemet in empty array on desire 
// which is at the beginning , middle , end
// enter there position where you want to insert the element and index replace the on that index
// print the array after insertion

import java.util.Scanner;
public class InsertionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size + 1];
        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter the element to insert: ");
        int element = sc.nextInt();
        System.out.println("Enter the position to insert the element (0 to " + size + "): ");
        int position = sc.nextInt();
        if (position < 0 || position > size) {
            System.out.println("Invalid position!");
        } else {
            for (int i = size; i > position; i--) {
                arr[i] = arr[i - 1];
            }
            arr[position] = element;

            System.out.println("Array after insertion:");
            for (int i = 0; i <= size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    
}

// import java.util.Scanner;
// public class InsertionArray {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Entre the size of Array: ");
//         int size = sc.nextInt();
//         int arr[] = new int[size + 1];
//         System.out.println("Enter the elements of Array: ");
//         for (int i = 0; i < size; i++) {
//             arr[i] = sc.nextInt();

//         }
//         System.out.println("Enter the element to insert: ");
//         int element = sc.nextInt();
//         System.out.println("Enter the position to insert the element (0 to " + size + "): ");
//         int position = sc.nextInt();
//         if (position < 0 || position > size) {
//             System.out.println("Invalid position!");
//         } else {
//             for (int i = size; i > position; i--) {
//                 arr[i] = arr[i - 1];
//             }
//             arr[position] = element;

//             System.out.println("Array after insertion:");
//             for (int i = 0; i <= size; i++) {
//                 System.out.print(arr[i] + " ");
//             }
//         }
//     }
    
// }
