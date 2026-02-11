//input take a odd numbeer n = 54969
//output count of digits = 4
//outtput sum of digits = 33
//output middle digit = 9



// public class NumberAnal {
//     public static void main(String[] args) {

//         int n = 54969;
//         int count = 0;
//         int sum = 0;
//         int middleDigit = 0;
//         int temp = n;

        
//         while (temp != 0) {
//             int digit = temp % 10;
//             sum += digit;
//             count++;
//             temp /= 10;
//         }

    
//         int middleIndex = count / 2;
        
//         temp = n;
//         for (int i = 0; i <= middleIndex; i++) {
//             middleDigit = temp % 10;
//             // System.out.println(middleDigit);
//             temp /= 10;
//         }
        
        
//         System.out.println("Count of digits = " + count);
//         System.out.println("Sum of digits = " + sum);
//         System.out.println("Middle digit = " + middleDigit);
//         if (middleDigit %2 ==0){
//             System.out.println("Even");
//         }
//         else{
//             System.out.println("Odd");
//         }
//     }
    
// }

// perform insertion operation of an array 
// enter the elemet in empty array on desire 
// which is at the beginning , middle , end
// enter there position where you want to insert the element and index replace the on that index
// print the array after insertion

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