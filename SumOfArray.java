//calculate the sum of array elements

public class SumOfArray {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;

        
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println(sum);
    }
}
//input take a odd numbeer n = 54969
//output count of digits = 4
//outtput sum of digits = 33
//output middle digit = 9

int n = 54969;
int count = 0 ;
int sum = 0;
int middleDigit = 0;



while(n!= 0){
    int digit = n % 10;
    sum += digit;
    count++;
    n /= 10;
}

