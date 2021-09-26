package 자바의정석.ch11;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackEx02 {
    public static void main(String[] args) {
        String str = "((2+3)*1)+3";
        Stack<String> st = new Stack();

        try{
            for(int i=0;i<str.length();i++){
                char ch = str.charAt(i);
                if(ch=='('){
                    st.push(ch+"");
                }else if(ch == ')'){
                    st.pop();
                }
            }
            if(st.empty()){
                System.out.println("괄호 일치");
            }else{
                System.out.println("괄호 불일치");
            }
        }catch(EmptyStackException err){
            System.out.println("괄호 불일치");
        }//try
    }
}
