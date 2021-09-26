package 자바의정석.ch11;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx01 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(new Integer(5));   // list.add(5);
        list.add(new Integer(4));

        ArrayList<Integer> list2 = new ArrayList<>(list.subList(0,1));

        Collections.sort(list);
        Collections.sort(list2);

        //list가 list2의 모든요소를 포함하는지 확인
        System.out.println(list.contains(list2));

        list2.add(1);
        list2.set(0,7);
        //겹치는 부분만 남기고, 나머지 삭제
        System.out.println(list.retainAll(list2));

        //list2에서 list에 포함된 객체들을 삭제
        for(int i=list.size()-1;i>=0;i--){
            if(list2.contains(list.get(i))){
                list2.remove(i);
            }
        }
        //list에서 list2에 포함된 객체들을 삭제
        for(int i=list2.size()-1;i>=0;i--){
            if(list.contains(list2.get(i)))
                list.remove(i);
        }

    }
}
