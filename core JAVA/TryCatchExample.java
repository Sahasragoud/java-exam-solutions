import java.util.Scanner;

class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number1: ");
        int a = sc.nextInt();

        System.out.print("Enter the number2: ");
        int b = sc.nextInt();        
        
        try {
            int result = a / b;
            System.out.println("Result=" + result);
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());
        }
    }
}

