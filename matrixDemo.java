// WAP TO PERFORM OPERATIONS ON MATRIX (2. Multiplication of two matrices)
import java.util.Scanner;
public class matrixDemo{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter row of 1st matrix:");
        int r1=sc.nextInt();
        System.out.println("Enter col of 1st matrix:");
        int c1=sc.nextInt();
        System.out.println("Enter row of 2nd matrix:");
        int r2=sc.nextInt();
        System.out.println("Enter col of 2nd matrix:");
        int c2=sc.nextInt();
        int [][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];
        int [][] mul=new int[r1][c2];
        System.out.println("Enter ele:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Multiplication of two matrix is:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                mul[i][j]=0;
                for(int k=0;k<c1;k++){
                    mul[i][j]=mul[i][j]+a[i][k]*b[k][j];
                }
                System.out.print(mul[i][j]+" ");
            }
            System.out.println();
        }
    }
}