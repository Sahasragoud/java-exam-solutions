import java.util.Scanner;
class PalindromeChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        boolean isPalin = true;
        
        int s = 0, e = str.length()-1;
        while(s < e){
            if(str.charAt(s) != str.charAt(e)){
                isPalin = false;
                break;
            }
            s++; e--;
        }
        
        if(isPalin) System.out.println("Pallindrome");
        else System.out.println("Not Pallindrome");
    }
}











