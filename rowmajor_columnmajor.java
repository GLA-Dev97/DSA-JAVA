//write a 2D matrics take as input size m*n print its row major order and coloumn major order

import java.util.Scanner;
public class rowmajor_columnmajor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int m = sc.nextInt();
        System.out.println("Enter columns");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Row Major Order:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        System.out.println("\nColumn Major Order:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
        
    }
}