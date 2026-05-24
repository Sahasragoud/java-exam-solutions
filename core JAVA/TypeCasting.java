import java.util.Scanner;

class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Double-Int Converter");
        System.out.println("1. Double to Int Converter");
        System.out.println("2. Int to Double Converter");
        System.out.print("Choose 1 or 2 : ");
        int op = sc.nextInt();
        if(op == 1){
            System.out.print("Enter a digit: ");
            int num = sc.nextInt();
            double d = (double)num;
            System.out.println("Converted to double: " + d);
        }
        else if(op == 2) {
            System.out.print("Enter a decimal: ");
            double d = sc.nextDouble();
            int num = (int) d;
            System.out.println("Converted to int: " + num);
        }
        
        else {
            System.out.println("Invalid choice");
        }
    }
}
