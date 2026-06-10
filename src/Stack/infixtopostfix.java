package Stack;

import java.util.*;
public class infixtopostfix {
    static int precedence(char ch) {
        if (ch=='^') return 3;
        if (ch=='*' || ch=='/') return 2;
        if (ch=='+' || ch=='-') return 1;
        return -1;
    }

    public static String convert(String str) {
        StringBuilder sb = new StringBuilder("");
        Stack<Character>  stk = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stk.push(ch);
            }
            else if(ch=='('){
                stk.push(ch);
            }
            else if(ch==')'){
                while(!stk.isEmpty() && stk.peek()!='('){
                    sb.append(stk.pop());
                }
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
            else{
                while(!stk.isEmpty()  && stk.peek()!='(' && precedence(stk.peek())>=precedence(ch)){
                    sb.append(stk.pop());
                }
                stk.push(ch);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Infix Expression: ");

        String str = sc.nextLine();

        System.out.println("Postfix: " + convert(str));

    }

}
