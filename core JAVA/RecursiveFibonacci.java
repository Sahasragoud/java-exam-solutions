
import java.util.Scanner;
class RecursiveFibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive integer : ");
        int n = sc.nextInt();
        
        if(n < 0)  System.out.println("Invalid insertion");
        else {
            System.out.println("nth Fibonacci number=" + fibonacci(n));
        }
    }
    
    public static int fibonacci(int n) {
        if(n == 0 || n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
     }
}











