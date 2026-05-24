
class OperatorPrecedence  {
    public static void main(String[] args) {
        
        int rep1 = 10 - 8 + 6;
        int rep2 = 10 + 6 - 8;
        System.out.println("Result=" + rep1 + " " + "Result=" + rep2);
        System.out.println("-- Addition and Subtraction are having same precedence. To perform operation compiler moves from left to right");
        int exp = 10 + 5 * 2;
        System.out.println("Result=" + exp);
        System.out.println("-- Multiplication first then addition");
        
        int mem1 = 9 * 3 + 10 / 2;
        int mem2 = 9 * 3 - 10 / 2;
        System.out.println("Result=" + mem1 + " " + "Result=" + mem2);
        System.out.println("-- Division is first then addition/subtraction");
        
        int sep1 = 10 / 2 * 6;
        int sep2= 6 * 10 / 2;
        System.out.println("Result=" + sep1 + " " + "Result=" + sep2);
        System.out.println("-- Multiplication and Division are having same precedence. To perform operation compiler moves from left to right");
        
        int mod1 = 105 % 2 * 12;
        int mod2 = 105 * 2 % 12;
        System.out.println("Result=" + mod1 + " " + "Result=" + mod2);
        System.out.println("-- Multiplication and Modulus are having same precedence. To perform operation compiler moves from left to right");
        
        int mul1 = 9 % 6 / 3;
        int mul2 = 9 / 6 % 3;
        System.out.println("Result=" + mul1 + " " + "Result=" + mul2);
        System.out.println("-- Modulus and Division are having same precedence. To perform operation compiler moves from left to right");
        
        int par1 = (10 / 3 ) * 8;
        int par2 = (10 + 3 ) - 8;
        System.out.println("Result=" + par1 + " " + "Result=" + par2);
        System.out.println("-- Parenthesis first then Multiplication");

        System.out.println("Thus Precedence :  {'()'}, {'*', '/', '%'} > {'+', '-'}");
    }
}
