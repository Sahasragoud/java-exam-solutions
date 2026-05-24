
import java.util.Scanner;
class StringReversal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String s = sc.nextLine();
        
        StringBuilder st = new StringBuilder("");
        for(int i = s.length()-1; i >= 0; i--){
            st.append(s.charAt(i));
        }
        
        System.out.println("Reverse = " + st.toString());
    }
}











