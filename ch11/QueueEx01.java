package 자바의정석.ch11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx01 {
    static Queue q = new LinkedList();
    private static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
        while(true){
            System.out.print(">>");
            try{
                String cmd = in.nextLine().trim();  //앞뒤 공백만 제거

                if(cmd.equals(""))
                    continue;
                if(cmd.equalsIgnoreCase("q")){
                    System.exit(0);
                }
                else if(cmd.equalsIgnoreCase("help")){
                    System.out.println("help - 도움말 보여주기");
                    System.out.println("q 또는 Q - 프로그램 종료");
                    System.out.println("history - 최근에 입력한 명령어 "+MAX_SIZE+"개 보여주기");
                }
                else if(cmd.equalsIgnoreCase("history")){
//                    for(int i=0;i<q.size();i++){
//                        //덱을 이용하던지 아니면 큐를 이용하든지 -> 우선 후자를 선택
//                        System.out.println(i+1+"."+q.peek());
//                        q.offer(q.poll());
//                    }
                    int i=0;
                    save(cmd);

                    Iterator<String> it = q.iterator();
                    while (it.hasNext()){
                        System.out.println(++i+"."+it.next());
                    }
                }
                else{
                    save(cmd);
                    System.out.println(cmd);
                }
            }catch (Exception e){
                System.out.println("입력오류");
            }//try
        }//while

    }

    public static void save(String cmd){
        if(!cmd.equals(""))
            q.offer(cmd);

        if(q.size() > MAX_SIZE){
            q.remove();
        }
    }
}
