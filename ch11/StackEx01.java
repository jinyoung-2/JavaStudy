package 자바의정석.ch11;

import java.util.Stack;

public class StackEx01 {
    public static Stack<String> back = new Stack<>();
    public static Stack<String> forward = new Stack<>();

    public static void main(String[] args) {
        goURL("1. 네이트");
        goURL("2. 야후");
        goURL("3. 네이버");
        goURL("4. 다음");

        printStatus();

        goBack();
        System.out.println("=뒤로가기 버튼 누른 후=");
        printStatus();

        goForward();
        System.out.println("=앞으로가기 버튼 누른 후=");
        printStatus();

    }

    public static void printStatus(){
        System.out.println("back: "+back);
        System.out.println("forward: "+forward);
        System.out.println("현재화면은 '"+back.peek()+"' 입니다.");
        System.out.println();
    }

    public static void goURL(String URL){
        back.push(URL);
        if(!forward.empty())
            forward.clear();
    }

    public static void goBack(){
        if(!back.empty())
            forward.push(back.pop());
    }

    public static void goForward(){
        if(!forward.empty())
            back.push(forward.pop());
    }
}