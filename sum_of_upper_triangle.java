// write a program the sum of upper triangle of m*n matrics 

import java.util.Scanner;
public class sum_of_upper_triangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows");
        int m = sc.nextInt();
        System.out.println("Enter columns");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter elements ");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = sc.nextInt();
            }

        }
        int sum = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i<j){
                    sum = sum +matrix[i][j];
                    
                }
            }
        }
        System.out.println("Sum of upper triangle is: " + sum);
        int sum1 = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(i>j){
                    sum1 = sum1 +matrix[i][j];
                    
                }
            }
        }
        System.out.println("Sum of lower triangle is: " + sum1);

    }
}