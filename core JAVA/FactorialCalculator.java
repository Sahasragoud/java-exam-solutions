import java.util.Scanner;
class FactorialCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number(non-zero): ");
        int num = sc.nextInt();
        
        if(num > 0){
            int fact = 1;
            for(int i = 1; i <= num; i++){
                fact *= i;
            }
            System.out.println("Factorial : "  + fact);
        }
        else System.out.println("Invalid operation");
    }
}
