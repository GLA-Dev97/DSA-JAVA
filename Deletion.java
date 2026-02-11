//WAP to perform deletion operation on decalared array in an array.


import java.util.Scanner;
public class Deletion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,3,4,9,6,4};
        int n = arr.length;

        System.out.println("\n Enter the position ");
        int pos = sc.nextInt();
    
        for(int i = pos; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        n = n - 1;
        System.out.println("Array after deletion: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        sc.close();
    }
}