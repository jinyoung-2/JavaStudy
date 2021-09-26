package 자바의정석.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intStream = list.stream();  //list를 Stream으로 변환
        intStream.forEach(System.out::print);       //forEach() 최종연산

        // Stream은 1회용. Stream에 대해 최종연산을 수행하면 Stream이 닫힌다.
        intStream = list.stream();                  //list로부터 Stream을 재생성
        intStream.forEach(System.out::print);       //forEach() 최종연산
        System.out.println();

        String[] strArr = new String[]{"a","b","c"};
//        Stream<String> stringStream = Stream.of( strArr);
        Stream<String> stringStream = Arrays.stream(strArr);
        stringStream.forEach(System.out::println);

        int[] intArr = {1,2,3,4,5};
        IntStream intStream1 = Arrays.stream(intArr);
        intStream1.forEach(System.out::println);

//        Integer[] intArr = {1,2,3,4,5};
//        Stream<Integer> intStream1 = Arrays.stream(intArr);
//        intStream1.forEach(System.out::println);
    }
}
