// WAP to find the multiple Same element then  delete all same element it from the declared array.

import java.util.Scanner;
public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {2,3,9,5,3,6};
        int n = arr.length;

        
        System.out.println("\n\nEnter the element to delete:");
        int ele = sc.nextInt();

        int count = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] != ele) {
                arr[count++] = arr[i];
            }
        }
        n = count; 

        System.out.println(" New Array ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}

