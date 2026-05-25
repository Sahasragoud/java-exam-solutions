import java.util.*;

class ArrayListExample  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter names (type 'exit' to stop):");
        ArrayList<String> ls = new ArrayList<>();
        while(true){
             String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            ls.add(input);
        }
        
        for(String s : ls){
            System.out.println(s);
        }
    }
}
