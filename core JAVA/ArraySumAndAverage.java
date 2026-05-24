
import java.util.Scanner;
class   ArraySumAndAverage   {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum/n);
    }
}











